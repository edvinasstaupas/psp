package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.AssignDiscountToBrandDTO;
import com.example.psp.dto.AssignDiscountToCategoryDTO;
import com.example.psp.dto.AssignDiscountToItemDTO;
import com.example.psp.dto.Discount;
import com.example.psp.dto.DiscountDto;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.security.User;
import com.example.psp.services.DiscountService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class DiscountApiController {

    private final DiscountService discountService;

    private final UserDetailsService userDetailsService;

    /**
     * POST /discount/AssignDiscountToBrand : Endpoint to assign a discount to a brand.
     *
     * @param assignDiscountToBrandDTO (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to assign a discount to a brand.", nickname = "discountAssignDiscountToBrandPost", notes = "", tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PostMapping(
            value = "/discount/AssignDiscountToBrand",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> discountAssignDiscountToBrandPost(@ApiParam(value = "") @Valid @RequestBody(required = false) AssignDiscountToBrandDTO assignDiscountToBrandDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        discountService.assignDiscountToBrand(assignDiscountToBrandDTO, user);
        return RestUtils.ok();
    }


    /**
     * POST /discount/assignDiscountToCategory : Endpoint to assign a discount to a category.
     *
     * @param assignDiscountToCategoryDTO (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to assign a discount to a category.", nickname = "discountAssignDiscountToCategoryPost", notes = "", tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PostMapping(
            value = "/discount/assignDiscountToCategory",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> discountAssignDiscountToCategoryPost(@ApiParam(value = "") @Valid @RequestBody(required = false) AssignDiscountToCategoryDTO assignDiscountToCategoryDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        discountService.assignDiscountToCategory(assignDiscountToCategoryDTO, user);
        return RestUtils.ok();
    }


    /**
     * POST /discount/AssignDiscountToItem : Endpoint to assign a discount to a product or service.
     *
     * @param assignDiscountToItemDTO (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to assign a discount to a product or service.", nickname = "discountAssignDiscountToItemPost", notes = "", tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PostMapping(
            value = "/discount/AssignDiscountToItem",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> discountAssignDiscountToItemPost(@ApiParam(value = "") @Valid @RequestBody(required = false) AssignDiscountToItemDTO assignDiscountToItemDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        discountService.assignDiscountToItem(assignDiscountToItemDTO, user);
        return RestUtils.ok();
    }


    /**
     * GET /discount/{id} : Endpoint to get a single discount.
     *
     * @param id Id of the discount to get (required)
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to get a single discount.", nickname = "discountIdGet", notes = "", response = DiscountDto.class, tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = DiscountDto.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @GetMapping(
            value = "/discount/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<Discount> discountIdGet(@ApiParam(value = "Id of the discount to get", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(discountService.getDiscount(id, user));
    }


    /**
     * PUT /discount/{id} : Endpoint to update a discount.
     *
     * @param id          Id of the discount to update. (required)
     * @param discountDto Discount to update. (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to update a discount.", nickname = "discountIdPut", notes = "", tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PutMapping(
            value = "/discount/{id}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> discountIdPut(@ApiParam(value = "Id of the discount to update.", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Discount to update.") @Valid @RequestBody(required = false) DiscountDto discountDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        discountService.updateDiscount(id, discountDto, user);
        return RestUtils.ok();
    }


    /**
     * GET /discount/{pageSize}/{pageNumber} : Endpoint to get multiple discounts.
     *
     * @param pageSize   The maximum amount of discounts in response. (required)
     * @param pageNumber The page number of discounts to return. (required)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to get multiple discounts.", nickname = "discountPageSizePageNumberGet", notes = "", response = Discount.class, responseContainer = "List", tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = Discount.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @GetMapping(
            value = "/discount/{pageSize}/{pageNumber}",
            produces = {"application/json"}
    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<Discount>> discountPageSizePageNumberGet(@ApiParam(value = "The maximum amount of discounts in response.", required = true) @PathVariable("pageSize") Integer pageSize, @ApiParam(value = "The page number of discounts to return.", required = true) @PathVariable("pageNumber") Integer pageNumber, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(discountService.getDiscounts(pageSize, pageNumber, user));
    }


    /**
     * POST /discount : Endpoint to create a new discount.
     *
     * @param discountDto Discount to create. (optional)
     * @return Success (status code 201)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to create a new discount.", nickname = "discountPost", notes = "", tags = {"Discount",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @PostMapping(
            value = "/discount",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_EMPLOYEE')")
    public ResponseEntity<Void> discountPost(@ApiParam(value = "Discount to create.") @Valid @RequestBody(required = false) DiscountDto discountDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        discountService.createDiscount(discountDto, user);
        return RestUtils.ok();
    }

}
