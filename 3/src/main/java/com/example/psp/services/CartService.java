package com.example.psp.services;

import com.example.psp.dto.*;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    public CartDTO cartCartIdGet(Integer cartId, User user) {
        return null;
    }

    public OrderDTO cartCartIdOrderPost(Integer cartId, User user) {
        return null;
    }

    public CartItemDTO cartCartIdPost(Integer cartId, AddCartItemDTO addCartItemDTO, User user) {
        return null;
    }

    public void cartItemCartItemIdDelete(Integer cartItemId, User user) {
    }

    public void cartItemItemIdPut(Integer itemId, CartItem cartItem, User user) {
    }

    public CartDTO cartPost(Integer body, User user) {
        return null;
    }
}
