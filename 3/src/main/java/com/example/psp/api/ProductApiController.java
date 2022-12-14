package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.ProductDTO;
import com.example.psp.security.User;
import com.example.psp.services.ProductService;
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
public class ProductApiController {

    private final ProductService productService;

    private final UserDetailsService userDetailsService;

    /**
     * GET /product : Get a list of products.
     *
     * @param materialId Parameter to return all products that contain one or more specified materials. (optional)
     * @param categoryId Parameter to return all products that belong in one or more specified categories. (optional)
     * @param brandId    Parameter to return all products assigned to specific brands. (optional)
     * @param pageSize   Parameter to define how many records are in a page. (optional)
     * @param page       Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get a list of products.", nickname = "productGet", notes = "", response = ProductDTO.class, responseContainer = "List", tags = {"Product",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = ProductDTO.class, responseContainer = "List")})
    @GetMapping(
            value = "/product",
            produces = {"application/json"}
    )
    public ResponseEntity<List<ProductDTO>> productGet(@ApiParam(value = "Parameter to return all products that contain one or more specified materials.") @Valid @RequestParam(value = "materialId", required = false) List<Integer> materialId, @ApiParam(value = "Parameter to return all products that belong in one or more specified categories.") @Valid @RequestParam(value = "categoryId", required = false) List<Integer> categoryId, @ApiParam(value = "Parameter to return all products assigned to specific brands.") @Valid @RequestParam(value = "brandId", required = false) List<Integer> brandId, @ApiParam(value = "Parameter to define how many records are in a page.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Parameter to specify which page of records to return.") @Valid @RequestParam(value = "page", required = false) Integer page, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(productService.productGet(materialId, categoryId, brandId, pageSize, page, user));
    }


    /**
     * POST /product : Create product.
     *
     * @param productDTO (optional)
     * @return Success (status code 200)
     * or If some product details are missing. (status code 400)
     */
    @ApiOperation(value = "Create product.", nickname = "productPost", notes = "", tags = {"Product",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some product details are missing.")})
    @PostMapping(
            value = "/product",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> productPost(@ApiParam(value = "") @Valid @RequestBody(required = false) ProductDTO productDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        productService.productPost(productDTO, user);
        return RestUtils.ok();
    }


    /**
     * DELETE /product/{productId} : Delete product by id.
     *
     * @param productId (required)
     * @return Success (status code 200)
     * or If product with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Delete product by id.", nickname = "productProductIdDelete", notes = "", tags = {"Product",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "If product with such id does not exist.")})
    @DeleteMapping(
            value = "/product/{productId}"
    )
    public ResponseEntity<Void> productProductIdDelete(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        productService.productProductIdDelete(productId, user);
        return RestUtils.ok();
    }


    /**
     * GET /product/{productId} : Get product by Id.
     *
     * @param productId (required)
     * @return Success (status code 200)
     * or If product with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Get product by Id.", nickname = "productProductIdGet", notes = "", response = ProductDTO.class, tags = {"Product",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = ProductDTO.class),
            @ApiResponse(code = 404, message = "If product with such id does not exist.")})
    @GetMapping(
            value = "/product/{productId}",
            produces = {"application/json"}
    )
    public ResponseEntity<ProductDTO> productProductIdGet(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(productService.productProductIdGet(productId, user));
    }


    /**
     * PUT /product/{productId} : Update product by id.
     *
     * @param productId  (required)
     * @param productDTO (optional)
     * @return Success (status code 200)
     * or If some product details are missing. (status code 400)
     * or If product with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Update product by id.", nickname = "productProductIdPut", notes = "", tags = {"Product",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some product details are missing."),
            @ApiResponse(code = 404, message = "If product with such id does not exist.")})
    @PutMapping(
            value = "/product/{productId}",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> productProductIdPut(@ApiParam(value = "", required = true) @PathVariable("productId") Integer productId, @ApiParam(value = "") @Valid @RequestBody(required = false) ProductDTO productDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        productService.productProductIdPut(productId, productDTO, user);
        return RestUtils.ok();
    }
}
