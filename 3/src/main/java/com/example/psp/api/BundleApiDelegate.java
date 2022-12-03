package com.example.psp.api;

import com.example.psp.dto.BundleDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link BundleApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface BundleApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /bundle/{bundleId} : Delete bundle by id.
     *
     * @param bundleId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     * @see BundleApi#bundleBundleIdDelete
     */
    default ResponseEntity<Void> bundleBundleIdDelete(Integer bundleId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /bundle/{bundleId} : Get bundle by Id.
     *
     * @param bundleId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     * @see BundleApi#bundleBundleIdGet
     */
    default ResponseEntity<BundleDTO> bundleBundleIdGet(Integer bundleId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"products\" : [ { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }, { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /bundle/{bundleId} : Update bundle by id.
     *
     * @param bundleId  (required)
     * @param bundleDTO  (optional)
     * @return Success (status code 200)
     *         or If some bundle details are missing. (status code 400)
     *         or If bundle with such id does not exist. (status code 404)
     * @see BundleApi#bundleBundleIdPut
     */
    default ResponseEntity<Void> bundleBundleIdPut(Integer bundleId,
        BundleDTO bundleDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /bundle : Get a list of bundles.
     *
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * @see BundleApi#bundleGet
     */
    default ResponseEntity<List<BundleDTO>> bundleGet(Integer pageSize,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"products\" : [ { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }, { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /bundle : Create bundle.
     *
     * @param bundleDTO  (optional)
     * @return Success (status code 200)
     *         or If some bundle details are missing. (status code 400)
     * @see BundleApi#bundlePost
     */
    default ResponseEntity<Void> bundlePost(BundleDTO bundleDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
