package com.example.psp.services;

import com.example.psp.dto.BundleProductDTO;
import com.example.psp.mapper.BundleMapper;
import com.example.psp.model.Bundle;
import com.example.psp.model.BundleProduct;
import com.example.psp.repositories.BundleProductRepository;
import com.example.psp.repositories.BundleRepository;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BundleProductService {

    BundleProductRepository bundleProductRepository;
    BundleRepository bundleRepository;
    BundleMapper bundleMapper;
    public BundleProductService(BundleProductRepository bundleProductRepository, BundleMapper bundleMapper, BundleRepository bundleRepository) {
        this.bundleProductRepository = bundleProductRepository;
        this.bundleMapper = bundleMapper;
        this.bundleRepository = bundleRepository;
    }
    public void bundleProductPost(BundleProductDTO bundleProductDTO, User user) {
        Bundle bundle = bundleRepository.findById(bundleProductDTO.getBundleId()).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle does not belong to tenant");
        }
        List<BundleProduct> bundleProducts = bundle.getBundleProducts();
        bundleProducts.add(bundleMapper.mapBundleProductDTO(bundleProductDTO));
        bundle.setBundleProducts(bundleProducts);
        bundleProductRepository.save(bundleMapper.mapBundleProductDTO(bundleProductDTO));
        bundleRepository.save(bundle);
    }

    public void bundleProductBundleIdProductIdPut(Integer bundleId, Integer productId, BundleProductDTO bundleProductDTO, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle does not belong to tenant");
        }
        BundleProduct bundleProduct = bundleProductRepository.findById(productId).orElseThrow();
        bundleProduct.setQuantity(bundleProductDTO.getQuantity());
        bundleProductRepository.save(bundleProduct);
    }

    public BundleProductDTO bundleProductBundleIdProductIdGet(Integer bundleId, Integer productId, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle does not belong to tenant");
        }
        BundleProduct bundleProduct = bundleProductRepository.findById(productId).orElseThrow();
        return bundleMapper.mapBundleProduct(bundleProduct);
    }

    public void bundleProductBundleIdProductIdDelete(Integer bundleId, Integer productId, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle does not belong to tenant");
        }
        BundleProduct bundleProduct = bundleProductRepository.findById(productId).orElseThrow();
        bundleProductRepository.delete(bundleProduct);
    }

    public List<BundleProductDTO> bundleProductBundleIdGet(Integer bundleId, User user) {
        Bundle bundle = bundleRepository.findById(bundleId).orElseThrow();
        if (bundle.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Bundle does not belong to tenant");
        }
        return bundleMapper.mapBundleProducts(bundle.getBundleProducts());
    }
}

