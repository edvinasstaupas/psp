package com.example.psp.api;

import com.example.psp.dto.AssignDiscountToBrandDTO;
import com.example.psp.dto.AssignDiscountToCategoryDTO;
import com.example.psp.dto.AssignDiscountToItemDTO;
import com.example.psp.dto.Discount;
import com.example.psp.dto.DiscountDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link DiscountApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface DiscountApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /discount/AssignDiscountToBrand : Endpoint to assign a discount to a brand.
     *
     * @param assignDiscountToBrandDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see DiscountApi#discountAssignDiscountToBrandPost
     */
    default ResponseEntity<Void> discountAssignDiscountToBrandPost(AssignDiscountToBrandDTO assignDiscountToBrandDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /discount/assignDiscountToCategory : Endpoint to assign a discount to a category.
     *
     * @param assignDiscountToCategoryDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see DiscountApi#discountAssignDiscountToCategoryPost
     */
    default ResponseEntity<Void> discountAssignDiscountToCategoryPost(AssignDiscountToCategoryDTO assignDiscountToCategoryDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /discount/AssignDiscountToItem : Endpoint to assign a discount to a product or service.
     *
     * @param assignDiscountToItemDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see DiscountApi#discountAssignDiscountToItemPost
     */
    default ResponseEntity<Void> discountAssignDiscountToItemPost(AssignDiscountToItemDTO assignDiscountToItemDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /discount/{id} : Endpoint to get a single discount.
     *
     * @param id Id of the discount to get (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see DiscountApi#discountIdGet
     */
    default ResponseEntity<DiscountDto> discountIdGet(Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 0.8008281904610115, \"name\" : \"name\", \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\", \"expiresAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /discount/{id} : Endpoint to update a discount.
     *
     * @param id Id of the discount to update. (required)
     * @param discountDto Discount to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see DiscountApi#discountIdPut
     */
    default ResponseEntity<Void> discountIdPut(Integer id,
        DiscountDto discountDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /discount/{pageSize}/{pageNumber} : Endpoint to get multiple discounts.
     *
     * @param pageSize The maximum amount of discounts in response. (required)
     * @param pageNumber The page number of discounts to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see DiscountApi#discountPageSizePageNumberGet
     */
    default ResponseEntity<List<Discount>> discountPageSizePageNumberGet(Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 1.4658129805029452, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0, \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\", \"expiresAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /discount : Endpoint to create a new discount.
     *
     * @param discountDto Discount to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see DiscountApi#discountPost
     */
    default ResponseEntity<Void> discountPost(DiscountDto discountDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
