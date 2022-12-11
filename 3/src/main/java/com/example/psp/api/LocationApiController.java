package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.Location;
import com.example.psp.dto.LocationDto;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.security.User;
import com.example.psp.services.LocationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class LocationApiController {

    private final LocationService locationService;

    private final UserDetailsService userDetailsService;

    /**
     * DELETE /location/{id} : Endpoint to delete a business location.
     *
     * @param id Id of the business location to delete. (required)
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to delete a business location.", nickname = "locationIdDelete", notes = "", tags = {"Location",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @DeleteMapping(
            value = "/location/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<Void> locationIdDelete(@ApiParam(value = "Id of the business location to delete.", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        locationService.locationIdDelete(id, user);
        return RestUtils.ok();
    }


    /**
     * GET /location/{id} : Endpoint to get a single business location.
     *
     * @param id Id of the business location to get (required)
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to get a single business location.", nickname = "locationIdGet", notes = "", response = LocationDto.class, tags = {"Location",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = LocationDto.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @GetMapping(
            value = "/location/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<LocationDto> locationIdGet(@ApiParam(value = "Id of the business location to get", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(locationService.locationIdGet(id, user));
    }


    /**
     * PUT /location/{id} : Endpoint to update a business location.
     *
     * @param id          Id of the business location to update. (required)
     * @param locationDto Business location to update. (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to update a business location.", nickname = "locationIdPut", notes = "", tags = {"Location",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PutMapping(
            value = "/location/{id}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> locationIdPut(@ApiParam(value = "Id of the business location to update.", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Business location to update.") @Valid @RequestBody(required = false) LocationDto locationDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        locationService.locationIdPut(id, locationDto, user);
        return RestUtils.ok();
    }


    /**
     * GET /location/{pageSize}/{pageNumber} : Endpoint to get multiple business locations.
     *
     * @param pageSize   The maximum amount of business locations in response. (required)
     * @param pageNumber The page number of business locations to return. (required)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to get multiple business locations.", nickname = "locationPageSizePageNumberGet", notes = "", response = Location.class, responseContainer = "List", tags = {"Location",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Location.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @GetMapping(
            value = "/location/{pageSize}/{pageNumber}",
            produces = {"application/json"}
    )
    public ResponseEntity<List<Location>> locationPageSizePageNumberGet(@ApiParam(value = "The maximum amount of business locations in response.", required = true) @PathVariable("pageSize") Integer pageSize, @ApiParam(value = "The page number of business locations to return.", required = true) @PathVariable("pageNumber") Integer pageNumber, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(locationService.locationPageSizePageNumberGet(pageSize, pageNumber, user));
    }


    /**
     * POST /location : Endpoint to create a new business location.
     *
     * @param locationDto Business location to create. (optional)
     * @return Success (status code 201)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to create a new business location.", nickname = "locationPost", notes = "", tags = {"Location",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @PostMapping(
            value = "/location",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> locationPost(@ApiParam(value = "Business location to create.") @Valid @RequestBody(required = false) LocationDto locationDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        locationService.locationPost(locationDto, user);
        return RestUtils.ok();
    }
}
