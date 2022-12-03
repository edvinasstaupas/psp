/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.psp.api;

import com.example.psp.dto.BundleProduct;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@Validated
@Api(value = "bundle-product", description = "the bundle-product API")
public interface BundleProductApi {

    default BundleProductApiDelegate getDelegate() {
        return new BundleProductApiDelegate() {};
    }

    /**
     * GET /bundle-product/{bundleId} : Get list of bundle&#39;s all assigned products by bundle Id.
     *
     * @param bundleId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Get list of bundle's all assigned products by bundle Id.", nickname = "bundleProductBundleIdGet", notes = "", response = BundleProduct.class, responseContainer = "List", tags={ "BundleProduct", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BundleProduct.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "If bundle with such id does not exist.") })
    @GetMapping(
        value = "/bundle-product/{bundleId}",
        produces = { "application/json", "text/json" }
    )
    default ResponseEntity<List<BundleProduct>> bundleProductBundleIdGet(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId) {
        return getDelegate().bundleProductBundleIdGet(bundleId);
    }


    /**
     * DELETE /bundle-product/{bundleId}/{productId} : Delete bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     */
    @ApiOperation(value = "Delete bundle's assigned product by bundle Id and product Id.", nickname = "bundleProductBundleIdProductIdDelete", notes = "", tags={ "BundleProduct", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 404, message = "If product with such id is not assigned to bundle with such id.") })
    @DeleteMapping(
        value = "/bundle-product/{bundleId}/{productId}"
    )
    default ResponseEntity<Void> bundleProductBundleIdProductIdDelete(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId,@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId) {
        return getDelegate().bundleProductBundleIdProductIdDelete(bundleId, productId);
    }


    /**
     * GET /bundle-product/{bundleId}/{productId} : Get bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @return Success (status code 200)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     */
    @ApiOperation(value = "Get bundle's assigned product by bundle Id and product Id.", nickname = "bundleProductBundleIdProductIdGet", notes = "", response = BundleProduct.class, tags={ "BundleProduct", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = BundleProduct.class),
        @ApiResponse(code = 404, message = "If product with such id is not assigned to bundle with such id.") })
    @GetMapping(
        value = "/bundle-product/{bundleId}/{productId}",
        produces = { "application/json" }
    )
    default ResponseEntity<BundleProduct> bundleProductBundleIdProductIdGet(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId,@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId) {
        return getDelegate().bundleProductBundleIdProductIdGet(bundleId, productId);
    }


    /**
     * PUT /bundle-product/{bundleId}/{productId} : Update bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @param bundleProduct  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     */
    @ApiOperation(value = "Update bundle's assigned product by bundle Id and product Id.", nickname = "bundleProductBundleIdProductIdPut", notes = "", tags={ "BundleProduct", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 400, message = "If some class details are missing."),
        @ApiResponse(code = 404, message = "If product with such id is not assigned to bundle with such id.") })
    @PutMapping(
        value = "/bundle-product/{bundleId}/{productId}",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> bundleProductBundleIdProductIdPut(@ApiParam(value = "",required=true) @PathVariable("bundleId") Integer bundleId,@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BundleProduct bundleProduct) {
        return getDelegate().bundleProductBundleIdProductIdPut(bundleId, productId, bundleProduct);
    }


    /**
     * POST /bundle-product : Assign product to a bundle.
     *
     * @param bundleProduct  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     */
    @ApiOperation(value = "Assign product to a bundle.", nickname = "bundleProductPost", notes = "", tags={ "BundleProduct", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success"),
        @ApiResponse(code = 400, message = "If some class details are missing.") })
    @PostMapping(
        value = "/bundle-product",
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> bundleProductPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) BundleProduct bundleProduct) {
        return getDelegate().bundleProductPost(bundleProduct);
    }

}
