package com.example.psp.api;

import com.example.psp.dto.Service;
import com.example.psp.dto.ServiceDto;
import com.example.psp.dto.ServiceFilterDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ServiceApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface ServiceApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /service/{id} : Endpoint to delete a service.
     *
     * @param id Id of the service to delete. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see ServiceApi#serviceIdDelete
     */
    default ResponseEntity<Void> serviceIdDelete(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /service/{id} : Endpoint to get a single service.
     *
     * @param id Id of the service to get (required)
     * @return Success (status code 200)
     *         or Not Found (status code 404)
     * @see ServiceApi#serviceIdGet
     */
    default ResponseEntity<Service> serviceIdGet(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"tenantId\" : 6, \"name\" : \"name\", \"durationMins\" : 1, \"id\" : 0, \"taxRateId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /service/{id} : Endpoint to update a service.
     *
     * @param id Id of the service to update. (required)
     * @param serviceDto Service to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see ServiceApi#serviceIdPut
     */
    default ResponseEntity<Void> serviceIdPut(Integer id,
        ServiceDto serviceDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /service/{pageSize}/{pageNumber} : Endpoint to get multiple services.
     *
     * @param pageSize The maximum amount of services in response. (required)
     * @param pageNumber The page number of services to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     * @see ServiceApi#servicePageSizePageNumberGet
     */
    default ResponseEntity<List<Service>> servicePageSizePageNumberGet(Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"tenantId\" : 6, \"name\" : \"name\", \"durationMins\" : 1, \"id\" : 0, \"taxRateId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /service/{pageSize}/{pageNumber} : Endpoint to get multiple services with applied filter.
     *
     * @param pageSize The maximum amount of services in response. (required)
     * @param pageNumber The page number of services to return. (required)
     * @param serviceFilterDto Filter to apply to the services. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     * @see ServiceApi#servicePageSizePageNumberPost
     */
    default ResponseEntity<List<Service>> servicePageSizePageNumberPost(Integer pageSize,
        Integer pageNumber,
        ServiceFilterDto serviceFilterDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"tenantId\" : 6, \"name\" : \"name\", \"durationMins\" : 1, \"id\" : 0, \"taxRateId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /service : Endpoint to create a new service.
     *
     * @param serviceDto Service to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see ServiceApi#servicePost
     */
    default ResponseEntity<Void> servicePost(ServiceDto serviceDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
