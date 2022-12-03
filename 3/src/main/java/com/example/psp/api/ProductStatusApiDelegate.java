package com.example.psp.api;

import com.example.psp.model.ProductStatusDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ProductStatusApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface ProductStatusApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /product-status/ : Create product status.
     *
     * @param productStatusDTO  (optional)
     * @return Success (status code 200)
     *         or If some product status details are missing. (status code 400)
     * @see ProductStatusApi#productStatusPost
     */
    default ResponseEntity<Void> productStatusPost(ProductStatusDTO productStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /product-status//{productId} : Delete product status by id.
     *
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductStatusApi#productStatusProductIdDelete
     */
    default ResponseEntity<Void> productStatusProductIdDelete(Integer productId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /product-status//{productId} : Get product status by Id.
     *
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductStatusApi#productStatusProductIdGet
     */
    default ResponseEntity<ProductStatusDTO> productStatusProductIdGet(Integer productId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"available_quantity\" : 6, \"product_id\" : 0, \"is_disabled\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /product-status//{productId} : Update product status by id (Enable/Disable, update quantity).
     *
     * @param productId  (required)
     * @param productStatusDTO  (optional)
     * @return Success (status code 200)
     *         or If some product status details are missing. (status code 400)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductStatusApi#productStatusProductIdPut
     */
    default ResponseEntity<Void> productStatusProductIdPut(Integer productId,
        ProductStatusDTO productStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
