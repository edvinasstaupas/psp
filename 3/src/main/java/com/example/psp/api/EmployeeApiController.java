package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.EmployeeDTO;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.security.User;
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
import java.security.Principal;
import java.time.OffsetDateTime;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class EmployeeApiController {

    private final EmployeeService employeeService;

    private final UserDetailsService userDetailsService;
    /**
     * DELETE /employee/{employeeId} : Deletes employee
     *
     * @param employeeId  (required)
     * @return If employee have been succesfully deleted (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no employee ID matched the search (status code 404)
     */
    @ApiOperation(value = "Deletes employee", nickname = "employeeEmployeeIdDelete", notes = "", tags={ "Employee", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If employee have been succesfully deleted"),
            @ApiResponse(code = 400, message = "If employee ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no employee ID matched the search", response = ProblemDetails.class) })
    @DeleteMapping(
            value = "/employee/{employeeId}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> employeeEmployeeIdDelete(@ApiParam(value = "",required=true) @PathVariable("employeeId") Integer employeeId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        employeeService.employeeEmployeeIdDelete(employeeId, user);
        return RestUtils.ok();
    }


    /**
     * GET /employee/{employeeId} : Gets employee details
     *
     * @param employeeId ID of the employee (required)
     * @return Returns employee details (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no employee ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets employee details", nickname = "employeeEmployeeIdGet", notes = "", response = EmployeeDTO.class, tags={ "Employee", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns employee details", response = EmployeeDTO.class),
            @ApiResponse(code = 400, message = "If employee ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no employee ID matched the search", response = ProblemDetails.class) })
    @GetMapping(
            value = "/employee/{employeeId}",
            produces = { "application/json" }
    )
    public ResponseEntity<EmployeeDTO> employeeEmployeeIdGet(@ApiParam(value = "ID of the employee",required=true) @PathVariable("employeeId") Integer employeeId, Principal principal) {
            User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(employeeService.employeeEmployeeIdGet(employeeId, user));
    }


    /**
     * PATCH /employee/{employeeId} : Hides the employee
     *
     * @param employeeId  (required)
     * @param date  (optional)
     * @return If employee have been succesfully hiden (status code 200)
     *         or If invalid date provided (status code 400)
     *         or If no employee ID matched the search (status code 404)
     */
    @ApiOperation(value = "Hides the employee", nickname = "employeeEmployeeIdPatch", notes = "", tags={ "Employee", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If employee have been succesfully hiden"),
            @ApiResponse(code = 400, message = "If invalid date provided", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no employee ID matched the search", response = ProblemDetails.class) })
    @PatchMapping(
            value = "/employee/{employeeId}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> employeeEmployeeIdPatch(@ApiParam(value = "",required=true) @PathVariable("employeeId") Integer employeeId,@ApiParam(value = "") @Valid @RequestParam(value = "date", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) OffsetDateTime date, Principal principal) {
                User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        employeeService.employeeEmployeeIdPatch(employeeId, date, user);
        return RestUtils.ok();
    }


    /**
     * PATCH /employee/{employeeId}/{permissionId} : Changes employee permissions
     *
     * @param employeeId  (required)
     * @param permissionId  (required)
     * @return If the employee permissions have been succesfully updated (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     */
    @ApiOperation(value = "Changes employee permissions", nickname = "employeeEmployeeIdPermissionIdPatch", notes = "", tags={ "Employee", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If the employee permissions have been succesfully updated"),
            @ApiResponse(code = 400, message = "If employee ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no permission ID matched the search", response = ProblemDetails.class) })
    @PatchMapping(
            value = "/employee/{employeeId}/{permissionId}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> employeeEmployeeIdPermissionIdPatch(@ApiParam(value = "",required=true) @PathVariable("employeeId") Integer employeeId,@ApiParam(value = "",required=true) @PathVariable("permissionId") Integer permissionId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        employeeService.employeeEmployeeIdPermissionIdPatch(employeeId, permissionId, user);
        return RestUtils.ok();
    }


    /**
     * PUT /employee/{employeeId} : Updates employee details
     *
     * @param employeeId  (required)
     * @param employeeDTO  (optional)
     * @return If employee details have been succesfully updated (status code 200)
     *         or If provided employee details do not pass the validation (status code 400)
     *         or If no employee ID matched the search (status code 404)
     */
    @ApiOperation(value = "Updates employee details", nickname = "employeeEmployeeIdPut", notes = "", tags={ "Employee", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If employee details have been succesfully updated"),
            @ApiResponse(code = 400, message = "If provided employee details do not pass the validation", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no employee ID matched the search", response = ProblemDetails.class) })
    @PutMapping(
            value = "/employee/{employeeId}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> employeeEmployeeIdPut(@ApiParam(value = "",required=true) @PathVariable("employeeId") Integer employeeId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) EmployeeDTO employeeDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        employeeService.employeeEmployeeIdPut(employeeId, employeeDTO, user);
        return RestUtils.ok();
    }


    /**
     * POST /employee : Creates an employee
     *
     * @param employeeDTO  (optional)
     * @return If employee has been succesfully created (status code 201)
     *         or If provided employee details do not pass the validation (status code 400)
     */
    @ApiOperation(value = "Creates an employee", nickname = "employeePost", notes = "", tags={ "Employee", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "If employee has been succesfully created"),
            @ApiResponse(code = 400, message = "If provided employee details do not pass the validation", response = ProblemDetails.class) })
    @PostMapping(
            value = "/employee",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> employeePost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) EmployeeDTO employeeDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        employeeService.employeePost(employeeDTO, user);
        return RestUtils.ok();
    }
}
