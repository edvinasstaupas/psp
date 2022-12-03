package com.example.psp.api;

import com.example.psp.dto.Location;
import com.example.psp.dto.LocationDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link LocationApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface LocationApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /location/{id} : Endpoint to delete a business location.
     *
     * @param id Id of the business location to delete. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see LocationApi#locationIdDelete
     */
    default ResponseEntity<Void> locationIdDelete(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /location/{id} : Endpoint to get a single business location.
     *
     * @param id Id of the business location to get (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see LocationApi#locationIdGet
     */
    default ResponseEntity<LocationDto> locationIdGet(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"region\" : \"region\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"name\" : \"name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /location/{id} : Endpoint to update a business location.
     *
     * @param id Id of the business location to update. (required)
     * @param locationDto Business location to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see LocationApi#locationIdPut
     */
    default ResponseEntity<Void> locationIdPut(Integer id,
        LocationDto locationDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /location/{pageSize}/{pageNumber} : Endpoint to get multiple business locations.
     *
     * @param pageSize The maximum amount of business locations in response. (required)
     * @param pageNumber The page number of business locations to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see LocationApi#locationPageSizePageNumberGet
     */
    default ResponseEntity<List<Location>> locationPageSizePageNumberGet(Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"id\" : 1, \"region\" : \"region\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /location : Endpoint to create a new business location.
     *
     * @param locationDto Business location to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see LocationApi#locationPost
     */
    default ResponseEntity<Void> locationPost(LocationDto locationDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
