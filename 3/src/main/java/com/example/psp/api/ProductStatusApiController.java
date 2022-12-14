package com.example.psp.api;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
@RequiredArgsConstructor
public class ProductStatusApiController {

//
//    private final ProductStatusService productStatusService;
//
//    private final UserDetailsService userDetailsService;
//    /**
//     * POST /product-status/ : Create product status.
//     *
//     * @param productStatusDTO  (optional)
//     * @return Success (status code 200)
//     *         or If some product status details are missing. (status code 400)
//     */
//    @ApiOperation(value = "Create product status.", nickname = "productStatusPost", notes = "", tags={ "ProductStatus", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success"),
//            @ApiResponse(code = 400, message = "If some product status details are missing.") })
//    @PostMapping(
//            value = "/product-status/",
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<Void> productStatusPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) ProductStatusDTO productStatusDTO) {
//        return getDelegate().productStatusPost(productStatusDTO);
//    }
//
//
//    /**
//     * DELETE /product-status/{productId} : Delete product status by id.
//     *
//     * @param productId  (required)
//     * @return Success (status code 200)
//     *         or If product with such id does not exist. (status code 404)
//     */
//    @ApiOperation(value = "Delete product status by id.", nickname = "productStatusProductIdDelete", notes = "", tags={ "ProductStatus", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success"),
//            @ApiResponse(code = 404, message = "If product with such id does not exist.") })
//    @DeleteMapping(
//            value = "/product-status/{productId}"
//    )
//    public ResponseEntity<Void> productStatusProductIdDelete(@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId) {
//        return getDelegate().productStatusProductIdDelete(productId);
//    }
//
//
//    /**
//     * GET /product-status/{productId} : Get product status by Id.
//     *
//     * @param productId  (required)
//     * @return Success (status code 200)
//     *         or If product with such id does not exist. (status code 404)
//     */
//    @ApiOperation(value = "Get product status by Id.", nickname = "productStatusProductIdGet", notes = "", response = ProductStatusDTO.class, tags={ "ProductStatus", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success", response = ProductStatusDTO.class),
//            @ApiResponse(code = 404, message = "If product with such id does not exist.") })
//    @GetMapping(
//            value = "/product-status/{productId}",
//            produces = { "application/json" }
//    )
//    public ResponseEntity<ProductStatusDTO> productStatusProductIdGet(@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId) {
//        return getDelegate().productStatusProductIdGet(productId);
//    }
//
//
//    /**
//     * PUT /product-status/{productId} : Update product status by id (Enable/Disable, update quantity).
//     *
//     * @param productId  (required)
//     * @param productStatusDTO  (optional)
//     * @return Success (status code 200)
//     *         or If some product status details are missing. (status code 400)
//     *         or If product with such id does not exist. (status code 404)
//     */
//    @ApiOperation(value = "Update product status by id (Enable/Disable, update quantity).", nickname = "productStatusProductIdPut", notes = "", tags={ "ProductStatus", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success"),
//            @ApiResponse(code = 400, message = "If some product status details are missing."),
//            @ApiResponse(code = 404, message = "If product with such id does not exist.") })
//    @PutMapping(
//            value = "/product-status/{productId}",
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<Void> productStatusProductIdPut(@ApiParam(value = "",required=true) @PathVariable("productId") Integer productId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) ProductStatusDTO productStatusDTO) {
//        return getDelegate().productStatusProductIdPut(productId, productStatusDTO);
//    }

}
