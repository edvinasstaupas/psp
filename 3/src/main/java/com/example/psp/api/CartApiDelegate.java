package com.example.psp.api;

import com.example.psp.model.AddCartItemDTO;
import com.example.psp.model.CartDTO;
import com.example.psp.model.CartItem;
import com.example.psp.model.CartItemDTO;
import com.example.psp.model.OrderDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link CartApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface CartApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /cart/{cartId} : Get a cart by id.
     *
     * @param cartId Id of the cart. (required)
     * @return Returns the cart. (status code 200)
     *         or If cart doesn&#39;t exist. (status code 404)
     * @see CartApi#cartCartIdGet
     */
    default ResponseEntity<CartDTO> cartCartIdGet(Integer cartId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"customerId\" : 6, \"lastAccessed\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"items\" : [ { \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 }, { \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /cart/{cartId}/order : Creates and order from a cart.
     *
     * @param cartId Id of the cart. (required)
     * @return Returns information of the newly created order. (status code 200)
     *         or If cart doesn&#39;t exists. (status code 404)
     * @see CartApi#cartCartIdOrderPost
     */
    default ResponseEntity<OrderDTO> cartCartIdOrderPost(Integer cartId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 1.0246457001441578, \"tipsAmmount\" : 5.962133916683182, \"customerId\" : 6, \"employeeId\" : 1, \"payment\" : { \"orderId\" : 7, \"change\" : 4.965218492984954, \"ammount\" : 1.1730742509559433 }, \"id\" : 0, \"items\" : [ { \"unitPrice\" : 2.027123023002322, \"discountRate\" : 4.145608029883936, \"taxRate\" : 7.386281948385884, \"total\" : 1.2315135367772556, \"notes\" : \"notes\", \"quantity\" : 3, \"productId\" : 2, \"bundleId\" : 9, \"name\" : \"name\", \"id\" : 5, \"serviceId\" : 7 }, { \"unitPrice\" : 2.027123023002322, \"discountRate\" : 4.145608029883936, \"taxRate\" : 7.386281948385884, \"total\" : 1.2315135367772556, \"notes\" : \"notes\", \"quantity\" : 3, \"productId\" : 2, \"bundleId\" : 9, \"name\" : \"name\", \"id\" : 5, \"serviceId\" : 7 } ], \"status\" : { \"orderId\" : 6, \"id\" : 1 } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /cart/{cartId} : Adds an item to a cart.
     *
     * @param cartId Id of the cart. (required)
     * @param addCartItemDTO Item to be added to the cart. (optional)
     * @return Returns newly added cart item. (status code 200)
     *         or If ids of both product and bundle are provided. (status code 400)
     *         or If cart doen&#39;t exist. (status code 404)
     * @see CartApi#cartCartIdPost
     */
    default ResponseEntity<CartItemDTO> cartCartIdPost(Integer cartId,
        AddCartItemDTO addCartItemDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /cart/item/{cartItemId} : Removes cart item from a cart.
     *
     * @param cartItemId Id of the cart item. (required)
     * @return Returns a response that cart item was removed successfully. (status code 200)
     *         or If cart item doesn&#39;t exist. (status code 404)
     * @see CartApi#cartItemCartItemIdDelete
     */
    default ResponseEntity<Void> cartItemCartItemIdDelete(Integer cartItemId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /cart/item/{itemId} : Updates cart item.
     * If item quantity is set to 0, item should be removed from the cart.
     *
     * @param itemId Id of the cart item. (required)
     * @param cartItem Cart item with updated information. (optional)
     * @return Returns cart item with updated information. (status code 200)
     *         or If cart item doesn&#39;t exist. (status code 404)
     * @see CartApi#cartItemItemIdPut
     */
    default ResponseEntity<Void> cartItemItemIdPut(Integer itemId,
        CartItem cartItem) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /cart : Creates a cart for a specified customer.
     *
     * @param body Id of the customer. (optional)
     * @return Returns newly created cart. (status code 200)
     *         or If customer doesn&#39;t exists. (status code 404)
     * @see CartApi#cartPost
     */
    default ResponseEntity<CartDTO> cartPost(Integer body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"customerId\" : 6, \"lastAccessed\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"items\" : [ { \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 }, { \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
