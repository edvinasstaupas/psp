package com.example.psp.api;

import com.example.psp.model.BriefSalesReportDTO;
import com.example.psp.model.DetailedSalesReportDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ReportApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface ReportApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /report/brief-sales-report : Endpoint to get brief sales report.
     *
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     * @see ReportApi#reportBriefSalesReportGet
     */
    default ResponseEntity<BriefSalesReportDTO> reportBriefSalesReportGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 2.3021358869347655, \"items\" : [ { \"quantity\" : 5, \"totalPrice\" : 5.637376656633329, \"name\" : \"name\", \"discount\" : 1.4658129805029452, \"tax\" : 6.027456183070403, \"id\" : 0 }, { \"quantity\" : 5, \"totalPrice\" : 5.637376656633329, \"name\" : \"name\", \"discount\" : 1.4658129805029452, \"tax\" : 6.027456183070403, \"id\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /report/detailed-sales-report : Endpoint to get detailed sales report.
     *
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     * @see ReportApi#reportDetailedSalesReportGet
     */
    default ResponseEntity<DetailedSalesReportDTO> reportDetailedSalesReportGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 0.8008281904610115, \"items\" : [ { \"unitPrice\" : 2.027123023002322, \"discountRate\" : 4.145608029883936, \"taxRate\" : 7.386281948385884, \"total\" : 1.2315135367772556, \"notes\" : \"notes\", \"quantity\" : 3, \"productId\" : 2, \"bundleId\" : 9, \"name\" : \"name\", \"id\" : 5, \"serviceId\" : 7 }, { \"unitPrice\" : 2.027123023002322, \"discountRate\" : 4.145608029883936, \"taxRate\" : 7.386281948385884, \"total\" : 1.2315135367772556, \"notes\" : \"notes\", \"quantity\" : 3, \"productId\" : 2, \"bundleId\" : 9, \"name\" : \"name\", \"id\" : 5, \"serviceId\" : 7 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
