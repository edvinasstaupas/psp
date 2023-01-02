package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.ApplyTaxRateToCategoryDTO;
import com.example.psp.dto.AssignTaxRateToItemDTO;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.dto.TaxRate;
import com.example.psp.dto.TaxRateDto;
import com.example.psp.security.User;
import com.example.psp.services.TaxRateService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
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

@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
@RequiredArgsConstructor
public class TaxRateApiController {


    private final TaxRateService taxRateService;

    private final UserDetailsService userDetailsService;

    /**
     * POST /tax-rate/apply-tax-rate-to-category : Endpoint for applying tax rate to all items in the category.
     *
     * @param applyTaxRateToCategoryDTO (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint for applying tax rate to all items in the category.", nickname = "taxRateApplyTaxRateToCategoryPost", notes = "", tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PostMapping(
            value = "/tax-rate/apply-tax-rate-to-category",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> taxRateApplyTaxRateToCategoryPost(@ApiParam(value = "") @Valid @RequestBody(required = false) ApplyTaxRateToCategoryDTO applyTaxRateToCategoryDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        taxRateService.applyTaxToCategory(applyTaxRateToCategoryDTO, user);
        return RestUtils.ok();
    }


    /**
     * POST /tax-rate/AssignTaxRateToItem : Endpoint for assigning tax rate to an item.
     *
     * @param assignTaxRateToItemDTO (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint for assigning tax rate to an item.", nickname = "taxRateAssignTaxRateToItemPost", notes = "", tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PostMapping(
            value = "/tax-rate/AssignTaxRateToItem",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> taxRateAssignTaxRateToItemPost(@ApiParam(value = "") @Valid @RequestBody(required = false) AssignTaxRateToItemDTO assignTaxRateToItemDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        taxRateService.assignTaxRate(assignTaxRateToItemDTO, user);
        return RestUtils.ok();
    }


    /**
     * DELETE /tax-rate/{id} : Endpoint to delete a tax rate.
     *
     * @param id Id of the tax rate to delete. (required)
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to delete a tax rate.", nickname = "taxRateIdDelete", notes = "", tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @DeleteMapping(
            value = "/tax-rate/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<Void> taxRateIdDelete(@ApiParam(value = "Id of the tax rate to delete.", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        taxRateService.deleteTaxRate(id, user);
        return RestUtils.ok();
    }


    /**
     * GET /tax-rate/{id} : Endpoint to get a single tax rate.
     *
     * @param id Id of the tax rate to get (required)
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to get a single tax rate.", nickname = "taxRateIdGet", notes = "", response = TaxRate.class, tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TaxRate.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @GetMapping(
            value = "/tax-rate/{id}",
            produces = {"application/json"}
    )
    public ResponseEntity<TaxRate> taxRateIdGet(@ApiParam(value = "Id of the tax rate to get", required = true) @PathVariable("id") Integer id, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(taxRateService.getTaxRate(id, user));
    }


    /**
     * PUT /tax-rate/{id} : Endpoint to update a tax rate.
     *
     * @param id         Id of the tax rate to update. (required)
     * @param taxRateDto Tax rate to update. (optional)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @ApiOperation(value = "Endpoint to update a tax rate.", nickname = "taxRateIdPut", notes = "", tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class)})
    @PutMapping(
            value = "/tax-rate/{id}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> taxRateIdPut(@ApiParam(value = "Id of the tax rate to update.", required = true) @PathVariable("id") Integer id, @ApiParam(value = "Tax rate to update.") @Valid @RequestBody(required = false) TaxRateDto taxRateDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        taxRateService.putTaxRate(id, taxRateDto, user);
        return RestUtils.ok();
    }


    /**
     * GET /tax-rate/{pageSize}/{pageNumber} : Endpoint to get multiple tax rates.
     *
     * @param pageSize   The maximum amount of tax rates in response. (required)
     * @param pageNumber The page number of tax rates to return. (required)
     * @return Success (status code 200)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to get multiple tax rates.", nickname = "taxRatePageSizePageNumberGet", notes = "", response = TaxRate.class, responseContainer = "List", tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TaxRate.class, responseContainer = "List"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @GetMapping(
            value = "/tax-rate/{pageSize}/{pageNumber}",
            produces = {"application/json"}
    )
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public ResponseEntity<List<TaxRate>> taxRatePageSizePageNumberGet(@ApiParam(value = "The maximum amount of tax rates in response.", required = true) @PathVariable("pageSize") Integer pageSize, @ApiParam(value = "The page number of tax rates to return.", required = true) @PathVariable("pageNumber") Integer pageNumber, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(taxRateService.getTaxRates(pageSize, pageNumber, user));
    }


    /**
     * POST /tax-rate : Endpoint to create a new tax rate.
     *
     * @param taxRateDto Tax rate to create. (optional)
     * @return Success (status code 201)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to create a new tax rate.", nickname = "taxRatePost", notes = "", tags = {"TaxRate",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success"),
            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @PostMapping(
            value = "/tax-rate",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_EMPLOYEE')")
    public ResponseEntity<Void> taxRatePost(@ApiParam(value = "Tax rate to create.") @Valid @RequestBody(required = false) TaxRateDto taxRateDto, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        taxRateService.createTaxRate(taxRateDto, user);
        return RestUtils.ok();
    }
}
