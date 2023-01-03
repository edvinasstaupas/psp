package com.example.psp.services;

import com.example.psp.dto.MaterialDTO;
import com.example.psp.mapper.MaterialMapper;
import com.example.psp.model.Material;
import com.example.psp.model.Tenant;
import com.example.psp.repositories.MaterialRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    MaterialRepository materialRepository;
    TenantRepository tenantRepository;
    MaterialMapper materialMapper;

    public MaterialService(MaterialRepository materialRepository, TenantRepository tenantRepository, MaterialMapper materialMapper) {
        this.materialRepository = materialRepository;
        this.tenantRepository = tenantRepository;
        this.materialMapper = materialMapper;
    }

    public void materialPost(MaterialDTO materialDTO, User user) {
        Tenant tenant = tenantRepository.findById(user.getTenantId()).orElseThrow();
        Material material = materialMapper.map(materialDTO);
        material.setTenant(tenant);
        materialRepository.save(material);
    }

    public void materialMaterialIdPut(Integer materialId, MaterialDTO materialDTO, User user) {
        Material material = materialRepository.findById(materialId).orElseThrow();
        if (material.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Material not found");
        }
        Material newMaterial = materialMapper.map(materialDTO);
        newMaterial.setId(materialId);
        newMaterial.setTenant(material.getTenant());
        materialRepository.save(newMaterial);
    }

    public MaterialDTO materialMaterialIdGet(Integer materialId, User user) {
        Material material = materialRepository.findById(materialId).orElseThrow();
        if (material.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Material not found");
        }
        return materialMapper.map(material);
    }

    public void materialMaterialIdDelete(Integer materialId, User user) {
        Material material = materialRepository.findById(materialId).orElseThrow();
        if (material.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Material not found");
        }
        materialRepository.delete(material);
    }

    public List<MaterialDTO> materialGet(Integer pageSize, Integer page, User user) {
        List<Material> materials = materialRepository.findAllByTenantId(user.getTenantId());
        if (pageSize != null && page != null) {
            materials = materials.subList(page * pageSize, Math.min(materials.size(), (page + 1) * pageSize));
        }
        return materialMapper.mapMaterials(materials);
    }
}
