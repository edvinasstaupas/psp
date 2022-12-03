package com.example.psp.api;

import com.example.psp.model.CreateTenantAccountDTO;
import com.example.psp.model.CredentialsDto;
import com.example.psp.model.TenantAccountDetailsDTO;
import com.example.psp.model.TokenDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link TenantApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
public interface TenantApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /Tenant : Endpoint to delete a store.
     *
     * @param tenantId Id of the store. (optional)
     * @return Success (status code 200)
     * @see TenantApi#tenantDelete
     */
    default ResponseEntity<Void> tenantDelete(Integer tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /Tenant/login : Endpoint to login to a store.
     *
     * @param credentialsDto  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     * @see TenantApi#tenantLoginPost
     */
    default ResponseEntity<TokenDTO> tenantLoginPost(CredentialsDto credentialsDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tenantId\" : 0, \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /Tenant : Endpoint to create a new store.
     *
     * @param createTenantAccountDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     * @see TenantApi#tenantPost
     */
    default ResponseEntity<Void> tenantPost(CreateTenantAccountDTO createTenantAccountDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /Tenant/{tenantId} : Endpoint to get the details of a store.
     *
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantApi#tenantTenantIdGet
     */
    default ResponseEntity<TenantAccountDetailsDTO> tenantTenantIdGet(Integer tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"phoneNumber\" : \"phoneNumber\", \"name\" : \"name\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /Tenant/{tenantId} : Endpoint to update a store.
     *
     * @param tenantId Id of the store. (required)
     * @param createTenantAccountDTO  (optional)
     * @return Success (status code 200)
     * @see TenantApi#tenantTenantIdPut
     */
    default ResponseEntity<Void> tenantTenantIdPut(Integer tenantId,
        CreateTenantAccountDTO createTenantAccountDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
