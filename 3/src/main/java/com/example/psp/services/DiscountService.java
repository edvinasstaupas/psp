package com.example.psp.services;

import com.example.psp.dto.*;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountService {

    public void discountPost(DiscountDto discountDto, User user) {
    }

    public List<Discount> discountPageSizePageNumberGet(Integer pageSize, Integer pageNumber, User user) {
        return null;
    }

    public void discountIdPut(Integer id, DiscountDto discountDto, User user) {
    }

    public DiscountDto discountIdGet(Integer id, User user) {
        return null;
    }

    public void discountAssignDiscountToItemPost(AssignDiscountToItemDTO assignDiscountToItemDTO, User user) {
    }

    public void discountAssignDiscountToCategoryPost(AssignDiscountToCategoryDTO assignDiscountToCategoryDTO, User user) {
    }

    public void discountAssignDiscountToBrandPost(AssignDiscountToBrandDTO assignDiscountToBrandDTO, User user) {
    }
}

