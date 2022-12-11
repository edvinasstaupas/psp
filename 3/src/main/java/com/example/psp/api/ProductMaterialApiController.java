package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.ProductMaterial;
import com.example.psp.security.User;
import com.example.psp.services.ProductMaterialService;
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
public class ProductMaterialApiController {

    private final ProductMaterialService productMaterialService;

    private final UserDetailsService userDetailsService;

    /**
     * POST /product-material : Assign material to a product.
     *
     * @param productMaterial (optional)
     * @return Success (status code 200)
     * or If some class details are missing. (status code 400)
     */
    @ApiOperation(value = "Assign material to a product.", nickname = "productMaterialPost", notes = "", tags = {"ProductMaterial",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some class details are missing.")})
    @PostMapping(
            value = "/product-material",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> productMaterialPost(@ApiParam(value = "") @Valid @RequestBody(required = false) ProductMaterial productMaterial, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        productMaterialService.productMaterialPost(productMaterial, user);
        return RestUtils.ok();
    }


    /**
     * GET /product-material/{productId} : Get list of product&#39;s all assigned materials by product Id.
     *
     * @param productId (required)
     * @return Success (status code 200)
     * or If product with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Get list of product's all assigned materials by product Id.", nickname = "productMaterialProductIdGet", notes = "", response = ProductMaterial.class, responseContainer = "List", tags = {"ProductMaterial",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = ProductMaterial.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "If product with such id does not exist.")})
    @GetMapping(
            value = "/product-material/{productId}",
            produces = {"application/json"}
    )
    public ResponseEntity<List<ProductMaterial>> productMaterialProductIdGet(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(productMaterialService.productMaterialProductIdGet(productId, user));
    }


    /**
     * DELETE /product-material/{productId}/{materialId} : Delete product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId (required)
     * @return Success (status code 200)
     * or If material with such id is not assigned to product with such id. (status code 404)
     */
    @ApiOperation(value = "Delete product's assigned material by product Id and material Id.", nickname = "productMaterialProductIdMaterialIdDelete", notes = "", tags = {"ProductMaterial",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "If material with such id is not assigned to product with such id.")})
    @DeleteMapping(
            value = "/product-material/{productId}/{materialId}"
    )
    public ResponseEntity<Void> productMaterialProductIdMaterialIdDelete(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, @ApiParam(value = "", required = true) @PathVariable("materialId") Integer materialId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        productMaterialService.productMaterialProductIdMaterialIdDelete(productId, materialId, user);
        return RestUtils.ok();
    }


    /**
     * GET /product-material/{productId}/{materialId} : Get product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId (required)
     * @return Success (status code 200)
     * or If material with such id is not assigned to product with such id. (status code 404)
     */
    @ApiOperation(value = "Get product's assigned material by product Id and material Id.", nickname = "productMaterialProductIdMaterialIdGet", notes = "", response = ProductMaterial.class, tags = {"ProductMaterial",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = ProductMaterial.class),
            @ApiResponse(code = 404, message = "If material with such id is not assigned to product with such id.")})
    @GetMapping(
            value = "/product-material/{productId}/{materialId}",
            produces = {"application/json"}
    )
    public ResponseEntity<ProductMaterial> productMaterialProductIdMaterialIdGet(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, @ApiParam(value = "", required = true) @PathVariable("materialId") Integer materialId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(productMaterialService.productMaterialProductIdMaterialIdGet(productId, materialId, user));
    }


    /**
     * PUT /product-material/{productId}/{materialId} : Update product&#39;s assigned material by product Id and material Id.
     *
     * @param productId       (required)
     * @param materialId      (required)
     * @param productMaterial (optional)
     * @return Success (status code 200)
     * or If some class details are missing. (status code 400)
     * or If material with such id is not assigned to product with such id. (status code 404)
     */
    @ApiOperation(value = "Update product's assigned material by product Id and material Id.", nickname = "productMaterialProductIdMaterialIdPut", notes = "", tags = {"ProductMaterial",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some class details are missing."),
            @ApiResponse(code = 404, message = "If material with such id is not assigned to product with such id.")})
    @PutMapping(
            value = "/product-material/{productId}/{materialId}",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> productMaterialProductIdMaterialIdPut(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, @ApiParam(value = "", required = true) @PathVariable("materialId") Integer materialId, @ApiParam(value = "") @Valid @RequestBody(required = false) ProductMaterial productMaterial, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        productMaterialService.productMaterialProductIdMaterialIdPut(productId, materialId, productMaterial, user);
        return RestUtils.ok();
    }
}
