package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.BundleDTO;
import com.example.psp.security.User;
import com.example.psp.services.BundleService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class BundleApiController {

    private final BundleService bundleService;

    private final UserDetailsService userDetailsService;
    /**
     * DELETE /bundle/{bundleId} : Delete bundle by id.
     *
     * @param bundleId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Delete bundle by id.", nickname = "bundleBundleIdDelete", notes = "", tags={ "Bundle", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "If bundle with such id does not exist.") })
    @DeleteMapping(
            value = "/bundle/{bundleId}"
    )
    public ResponseEntity<Void> bundleBundleIdDelete(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        bundleService.bundleBundleIdDelete(bundleId, user);
        return RestUtils.ok();
    }


    /**
     * GET /bundle/{bundleId} : Get bundle by Id.
     *
     * @param bundleId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Get bundle by Id.", nickname = "bundleBundleIdGet", notes = "", response = BundleDTO.class, tags={ "Bundle", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = BundleDTO.class),
            @ApiResponse(code = 404, message = "If bundle with such id does not exist.") })
    @GetMapping(
            value = "/bundle/{bundleId}",
            produces = { "application/json", "text/json" }
    )
    public ResponseEntity<BundleDTO> bundleBundleIdGet(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(bundleService.bundleBundleIdGet(bundleId, user));
    }


    /**
     * PUT /bundle/{bundleId} : Update bundle by id.
     *
     * @param bundleId  (required)
     * @param bundleDTO  (optional)
     * @return Success (status code 200)
     *         or If some bundle details are missing. (status code 400)
     *         or If bundle with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Update bundle by id.", nickname = "bundleBundleIdPut", notes = "", tags={ "Bundle", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some bundle details are missing."),
            @ApiResponse(code = 404, message = "If bundle with such id does not exist.") })
    @PutMapping(
            value = "/bundle/{bundleId}",
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> bundleBundleIdPut(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BundleDTO bundleDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        bundleService.bundleBundleIdPut(bundleId, bundleDTO, user);
        return RestUtils.ok();
    }


    /**
     * GET /bundle : Get a list of bundles.
     *
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get a list of bundles.", nickname = "bundleGet", notes = "", response = BundleDTO.class, responseContainer = "List", tags={ "Bundle", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = BundleDTO.class, responseContainer = "List") })
    @GetMapping(
            value = "/bundle",
            produces = { "application/json", "text/json" }
    )
    public ResponseEntity<List<BundleDTO>> bundleGet(@ApiParam(value = "Parameter to define how many records are in a page.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Parameter to specify which page of records to return.") @Valid @RequestParam(value = "page", required = false) Integer page, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(bundleService.bundleGet(pageSize, page, user));
    }


    /**
     * POST /bundle : Create bundle.
     *
     * @param bundleDTO  (optional)
     * @return Success (status code 200)
     *         or If some bundle details are missing. (status code 400)
     */
    @ApiOperation(value = "Create bundle.", nickname = "bundlePost", notes = "", tags={ "Bundle", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some bundle details are missing.") })
    @PostMapping(
            value = "/bundle",
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> bundlePost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BundleDTO bundleDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        bundleService.bundlePost(bundleDTO, user);
        return RestUtils.ok();
    }

}
