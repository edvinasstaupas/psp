package com.example.psp.services;

import com.example.psp.dto.BundleDTO;
import com.example.psp.dto.BundleProductDTO;
import com.example.psp.mapper.BundleMapper;
import com.example.psp.model.Bundle;
import com.example.psp.model.Tenant;
import com.example.psp.repositories.BundleRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.User;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BundleService {

    BundleRepository bundleRepository;
    TenantRepository tenantRepository;
    BundleMapper bundleMapper;

    public BundleService(BundleRepository bundleRepository, TenantRepository tenantRepository, BundleMapper bundleMapper) {
        this.bundleRepository = bundleRepository;
        this.bundleMapper = bundleMapper;
        this.tenantRepository = tenantRepository;
    }


    public void bundleBundleIdDelete(Integer bundleId, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle does not belong to tenant");
        }
        bundleRepository.deleteById(bundleId);
    }

    public BundleDTO bundleBundleIdGet(Integer bundleId, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle not found");
        }
        return bundleMapper.map(bundle);
    }

    public void bundleBundleIdPut(Integer bundleId, BundleDTO bundleDTO, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElse(null);
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("User is not allowed to update this bundle");
        }
        bundle.setName(bundleDTO.getName());
        bundle.setPrice(BigDecimal.valueOf(bundleDTO.getPrice()));
        bundle.setBundleProducts(bundleMapper.mapBundleProductDTOs(bundleDTO.getProducts()));
        bundleRepository.save(bundle);
    }

    public List<BundleDTO> bundleGet(Integer pageSize, Integer page, User user) {
        List<BundleDTO> filtered = bundleRepository.findAll().stream()
                .filter(bundle -> bundle.getTenant().getId() == user.getTenantId()).map(bundleMapper::map).toList();
        if (pageSize != null && page != null) {
            return filtered.subList(page * pageSize, Math.min(filtered.size(), (page + 1) * pageSize));
        }
        return filtered;
    }

    public void bundlePost(BundleDTO bundleDTO, User user) {
        Tenant tenant = tenantRepository.findById(user.getTenantId()).orElseThrow();
        Bundle bundle = new Bundle();
        bundle.setTenant(tenant);
        bundle.setName(bundleDTO.getName());
        bundle.setPrice(BigDecimal.valueOf(bundleDTO.getPrice()));
        bundle.setBundleProducts(bundleMapper.mapBundleProductDTOs(bundleDTO.getProducts()));
        bundleRepository.save(bundle);
    }
}
