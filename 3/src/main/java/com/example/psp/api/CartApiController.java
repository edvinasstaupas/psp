package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.*;
import com.example.psp.security.User;
import com.example.psp.services.CartService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class CartApiController {

    private final CartService cartService;

    private final UserDetailsService userDetailsService;

    /**
     * GET /cart/{cartId} : Get a cart by id.
     *
     * @param cartId Id of the cart. (required)
     * @return Returns the cart. (status code 200)
     * or If cart doesn&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Get a cart by id.", nickname = "cartCartIdGet", notes = "", response = CartDTO.class, tags = {"Cart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns the cart.", response = CartDTO.class),
            @ApiResponse(code = 404, message = "If cart doesn't exist.")})
    @GetMapping(
            value = "/cart/{cartId}",
            produces = {"application/json"}
    )
    public ResponseEntity<CartDTO> cartCartIdGet(@ApiParam(value = "Id of the cart.", required = true) @PathVariable("cartId") Integer cartId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(cartService.cartCartIdGet(cartId, user));
    }


    /**
     * POST /cart/{cartId}/order : Creates and order from a cart.
     *
     * @param cartId Id of the cart. (required)
     * @return Returns information of the newly created order. (status code 200)
     * or If cart doesn&#39;t exists. (status code 404)
     */
    @ApiOperation(value = "Creates and order from a cart.", nickname = "cartCartIdOrderPost", notes = "", response = OrderDTO.class, tags = {"Order",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns information of the newly created order.", response = OrderDTO.class),
            @ApiResponse(code = 404, message = "If cart doesn't exists.")})
    @PostMapping(
            value = "/cart/{cartId}/order",
            produces = {"application/json"}
    )
    public ResponseEntity<OrderDTO> cartCartIdOrderPost(@ApiParam(value = "Id of the cart.", required = true) @PathVariable("cartId") Integer cartId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(cartService.cartCartIdOrderPost(cartId, user));
    }


    /**
     * POST /cart/{cartId} : Adds an item to a cart.
     *
     * @param cartId         Id of the cart. (required)
     * @param addCartItemDTO Item to be added to the cart. (optional)
     * @return Returns newly added cart item. (status code 200)
     * or If ids of both product and bundle are provided. (status code 400)
     * or If cart doen&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Adds an item to a cart.", nickname = "cartCartIdPost", notes = "", response = CartItemDTO.class, tags = {"Cart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns newly added cart item.", response = CartItemDTO.class),
            @ApiResponse(code = 400, message = "If ids of both product and bundle are provided."),
            @ApiResponse(code = 404, message = "If cart doen't exist.")})
    @PostMapping(
            value = "/cart/{cartId}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<CartItemDTO> cartCartIdPost(@ApiParam(value = "Id of the cart.", required = true) @PathVariable("cartId") Integer cartId, @ApiParam(value = "Item to be added to the cart.") @Valid @RequestBody(required = false) AddCartItemDTO addCartItemDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(cartService.cartCartIdPost(cartId, addCartItemDTO, user));
    }


    /**
     * DELETE /cart/item/{cartItemId} : Removes cart item from a cart.
     *
     * @param cartItemId Id of the cart item. (required)
     * @return Returns a response that cart item was removed successfully. (status code 200)
     * or If cart item doesn&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Removes cart item from a cart.", nickname = "cartItemCartItemIdDelete", notes = "", tags = {"Cart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns a response that cart item was removed successfully."),
            @ApiResponse(code = 404, message = "If cart item doesn't exist.")})
    @DeleteMapping(
            value = "/cart/item/{cartItemId}"
    )
    public ResponseEntity<Void> cartItemCartItemIdDelete(@ApiParam(value = "Id of the cart item.", required = true) @PathVariable("cartItemId") Integer cartItemId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        cartService.cartItemCartItemIdDelete(cartItemId, user);
        return RestUtils.ok();
    }


    /**
     * PUT /cart/item/{itemId} : Updates cart item.
     * If item quantity is set to 0, item should be removed from the cart.
     *
     * @param itemId   Id of the cart item. (required)
     * @param cartItem Cart item with updated information. (optional)
     * @return Returns cart item with updated information. (status code 200)
     * or If cart item doesn&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Updates cart item.", nickname = "cartItemItemIdPut", notes = "If item quantity is set to 0, item should be removed from the cart.", tags = {"Cart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns cart item with updated information."),
            @ApiResponse(code = 404, message = "If cart item doesn't exist.")})
    @PutMapping(
            value = "/cart/item/{itemId}",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> cartItemItemIdPut(@ApiParam(value = "Id of the cart item.", required = true) @PathVariable("itemId") Integer itemId, @ApiParam(value = "Cart item with updated information.") @Valid @RequestBody(required = false) CartItem cartItem, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        cartService.cartItemItemIdPut(itemId, cartItem, user);
        return RestUtils.ok();
    }


    /**
     * POST /cart : Creates a cart for a specified customer.
     *
     * @param body Id of the customer. (optional)
     * @return Returns newly created cart. (status code 200)
     * or If customer doesn&#39;t exists. (status code 404)
     */
    @ApiOperation(value = "Creates a cart for a specified customer.", nickname = "cartPost", notes = "", response = CartDTO.class, tags = {"Cart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns newly created cart.", response = CartDTO.class),
            @ApiResponse(code = 404, message = "If customer doesn't exists.")})
    @PostMapping(
            value = "/cart",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<CartDTO> cartPost(@ApiParam(value = "Id of the customer.") @Valid @RequestBody(required = false) CartBodyDTO body, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(cartService.cartPost(body, user));
    }

}
