package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.dto.Service;
import com.example.psp.dto.ServiceDto;
import com.example.psp.security.User;
import com.example.psp.services.ServiceService;
import io.swagger.annotations.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
@Validated
@Api(value = "service", description = "the service API")
@RequiredArgsConstructor
public class ServiceApiController {

    private final ServiceService serviceService;

    private final UserDetailsService userDetailsService;

    /**
     * DELETE /service/{id} : Endpoint to delete a service.
     *
     * @param id Id of the service to delete. (required)
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to delete a service.", nickname = "serviceIdDelete", notes = "", tags = {"Service",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @DeleteMapping(
            value = "/service/{id}",
            produces = {"application/json"}
    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<Void> serviceIdDelete(@ApiParam(value = "Id of the service to delete.", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        serviceService.serviceIdDelete(id, user);
        return RestUtils.ok();
    }

    /**
     * GET /service/{id} : Endpoint to get a single service.
     *
     * @param id Id of the service to get (required)
     * @return Success (status code 200)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to get a single service.", nickname = "serviceIdGet", notes = "", response = Service.class, tags = {"Service",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Service.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @GetMapping(
            value = "/service/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<Service> serviceIdGet(@ApiParam(value = "Id of the service to get", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(serviceService.serviceIdGet(id, user));
    }


    /**
     * PUT /service/{id} : Endpoint to update a service.
     *
     * @param id         Id of the service to update. (required)
     * @param serviceDto Service to update. (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to update a service.", nickname = "serviceIdPut", notes = "", tags = {"Service",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PutMapping(
            value = "/service/{id}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> serviceIdPut(@ApiParam(value = "Id of the service to update.", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Service to update.") @Valid @RequestBody(required = false) ServiceDto serviceDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        serviceService.serviceIdPut(id, serviceDto, user);
        return RestUtils.ok();
    }

    /**
     * GET /service/{pageSize}/{pageNumber} : Endpoint to get multiple services.
     *
     * @param pageSize   The maximum amount of services in response. (required)
     * @param pageNumber The page number of services to return. (required)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     */
    @ApiOperation(value = "Endpoint to get multiple services.", nickname = "servicePageSizePageNumberGet", notes = "", response = Service.class, responseContainer = "List", tags = {"Service",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Service.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class)})
    @GetMapping(
            value = "/service/{pageSize}/{pageNumber}",
            produces = {"application/json"}
    )
    public ResponseEntity<List<Service>> servicePageSizePageNumberGet(@ApiParam(value = "The maximum amount of services in response.", required = true) @PathVariable("pageSize") Integer pageSize, @ApiParam(value = "The page number of services to return.", required = true) @PathVariable("pageNumber") Integer pageNumber, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(serviceService.servicePageSizePageNumberGet(pageSize, pageNumber, user));
    }

    /**
     * POST /service : Endpoint to create a new service.
     *
     * @param serviceDto Service to create. (optional)
     * @return Success (status code 201)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to create a new service.", nickname = "servicePost", notes = "", tags = {"Service",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @PostMapping(
            value = "/service",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> servicePost(@ApiParam(value = "Service to create.") @Valid @RequestBody(required = false) ServiceDto serviceDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        serviceService.servicePost(serviceDto, user);
        return RestUtils.ok();
    }
}
