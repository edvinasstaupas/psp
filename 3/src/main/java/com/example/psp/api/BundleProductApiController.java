package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.BundleProduct;
import com.example.psp.security.User;
import com.example.psp.services.BundleProductService;
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
public class BundleProductApiController {


    private final BundleProductService bundleProductService;

    private final UserDetailsService userDetailsService;

    /**
     * GET /bundle-product/{bundleId} : Get list of bundle&#39;s all assigned products by bundle Id.
     *
     * @param bundleId (required)
     * @return Success (status code 200)
     * or If bundle with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Get list of bundle's all assigned products by bundle Id.", nickname = "bundleProductBundleIdGet", notes = "", response = BundleProduct.class, responseContainer = "List", tags = {"BundleProduct",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = BundleProduct.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "If bundle with such id does not exist.")})
    @GetMapping(
            value = "/bundle-product/{bundleId}",
            produces = {"application/json", "text/json"}
    )
    public ResponseEntity<List<BundleProduct>> bundleProductBundleIdGet(@ApiParam(value = "", required = true) @PathVariable("bundleId") Integer bundleId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(bundleProductService.bundleProductBundleIdGet(bundleId, user));
    }


    /**
     * DELETE /bundle-product/{bundleId}/{productId} : Delete bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId (required)
     * @return Success (status code 200)
     * or If product with such id is not assigned to bundle with such id. (status code 404)
     */
    @ApiOperation(value = "Delete bundle's assigned product by bundle Id and product Id.", nickname = "bundleProductBundleIdProductIdDelete", notes = "", tags = {"BundleProduct",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "If product with such id is not assigned to bundle with such id.")})
    @DeleteMapping(
            value = "/bundle-product/{bundleId}/{productId}"
    )
    public ResponseEntity<Void> bundleProductBundleIdProductIdDelete(@ApiParam(value = "", required = true) @PathVariable("bundleId") Integer bundleId, @ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        bundleProductService.bundleProductBundleIdProductIdDelete(bundleId, productId, user);
        return RestUtils.ok();
    }


    /**
     * GET /bundle-product/{bundleId}/{productId} : Get bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId (required)
     * @return Success (status code 200)
     * or If product with such id is not assigned to bundle with such id. (status code 404)
     */
    @ApiOperation(value = "Get bundle's assigned product by bundle Id and product Id.", nickname = "bundleProductBundleIdProductIdGet", notes = "", response = BundleProduct.class, tags = {"BundleProduct",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = BundleProduct.class),
            @ApiResponse(code = 404, message = "If product with such id is not assigned to bundle with such id.")})
    @GetMapping(
            value = "/bundle-product/{bundleId}/{productId}",
            produces = {"application/json"}
    )
    public ResponseEntity<BundleProduct> bundleProductBundleIdProductIdGet(@ApiParam(value = "", required = true) @PathVariable("bundleId") Integer bundleId, @ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(bundleProductService.bundleProductBundleIdProductIdGet(bundleId, productId, user));
    }


    /**
     * PUT /bundle-product/{bundleId}/{productId} : Update bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId      (required)
     * @param productId     (required)
     * @param bundleProduct (optional)
     * @return Success (status code 200)
     * or If some class details are missing. (status code 400)
     * or If product with such id is not assigned to bundle with such id. (status code 404)
     */
    @ApiOperation(value = "Update bundle's assigned product by bundle Id and product Id.", nickname = "bundleProductBundleIdProductIdPut", notes = "", tags = {"BundleProduct",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some class details are missing."),
            @ApiResponse(code = 404, message = "If product with such id is not assigned to bundle with such id.")})
    @PutMapping(
            value = "/bundle-product/{bundleId}/{productId}",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> bundleProductBundleIdProductIdPut(@ApiParam(value = "", required = true) @PathVariable("bundleId") Integer bundleId, @ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, @ApiParam(value = "") @Valid @RequestBody(required = false) BundleProduct bundleProduct, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        bundleProductService.bundleProductBundleIdProductIdPut(bundleId, productId, bundleProduct, user);
        return RestUtils.ok();
    }


    /**
     * POST /bundle-product : Assign product to a bundle.
     *
     * @param bundleProduct (optional)
     * @return Success (status code 200)
     * or If some class details are missing. (status code 400)
     */
    @ApiOperation(value = "Assign product to a bundle.", nickname = "bundleProductPost", notes = "", tags = {"BundleProduct",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some class details are missing.")})
    @PostMapping(
            value = "/bundle-product",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> bundleProductPost(@ApiParam(value = "") @Valid @RequestBody(required = false) BundleProduct bundleProduct, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        bundleProductService.bundleProductPost(bundleProduct, user);
        return RestUtils.ok();
    }

}
