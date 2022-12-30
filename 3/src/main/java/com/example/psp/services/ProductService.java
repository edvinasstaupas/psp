package com.example.psp.services;

import com.example.psp.dto.ProductCategoryDTO;
import com.example.psp.dto.ProductDTO;
import com.example.psp.dto.ProductMaterialDTO;
import com.example.psp.mapper.ProductMapper;
import com.example.psp.model.Product;
import com.example.psp.model.Tenant;
import com.example.psp.repositories.ProductRepository;
import com.example.psp.repositories.TenantRepository;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ProductService {

    ProductRepository productRepository;
    TenantRepository tenantRepository;
    ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, TenantRepository tenantRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.tenantRepository = tenantRepository;
        this.productMapper = productMapper;
    }

    public List<ProductDTO> productGet(List<Integer> materialId, List<Integer> categoryId, List<Integer> brandId, Integer pageSize, Integer page, User user) {
        Stream<ProductDTO> products = productMapper.mapProducts(productRepository.findAll()).stream();
        if (materialId != null) {
            products = products.filter(product -> {
                List<ProductMaterialDTO> productMaterials = product.getMaterials();
                return productMaterials != null && productMaterials.stream().anyMatch(productMaterial -> materialId.contains(productMaterial.getMaterialId()));
            });
        }
        if (categoryId != null) {
            products = products.filter(product -> {
                List<ProductCategoryDTO> productCategories = product.getCategories();
                return productCategories != null && productCategories.stream().anyMatch(productCategory -> categoryId.contains(productCategory.getCategoryId()));
            });
        }
        if (brandId != null) {
            products = products.filter(product -> brandId.contains(product.getBrandId()));
        }
        if (pageSize != null && page != null) {
            products = products.skip(page * pageSize).limit(pageSize);
        }
        return products.toList();
    }

    public void productPost(ProductDTO productDTO, User user) {
        Product product = productMapper.map(productDTO);
        Tenant tenant = tenantRepository.findById(user.getTenantId()).orElseThrow();
        product.setTenant(tenant);
        productRepository.save(product);
    }

    public void productProductIdDelete(Integer productId, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to tenant");
        }
        productRepository.delete(product);
    }

    public ProductDTO productProductIdGet(Integer productId, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to tenant");
        }
        return productMapper.map(product);
    }

    public void productProductIdPut(Integer productId, ProductDTO productDTO, User user) {
        Product product = productRepository.findById(productId).orElseThrow();
        if (product.getTenant().getId() != user.getTenantId()) {
            throw new RuntimeException("Product does not belong to tenant");
        }
        Product newProduct = productMapper.map(productDTO);
        newProduct.setId(productId);
        newProduct.setTenant(product.getTenant());
        productRepository.save(newProduct);
    }
}
