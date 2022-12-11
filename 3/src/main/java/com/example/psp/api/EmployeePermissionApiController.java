package com.example.psp.api;

import com.example.psp.dto.EmployeePermissionDTO;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.services.EmployeeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class EmployeePermissionApiController {

    //private final EmployeePermissionService;
//
//    private final UserDetailsService userDetailsService;
//    /**
//     * GET /employee-permission/{employeeId} : Gets permission details
//     *
//     * @param employeeId  (required)
//     * @param permissionId  (optional)
//     * @return Returns permissions (status code 200)
//     *         or If permission ID is less or equal to 0 (status code 400)
//     *         or If no permission ID matched the search (status code 404)
//     */
//    @ApiOperation(value = "Gets permission details", nickname = "employeePermissionEmployeeIdGet", notes = "", response = EmployeePermissionDTO.class, tags={ "EmployeePermission", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Returns permissions", response = EmployeePermissionDTO.class),
//            @ApiResponse(code = 400, message = "If permission ID is less or equal to 0", response = ProblemDetails.class),
//            @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
//    @GetMapping(
//            value = "/employee-permission/{employeeId}",
//            produces = { "application/json" }
//    )
//    public ResponseEntity<EmployeePermissionDTO> employeePermissionEmployeeIdGet(@ApiParam(value = "",required=true) @PathVariable("employeeId") String employeeId, @ApiParam(value = "") @Valid @RequestParam(value = "permissionId", required = false) Integer permissionId) {
//        return getDelegate().employeePermissionEmployeeIdGet(employeeId, permissionId);
//    }
//
//
//    /**
//     * DELETE /employee-permission/{permissionId} : Deletes permission
//     *
//     * @param permissionId  (required)
//     * @return If permission has been succesfully deleted (status code 200)
//     *         or If permission ID is less or equal to 0 (status code 400)
//     *         or If no permission ID matched the search (status code 404)
//     */
//    @ApiOperation(value = "Deletes permission", nickname = "employeePermissionPermissionIdDelete", notes = "", tags={ "EmployeePermission", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "If permission has been succesfully deleted"),
//            @ApiResponse(code = 400, message = "If permission ID is less or equal to 0", response = ProblemDetails.class),
//            @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
//    @DeleteMapping(
//            value = "/employee-permission/{permissionId}",
//            produces = { "application/json" }
//    )
//    public ResponseEntity<Void> employeePermissionPermissionIdDelete(@ApiParam(value = "",required=true) @PathVariable("permissionId") Integer permissionId) {
//        return getDelegate().employeePermissionPermissionIdDelete(permissionId);
//    }
//
//
//    /**
//     * PUT /employee-permission/{permissionId} : Updates permission details
//     *
//     * @param permissionId  (required)
//     * @param employeePermissionDTO  (optional)
//     * @return If permission details hae been succesfully updates (status code 200)
//     *         or If provided permission details do not pass the validation (status code 400)
//     *         or If no permission ID matched the search (status code 404)
//     */
//    @ApiOperation(value = "Updates permission details", nickname = "employeePermissionPermissionIdPut", notes = "", tags={ "EmployeePermission", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "If permission details hae been succesfully updates"),
//            @ApiResponse(code = 400, message = "If provided permission details do not pass the validation", response = ProblemDetails.class),
//            @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
//    @PutMapping(
//            value = "/employee-permission/{permissionId}",
//            produces = { "application/json" },
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<Void> employeePermissionPermissionIdPut(@ApiParam(value = "",required=true) @PathVariable("permissionId") Integer permissionId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) EmployeePermissionDTO employeePermissionDTO) {
//        return getDelegate().employeePermissionPermissionIdPut(permissionId, employeePermissionDTO);
//    }
//
//
//    /**
//     * POST /employee-permission : Creates a permission
//     *
//     * @param employeePermissionDTO  (optional)
//     * @return If permission has been succesfully created (status code 201)
//     *         or If provided permission details do not pass the validation (status code 400)
//     */
//    @ApiOperation(value = "Creates a permission", nickname = "employeePermissionPost", notes = "", tags={ "EmployeePermission", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 201, message = "If permission has been succesfully created"),
//            @ApiResponse(code = 400, message = "If provided permission details do not pass the validation", response = ProblemDetails.class) })
//    @PostMapping(
//            value = "/employee-permission",
//            produces = { "application/json" },
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<Void> employeePermissionPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) EmployeePermissionDTO employeePermissionDTO) {
//        return getDelegate().employeePermissionPost(employeePermissionDTO);
//    }

}
