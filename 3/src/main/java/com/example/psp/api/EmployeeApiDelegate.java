package com.example.psp.api;

import com.example.psp.dto.EmployeeDTO;
import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link EmployeeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface EmployeeApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /employee/{employeeId} : Deletes employee
     *
     * @param employeeId  (required)
     * @return If employee have been succesfully deleted (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see EmployeeApi#employeeEmployeeIdDelete
     */
    default ResponseEntity<Void> employeeEmployeeIdDelete(Integer employeeId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /employee/{employeeId} : Gets employee details
     *
     * @param employeeId ID of the employee (required)
     * @return Returns employee details (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see EmployeeApi#employeeEmployeeIdGet
     */
    default ResponseEntity<EmployeeDTO> employeeEmployeeIdGet(Integer employeeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"role\", \"dateHired\" : \"2000-01-23T04:56:07.000+00:00\", \"dateDeleted\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /employee/{employeeId} : Hides the employee
     *
     * @param employeeId  (required)
     * @param date  (optional)
     * @return If employee have been succesfully hiden (status code 200)
     *         or If invalid date provided (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see EmployeeApi#employeeEmployeeIdPatch
     */
    default ResponseEntity<Void> employeeEmployeeIdPatch(Integer employeeId,
        OffsetDateTime date) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /employee/{employeeId}/{permissionId} : Changes employee permissions
     *
     * @param employeeId  (required)
     * @param permissionId  (required)
     * @return If the employee permissions have been succesfully updated (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see EmployeeApi#employeeEmployeeIdPermissionIdPatch
     */
    default ResponseEntity<Void> employeeEmployeeIdPermissionIdPatch(Integer employeeId,
        Integer permissionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /employee/{employeeId} : Updates employee details
     *
     * @param employeeId  (required)
     * @param employeeDTO  (optional)
     * @return If employee details have been succesfully updated (status code 200)
     *         or If provided employee details do not pass the validation (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see EmployeeApi#employeeEmployeeIdPut
     */
    default ResponseEntity<Void> employeeEmployeeIdPut(Integer employeeId,
        EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /employee : Creates an employee
     *
     * @param employeeDTO  (optional)
     * @return If employee has been succesfully created (status code 201)
     *         or If provided employee details do not pass the validation (status code 400)
     * @see EmployeeApi#employeePost
     */
    default ResponseEntity<Void> employeePost(EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
