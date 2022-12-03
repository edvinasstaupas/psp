package com.example.psp.api;

import com.example.psp.dto.BundleProduct;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link BundleProductApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface BundleProductApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /bundle-product/{bundleId} : Get list of bundle&#39;s all assigned products by bundle Id.
     *
     * @param bundleId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     * @see BundleProductApi#bundleProductBundleIdGet
     */
    default ResponseEntity<List<BundleProduct>> bundleProductBundleIdGet(Integer bundleId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /bundle-product/{bundleId}/{productId} : Delete bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     * @see BundleProductApi#bundleProductBundleIdProductIdDelete
     */
    default ResponseEntity<Void> bundleProductBundleIdProductIdDelete(Integer bundleId,
        Integer productId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /bundle-product/{bundleId}/{productId} : Get bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     * @see BundleProductApi#bundleProductBundleIdProductIdGet
     */
    default ResponseEntity<BundleProduct> bundleProductBundleIdProductIdGet(Integer bundleId,
        Integer productId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /bundle-product/{bundleId}/{productId} : Update bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @param bundleProduct  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     * @see BundleProductApi#bundleProductBundleIdProductIdPut
     */
    default ResponseEntity<Void> bundleProductBundleIdProductIdPut(Integer bundleId,
        Integer productId,
        BundleProduct bundleProduct) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /bundle-product : Assign product to a bundle.
     *
     * @param bundleProduct  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     * @see BundleProductApi#bundleProductPost
     */
    default ResponseEntity<Void> bundleProductPost(BundleProduct bundleProduct) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
