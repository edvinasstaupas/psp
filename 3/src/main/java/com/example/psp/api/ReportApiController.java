package com.example.psp.api;

import com.example.psp.dto.BriefSalesReportDTO;
import com.example.psp.dto.DetailedSalesReportDTO;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.security.User;
import com.example.psp.services.ReportService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated

@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
@RequiredArgsConstructor
public class ReportApiController {

    private final ReportService reportService;

    private final UserDetailsService userDetailsService;

    /**
     * GET /report/brief-sales-report : Endpoint to get brief sales report.
     *
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to get brief sales report.", nickname = "reportBriefSalesReportGet", notes = "", response = BriefSalesReportDTO.class, tags = {"Report",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = BriefSalesReportDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @GetMapping(
            value = "/report/brief-sales-report",
            produces = {"application/json"}
    )
    public ResponseEntity<BriefSalesReportDTO> reportBriefSalesReportGet(Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(reportService.reportBriefSalesReportGet(user));
    }


    /**
     * GET /report/detailed-sales-report : Endpoint to get detailed sales report.
     *
     * @return Success (status code 200)
     * or Unauthorized (status code 401)
     */
    @ApiOperation(value = "Endpoint to get detailed sales report.", nickname = "reportDetailedSalesReportGet", notes = "", response = DetailedSalesReportDTO.class, tags = {"Report",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = DetailedSalesReportDTO.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class)})
    @GetMapping(
            value = "/report/detailed-sales-report",
            produces = {"application/json"}
    )
    public ResponseEntity<DetailedSalesReportDTO> reportDetailedSalesReportGet(Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(reportService.reportDetailedSalesReportGet(user));
    }

}
