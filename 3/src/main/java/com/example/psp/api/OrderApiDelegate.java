package com.example.psp.api;

import com.example.psp.model.CreateOrderDTO;
import com.example.psp.model.OrderDTO;
import com.example.psp.model.PaymentDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link OrderApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
public interface OrderApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /Order/{teantId}/Cart/{cartId}/Order : Creates and order from a cart.
     *
     * @param cartId Id of the cart. (required)
     * @param teantId  (required)
     * @param tenantId Id of the tenant. (optional)
     * @return Returns information of the newly created order. (status code 200)
     *         or If cart doesn&#39;t exists. (status code 404)
     * @see OrderApi#orderTeantIdCartCartIdOrderPost
     */
    default ResponseEntity<OrderDTO> orderTeantIdCartCartIdOrderPost(Integer cartId,
        String teantId,
        Integer tenantId) {
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
     * GET /Order/{tenantId}/Order/{orderId} : Gets order by id.
     *
     * @param tenantId Id of the tenant. (required)
     * @param orderId Id of the order. (required)
     * @return Returns order information. (status code 200)
     *         or If order doesn&#39;t exist. (status code 404)
     * @see OrderApi#orderTenantIdOrderOrderIdGet
     */
    default ResponseEntity<OrderDTO> orderTenantIdOrderOrderIdGet(Integer tenantId,
        Integer orderId) {
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
     * POST /Order/{tenantId}/Order/{orderId}/Payment : Links a payment to an order.
     *
     * @param tenantId Id of the tenant. (required)
     * @param orderId Id of the order. (required)
     * @param paymentDTO Payment information. (optional)
     * @return Returns payment information. (status code 200)
     *         or If paid with digital money, but change field is filled. (status code 400)
     *         or If order doesn&#39;t exists. (status code 404)
     * @see OrderApi#orderTenantIdOrderOrderIdPaymentPost
     */
    default ResponseEntity<PaymentDTO> orderTenantIdOrderOrderIdPaymentPost(Integer tenantId,
        Integer orderId,
        PaymentDTO paymentDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"orderId\" : 7, \"change\" : 4.965218492984954, \"ammount\" : 1.1730742509559433 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /Order/{tenantId}/Order/{orderId}/Refund : Refunds an order.
     * This endpoint can only be used by an authorised service providers.
     *
     * @param tenantId Id of the tenant. (required)
     * @param orderId Id of the order. (required)
     * @return Returns a response that order was refunded successfully. (status code 200)
     *         or If order doesn&#39;t exists. (status code 404)
     * @see OrderApi#orderTenantIdOrderOrderIdRefundPost
     */
    default ResponseEntity<Void> orderTenantIdOrderOrderIdRefundPost(Integer tenantId,
        Integer orderId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /Order/{tenantId}/Order : Creates and order.
     *
     * @param tenantId Id of the tenant. (required)
     * @param createOrderDTO Information required to create an order. (optional)
     * @return Returns information of the newly created order. (status code 200)
     * @see OrderApi#orderTenantIdOrderPost
     */
    default ResponseEntity<OrderDTO> orderTenantIdOrderPost(Integer tenantId,
        CreateOrderDTO createOrderDTO) {
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

}
