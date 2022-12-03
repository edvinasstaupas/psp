package com.example.psp.api;

import com.example.psp.dto.ProductMaterial;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ProductMaterialApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface ProductMaterialApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /product-material : Assign material to a product.
     *
     * @param productMaterial  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     * @see ProductMaterialApi#productMaterialPost
     */
    default ResponseEntity<Void> productMaterialPost(ProductMaterial productMaterial) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /product-material/{productId} : Get list of product&#39;s all assigned materials by product Id.
     *
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see ProductMaterialApi#productMaterialProductIdGet
     */
    default ResponseEntity<List<ProductMaterial>> productMaterialProductIdGet(Integer productId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /product-material/{productId}/{materialId} : Delete product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId  (required)
     * @return Success (status code 200)
     *         or If material with such id is not assigned to product with such id. (status code 404)
     * @see ProductMaterialApi#productMaterialProductIdMaterialIdDelete
     */
    default ResponseEntity<Void> productMaterialProductIdMaterialIdDelete(Integer productId,
        Integer materialId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /product-material/{productId}/{materialId} : Get product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId  (required)
     * @return Success (status code 200)
     *         or If material with such id is not assigned to product with such id. (status code 404)
     * @see ProductMaterialApi#productMaterialProductIdMaterialIdGet
     */
    default ResponseEntity<ProductMaterial> productMaterialProductIdMaterialIdGet(Integer productId,
        Integer materialId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /product-material/{productId}/{materialId} : Update product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId  (required)
     * @param productMaterial  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     *         or If material with such id is not assigned to product with such id. (status code 404)
     * @see ProductMaterialApi#productMaterialProductIdMaterialIdPut
     */
    default ResponseEntity<Void> productMaterialProductIdMaterialIdPut(Integer productId,
        Integer materialId,
        ProductMaterial productMaterial) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
