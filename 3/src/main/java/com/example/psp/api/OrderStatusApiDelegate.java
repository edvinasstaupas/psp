package com.example.psp.api;

import com.example.psp.model.OrderStatusDTO;
import com.example.psp.model.OrderStatusTypes;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link OrderStatusApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface OrderStatusApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /order-status/{orderStatusId} : Deletes order status
     *
     * @param orderStatusId  (required)
     * @return If order status have been succesfully delete (status code 200)
     *         or If provided order status details do not pass the validation (status code 400)
     *         or If no order status ID matched the search (status code 404)
     * @see OrderStatusApi#orderStatusOrderStatusIdDelete
     */
    default ResponseEntity<Void> orderStatusOrderStatusIdDelete(Integer orderStatusId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /order-status/{orderStatusId} : Gets order status
     *
     * @param orderStatusId  (required)
     * @return Returns order status (status code 200)
     *         or If order status ID is less or equal to 0 (status code 400)
     *         or If no orderstatus ID matched the search (status code 404)
     * @see OrderStatusApi#orderStatusOrderStatusIdGet
     */
    default ResponseEntity<OrderStatusDTO> orderStatusOrderStatusIdGet(Integer orderStatusId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"orderId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /order-status/{orderStatusId} : Updates order status
     *
     * @param orderStatusId  (required)
     * @param newOrderStatus  (optional)
     * @return If order status have been succesfully updated (status code 200)
     *         or If the provided order status enum value is invalid (status code 400)
     *         or If no order status ID matched the search (status code 404)
     * @see OrderStatusApi#orderStatusOrderStatusIdPatch
     */
    default ResponseEntity<Void> orderStatusOrderStatusIdPatch(Integer orderStatusId,
        OrderStatusTypes newOrderStatus) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /order-status/{orderStatusId} : Updates order status
     *
     * @param orderStatusId  (required)
     * @param orderStatusDTO  (optional)
     * @return If order status have been succesfully updated (status code 200)
     *         or If provided order status details do not pass the validation (status code 400)
     *         or If no order status ID matched the search (status code 404)
     * @see OrderStatusApi#orderStatusOrderStatusIdPut
     */
    default ResponseEntity<Void> orderStatusOrderStatusIdPut(Integer orderStatusId,
        OrderStatusDTO orderStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /order-status : Creates order status
     *
     * @param orderStatusDTO  (optional)
     * @return If order status has been succesfully created (status code 201)
     *         or If provided order status details do not pass the validation (status code 400)
     * @see OrderStatusApi#orderStatusPost
     */
    default ResponseEntity<Void> orderStatusPost(OrderStatusDTO orderStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
