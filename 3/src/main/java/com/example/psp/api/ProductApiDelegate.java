package com.example.psp.api;

import com.example.psp.model.ProductDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProductApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface ProductApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /product : Get a list of products.
     *
     * @param materialId Parameter to return all products that contain one or more specified materials. (optional)
     * @param categoryId Parameter to return all products that belong in one or more specified categories. (optional)
     * @param brandId Parameter to return all products assigned to specific brands. (optional)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * @see ProductApi#productGet
     */
    default ResponseEntity<List<ProductDTO>> productGet(List<Integer> materialId,
        List<Integer> categoryId,
        List<Integer> brandId,
        Integer pageSize,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tax_rate_id\" : 5, \"unit\" : \"unit\", \"materials\" : [ { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }, { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 } ], \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"categories\" : [ { \"category_id\" : \"category_id\", \"product_id\" : 9 }, { \"category_id\" : \"category_id\", \"product_id\" : 9 } ], \"brand_id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /product : Create product.
     *
     * @param productDTO  (optional)
     * @return Success (status code 200)
     *         or If some product details are missing. (status code 400)
     * @see ProductApi#productPost
     */
    default ResponseEntity<Void> productPost(ProductDTO productDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /product/{productId} : Delete product by id.
     *
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductApi#productProductIdDelete
     */
    default ResponseEntity<Void> productProductIdDelete(Integer productId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /product/{productId} : Get product by Id.
     *
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductApi#productProductIdGet
     */
    default ResponseEntity<ProductDTO> productProductIdGet(Integer productId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tax_rate_id\" : 5, \"unit\" : \"unit\", \"materials\" : [ { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }, { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 } ], \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"categories\" : [ { \"category_id\" : \"category_id\", \"product_id\" : 9 }, { \"category_id\" : \"category_id\", \"product_id\" : 9 } ], \"brand_id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /product/{productId} : Update product by id.
     *
     * @param productId  (required)
     * @param productDTO  (optional)
     * @return Success (status code 200)
     *         or If some product details are missing. (status code 400)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductApi#productProductIdPut
     */
    default ResponseEntity<Void> productProductIdPut(Integer productId,
        ProductDTO productDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
