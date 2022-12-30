package com.example.psp.services;

import com.example.psp.dto.ProductMaterialDTO;
import com.example.psp.mapper.ProductMapper;
import com.example.psp.model.Product;
import com.example.psp.model.ProductMaterial;
import com.example.psp.repositories.ProductMaterialRepository;
import com.example.psp.repositories.ProductRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMaterialService {

    ProductMaterialRepository productMaterialRepository;
    ProductRepository productRepository;
    ProductMapper productMapper;

    public ProductMaterialService(ProductRepository productRepository, ProductMaterialRepository productMaterialRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMaterialRepository = productMaterialRepository;
        this.productMapper = productMapper;
    }

    public void productMaterialPost(ProductMaterialDTO productMaterialDTO, User user) {
        Product product = productRepository.findById(productMaterialDTO.getProductId()).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to this tenant");
        }
        productMaterialRepository.save(productMapper.mapProductMaterialDTO(productMaterialDTO));
    }

    public List<ProductMaterialDTO> productMaterialProductIdGet(Integer productId, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to this tenant");
        }
        return productMapper.mapProductMaterials(productMaterialRepository.findAllByProductId(productId));
    }

    public void productMaterialProductIdMaterialIdDelete(Integer productId, Integer materialId, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to this tenant");
        }
        productMaterialRepository.deleteById(materialId);
    }

    public ProductMaterialDTO productMaterialProductIdMaterialIdGet(Integer productId, Integer materialId, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to this tenant");
        }
        return productMapper.mapProductMaterial(productMaterialRepository.findById(materialId).orElseThrow());
    }

    public void productMaterialProductIdMaterialIdPut(Integer productId, Integer materialId, ProductMaterialDTO productMaterialDTO, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to this tenant");
        }
        ProductMaterial newProductMaterial = productMapper.mapProductMaterialDTO(productMaterialDTO);
        newProductMaterial.setId(materialId);
        productMaterialRepository.save(newProductMaterial);
    }
}
