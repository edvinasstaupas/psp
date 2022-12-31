package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.CartDTO;
import com.example.psp.dto.CartItemDTO;
import com.example.psp.model.Cart;
import com.example.psp.model.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface CartMapper {

    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "cartItems", target = "items")
    CartDTO map(Cart source);

    List<CartItemDTO> mapCartItems(List<CartItem> cartItems);

    @Mapping(source = "cart.id", target = "cartId")
    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "product.name", target = "itemName")
    @Mapping(source = "product.price", target = "itemPrice")
    @Mapping(source = "bundle.id", target = "bundleId")
    CartItemDTO mapCartItem(CartItem cartItem);


}