package com.example.psp.services;

import com.example.psp.dto.*;
import com.example.psp.dto.CartItem;
import com.example.psp.mapper.CartMapper;
import com.example.psp.mapper.OrderMapper;
import com.example.psp.model.*;
import com.example.psp.repositories.*;
import com.example.psp.security.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CartService {
    private final CartMapper cartMapper;
    private final OrderMapper orderMapper;
    private final CustomerRepository customerRepository;
    private final CartRepository cartRepository;
    private final TenantRepository tenantRepository;
    private final OrderRepository orderRepository;
    private final BundleRepository bundleRepository;
    private final ProductRepository productRepository;
    private final CartItemRepository cartItemRepository;
    public CartService(CartMapper cartMapper, OrderMapper orderMapper, CustomerRepository customerRepository, CartRepository cartRepository, TenantRepository tenantRepository, OrderRepository orderRepository, BundleRepository bundleRepository, ProductRepository productRepository, CartItemRepository cartItemRepository) {
        this.cartMapper = cartMapper;
        this.orderMapper = orderMapper;
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
        this.tenantRepository = tenantRepository;
        this.orderRepository = orderRepository;
        this.bundleRepository = bundleRepository;
        this.productRepository = productRepository;
        this.cartItemRepository = cartItemRepository;
    }

    public CartDTO cartCartIdGet(Integer cartId, User user) {
        Cart cart =  cartRepository.findCartById(cartId.toString());
        return cartMapper.map(cart);
    }

    public OrderDTO cartCartIdOrderPost(Integer cartId, User user) {
        Cart cart =  cartRepository.findCartById(cartId.toString());
        Customer customer = cart.getCustomer();

        Tenant tenant = tenantRepository.findTenantById(user.getTenantId());
        if(tenant == null) {
            throw new ResponseStatusException(
                    HttpStatus.FORBIDDEN, "user has no tenant assigned"
            );
        }

        Order order = new Order();
        order.setTenant(tenant);
        order.setCustomer(customer);
        order.setTipsAmount(BigDecimal.valueOf(0));
        order.setTotal(BigDecimal.valueOf(0));
        orderRepository.save(order);


        return orderMapper.map(order);
    }

    public CartItemDTO cartCartIdPost(Integer cartId, AddCartItemDTO addCartItemDTO, User user) {
        Cart cart = cartRepository.findCartById(cartId.toString());
        if(cart == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        if(addCartItemDTO.getBundleId().isPresent() && addCartItemDTO.getProductId().isPresent()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
        Bundle bundle = bundleRepository.findBundleById(addCartItemDTO.getBundleId().orElse(-1));
        Product product = productRepository.findProductById(addCartItemDTO.getProductId().orElse(-1));
        if((bundle == null && product == null)) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        com.example.psp.model.CartItem cartItem = new com.example.psp.model.CartItem();
        cartItem.setCart(cart);
        cartItem.setQuantity(addCartItemDTO.getQuantity());
        cartItem.setBundle(bundle);
        cartItem.setProduct(product);
        List<com.example.psp.model.CartItem> cartItems = cart.getCartItems();
        cartItems.add(cartItem);
        cart.setCartItems(cartItems);
        cartItemRepository.save(cartItem);
        CartItemDTO cartItemDTO = cartMapper.mapCartItem(cartItem);
        return cartItemDTO;
    }

    public void cartItemCartItemIdDelete(Integer cartItemId, User user) {
        com.example.psp.model.CartItem cartItem = cartItemRepository.findCartItemById(cartItemId);
        if(cartItem == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        cartItemRepository.delete(cartItem);
    }

    public void cartItemItemIdPut(Integer itemId, CartItem cartItemDTO, User user) {
        com.example.psp.model.CartItem cartItem = cartItemRepository.findCartItemById(itemId);
        if(cartItem == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        cartItem.setCart(cartItem.getCart());
        cartItem.setProduct(productRepository.findProductById(cartItemDTO.getProductId().orElse(0)));
        cartItem.setBundle(bundleRepository.findBundleById(cartItemDTO.getProductId().orElse(0)));
        cartItem.setQuantity(cartItemDTO.getQuantity());
        if(cartItem.getBundle() != null && cartItem.getProduct() != null) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
        cartItemRepository.save(cartItem);
    }

    public CartDTO cartPost(CartBodyDTO body, User user) {
        Customer customer = customerRepository.findCustomerById(body.getCustomerId());
        if(customer == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        Cart cart = new Cart();
        cart.setCustomer(customer);
        cart.setId(customer.getId().toString());
        cartRepository.save(cart);

        return cartMapper.map(cart);
    }
}
