package com.example.psp.api;

import com.example.psp.model.EmployeePermissionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link EmployeePermissionApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface EmployeePermissionApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /employee-permission/{employeeId} : Gets permission details
     *
     * @param employeeId  (required)
     * @param permissionId  (optional)
     * @return Returns permissions (status code 200)
     *         or If permission ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see EmployeePermissionApi#employeePermissionEmployeeIdGet
     */
    default ResponseEntity<EmployeePermissionDTO> employeePermissionEmployeeIdGet(String employeeId,
        Integer permissionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"permissionId\" : 0, \"employeeId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /employee-permission/{permissionId} : Deletes permission
     *
     * @param permissionId  (required)
     * @return If permission has been succesfully deleted (status code 200)
     *         or If permission ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see EmployeePermissionApi#employeePermissionPermissionIdDelete
     */
    default ResponseEntity<Void> employeePermissionPermissionIdDelete(Integer permissionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /employee-permission/{permissionId} : Updates permission details
     *
     * @param permissionId  (required)
     * @param employeePermissionDTO  (optional)
     * @return If permission details hae been succesfully updates (status code 200)
     *         or If provided permission details do not pass the validation (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see EmployeePermissionApi#employeePermissionPermissionIdPut
     */
    default ResponseEntity<Void> employeePermissionPermissionIdPut(Integer permissionId,
        EmployeePermissionDTO employeePermissionDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /employee-permission : Creates a permission
     *
     * @param employeePermissionDTO  (optional)
     * @return If permission has been succesfully created (status code 201)
     *         or If provided permission details do not pass the validation (status code 400)
     * @see EmployeePermissionApi#employeePermissionPost
     */
    default ResponseEntity<Void> employeePermissionPost(EmployeePermissionDTO employeePermissionDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
