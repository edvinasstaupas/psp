package com.example.psp.services;

import com.example.psp.dto.ProductMaterial;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductMaterialService {

    public void productMaterialPost(ProductMaterial productMaterial, User user) {
    }

    public List<ProductMaterial> productMaterialProductIdGet(Integer productId, User user) {
        return null;
    }

    public void productMaterialProductIdMaterialIdDelete(Integer productId, Integer materialId, User user) {
    }

    public ProductMaterial productMaterialProductIdMaterialIdGet(Integer productId, Integer materialId, User user) {
        return null;
    }

    public void productMaterialProductIdMaterialIdPut(Integer productId, Integer materialId, ProductMaterial productMaterial, User user) {
    }
}
