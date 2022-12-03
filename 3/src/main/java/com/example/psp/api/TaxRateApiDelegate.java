package com.example.psp.api;

import com.example.psp.dto.ApplyTaxRateToCategoryDTO;
import com.example.psp.dto.AssignTaxRateToItemDTO;
import com.example.psp.dto.TaxRate;
import com.example.psp.dto.TaxRateDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TaxRateApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface TaxRateApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /tax-rate/apply-tax-rate-to-category : Endpoint for applying tax rate to all items in the category.
     *
     * @param applyTaxRateToCategoryDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TaxRateApi#taxRateApplyTaxRateToCategoryPost
     */
    default ResponseEntity<Void> taxRateApplyTaxRateToCategoryPost(ApplyTaxRateToCategoryDTO applyTaxRateToCategoryDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /tax-rate/AssignTaxRateToItem : Endpoint for assigning tax rate to an item.
     *
     * @param assignTaxRateToItemDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TaxRateApi#taxRateAssignTaxRateToItemPost
     */
    default ResponseEntity<Void> taxRateAssignTaxRateToItemPost(AssignTaxRateToItemDTO assignTaxRateToItemDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /tax-rate/{id} : Endpoint to delete a tax rate.
     *
     * @param id Id of the tax rate to delete. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TaxRateApi#taxRateIdDelete
     */
    default ResponseEntity<Void> taxRateIdDelete(Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /tax-rate/{id} : Endpoint to get a single tax rate.
     *
     * @param id Id of the tax rate to get (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TaxRateApi#taxRateIdGet
     */
    default ResponseEntity<TaxRate> taxRateIdGet(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 1.4658129805029452, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /tax-rate/{id} : Endpoint to update a tax rate.
     *
     * @param id Id of the tax rate to update. (required)
     * @param taxRateDto Tax rate to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TaxRateApi#taxRateIdPut
     */
    default ResponseEntity<Void> taxRateIdPut(Integer id,
        TaxRateDto taxRateDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /tax-rate/{pageSize}/{pageNumber} : Endpoint to get multiple tax rates.
     *
     * @param pageSize The maximum amount of tax rates in response. (required)
     * @param pageNumber The page number of tax rates to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TaxRateApi#taxRatePageSizePageNumberGet
     */
    default ResponseEntity<List<TaxRate>> taxRatePageSizePageNumberGet(Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 1.4658129805029452, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /tax-rate : Endpoint to create a new tax rate.
     *
     * @param taxRateDto Tax rate to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TaxRateApi#taxRatePost
     */
    default ResponseEntity<Void> taxRatePost(TaxRateDto taxRateDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
