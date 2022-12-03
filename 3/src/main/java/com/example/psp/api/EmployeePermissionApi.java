/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.psp.api;

import com.example.psp.model.EmployeePermissionDTO;
import com.example.psp.model.ProblemDetails;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@Validated
@Api(value = "employee-permission", description = "the employee-permission API")
public interface EmployeePermissionApi {

    default EmployeePermissionApiDelegate getDelegate() {
        return new EmployeePermissionApiDelegate() {};
    }

    /**
     * GET /employee-permission/{employeeId} : Gets permission details
     *
     * @param employeeId  (required)
     * @param permissionId  (optional)
     * @return Returns permissions (status code 200)
     *         or If permission ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets permission details", nickname = "employeePermissionEmployeeIdGet", notes = "", response = EmployeePermissionDTO.class, tags={ "EmployeePermission", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns permissions", response = EmployeePermissionDTO.class),
        @ApiResponse(code = 400, message = "If permission ID is less or equal to 0", response = ProblemDetails.class),
        @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
    @GetMapping(
        value = "/employee-permission/{employeeId}",
        produces = { "text/plain", "application/json", "text/json" }
    )
    default ResponseEntity<EmployeePermissionDTO> employeePermissionEmployeeIdGet(@ApiParam(value = "",required=true) @PathVariable("employeeId") String employeeId,@ApiParam(value = "") @Valid @RequestParam(value = "permissionId", required = false) Integer permissionId) {
        return getDelegate().employeePermissionEmployeeIdGet(employeeId, permissionId);
    }


    /**
     * DELETE /employee-permission/{permissionId} : Deletes permission
     *
     * @param permissionId  (required)
     * @return If permission has been succesfully deleted (status code 200)
     *         or If permission ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     */
    @ApiOperation(value = "Deletes permission", nickname = "employeePermissionPermissionIdDelete", notes = "", tags={ "EmployeePermission", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If permission has been succesfully deleted"),
        @ApiResponse(code = 400, message = "If permission ID is less or equal to 0", response = ProblemDetails.class),
        @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
    @DeleteMapping(
        value = "/employee-permission/{permissionId}",
        produces = { "text/plain", "application/json", "text/json" }
    )
    default ResponseEntity<Void> employeePermissionPermissionIdDelete(@ApiParam(value = "",required=true) @PathVariable("permissionId") Integer permissionId) {
        return getDelegate().employeePermissionPermissionIdDelete(permissionId);
    }


    /**
     * PUT /employee-permission/{permissionId} : Updates permission details
     *
     * @param permissionId  (required)
     * @param employeePermissionDTO  (optional)
     * @return If permission details hae been succesfully updates (status code 200)
     *         or If provided permission details do not pass the validation (status code 400)
     *         or If no permission ID matched the search (status code 404)
     */
    @ApiOperation(value = "Updates permission details", nickname = "employeePermissionPermissionIdPut", notes = "", tags={ "EmployeePermission", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "If permission details hae been succesfully updates"),
        @ApiResponse(code = 400, message = "If provided permission details do not pass the validation", response = ProblemDetails.class),
        @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
    @PutMapping(
        value = "/employee-permission/{permissionId}",
        produces = { "text/plain", "application/json", "text/json" },
        consumes = { "application/json", "text/json", "application/_*+json" }
    )
    default ResponseEntity<Void> employeePermissionPermissionIdPut(@ApiParam(value = "",required=true) @PathVariable("permissionId") Integer permissionId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) EmployeePermissionDTO employeePermissionDTO) {
        return getDelegate().employeePermissionPermissionIdPut(permissionId, employeePermissionDTO);
    }


    /**
     * POST /employee-permission : Creates a permission
     *
     * @param employeePermissionDTO  (optional)
     * @return If permission has been succesfully created (status code 201)
     *         or If provided permission details do not pass the validation (status code 400)
     */
    @ApiOperation(value = "Creates a permission", nickname = "employeePermissionPost", notes = "", tags={ "EmployeePermission", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "If permission has been succesfully created"),
        @ApiResponse(code = 400, message = "If provided permission details do not pass the validation", response = ProblemDetails.class) })
    @PostMapping(
        value = "/employee-permission",
        produces = { "text/plain", "application/json", "text/json" },
        consumes = { "application/json", "text/json", "application/_*+json" }
    )
    default ResponseEntity<Void> employeePermissionPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) EmployeePermissionDTO employeePermissionDTO) {
        return getDelegate().employeePermissionPost(employeePermissionDTO);
    }

}
