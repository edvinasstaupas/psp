package com.example.psp.services;

import com.example.psp.dto.ProductDTO;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<ProductDTO> productGet(List<Integer> materialId, List<Integer> categoryId, List<Integer> brandId, Integer pageSize, Integer page, User user) {
        return null;
    }

    public void productPost(ProductDTO productDTO, User user) {
    }

    public void productProductIdDelete(Integer productId, User user) {
    }

    public ProductDTO productProductIdGet(Integer productId, User user) {
        return null;
    }

    public void productProductIdPut(Integer productId, ProductDTO productDTO, User user) {
    }
}
