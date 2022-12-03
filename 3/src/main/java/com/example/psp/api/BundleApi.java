/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.psp.api;

import com.example.psp.model.BundleDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@Validated
@Api(value = "bundle", description = "the bundle API")
public interface BundleApi {

    default BundleApiDelegate getDelegate() {
        return new BundleApiDelegate() {};
    }

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
    default ResponseEntity<Void> bundleBundleIdDelete(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId) {
        return getDelegate().bundleBundleIdDelete(bundleId);
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
    default ResponseEntity<BundleDTO> bundleBundleIdGet(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId) {
        return getDelegate().bundleBundleIdGet(bundleId);
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
    default ResponseEntity<Void> bundleBundleIdPut(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BundleDTO bundleDTO) {
        return getDelegate().bundleBundleIdPut(bundleId, bundleDTO);
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
    default ResponseEntity<List<BundleDTO>> bundleGet(@ApiParam(value = "Parameter to define how many records are in a page.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize,@ApiParam(value = "Parameter to specify which page of records to return.") @Valid @RequestParam(value = "page", required = false) Integer page) {
        return getDelegate().bundleGet(pageSize, page);
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
    default ResponseEntity<Void> bundlePost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BundleDTO bundleDTO) {
        return getDelegate().bundlePost(bundleDTO);
    }

}
