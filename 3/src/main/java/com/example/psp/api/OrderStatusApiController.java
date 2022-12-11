package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.OrderStatusDTO;
import com.example.psp.dto.OrderStatusEnum;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.security.User;
import com.example.psp.services.OrderStatusService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class OrderStatusApiController {

    private final OrderStatusService orderStatusService;

    private final UserDetailsService userDetailsService;
    /**
     * DELETE /order-status/{orderStatusId} : Deletes order status
     *
     * @param orderStatusId  (required)
     * @return If order status have been succesfully delete (status code 200)
     *         or If provided order status details do not pass the validation (status code 400)
     *         or If no order status ID matched the search (status code 404)
     */
    @ApiOperation(value = "Deletes order status", nickname = "orderStatusOrderStatusIdDelete", notes = "", tags={ "OrderStatus", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If order status have been succesfully delete"),
            @ApiResponse(code = 400, message = "If provided order status details do not pass the validation", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no order status ID matched the search", response = ProblemDetails.class) })
    @DeleteMapping(
            value = "/order-status/{orderStatusId}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> orderStatusOrderStatusIdDelete(@ApiParam(value = "",required=true) @PathVariable("orderStatusId") Integer orderStatusId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        orderStatusService.orderStatusOrderStatusIdDelete(orderStatusId, user);
        return RestUtils.ok();
    }


    /**
     * GET /order-status/{orderStatusId} : Gets order status
     *
     * @param orderStatusId  (required)
     * @return Returns order status (status code 200)
     *         or If order status ID is less or equal to 0 (status code 400)
     *         or If no orderstatus ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets order status", nickname = "orderStatusOrderStatusIdGet", notes = "", response = OrderStatusDTO.class, tags={ "OrderStatus", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns order status", response = OrderStatusDTO.class),
            @ApiResponse(code = 400, message = "If order status ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no orderstatus ID matched the search", response = ProblemDetails.class) })
    @GetMapping(
            value = "/order-status/{orderStatusId}",
            produces = { "application/json" }
    )
    public ResponseEntity<OrderStatusDTO> orderStatusOrderStatusIdGet(@ApiParam(value = "",required=true) @PathVariable("orderStatusId") Integer orderStatusId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(orderStatusService.orderStatusOrderStatusIdGet(orderStatusId, user));
    }


    /**
     * PATCH /order-status/{orderStatusId} : Updates order status
     *
     * @param orderStatusId  (required)
     * @param newOrderStatus  (optional)
     * @return If order status have been succesfully updated (status code 200)
     *         or If the provided order status enum value is invalid (status code 400)
     *         or If no order status ID matched the search (status code 404)
     */
    @ApiOperation(value = "Updates order status", nickname = "orderStatusOrderStatusIdPatch", notes = "", tags={ "OrderStatus", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If order status have been succesfully updated"),
            @ApiResponse(code = 400, message = "If the provided order status enum value is invalid", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no order status ID matched the search", response = ProblemDetails.class) })
    @PatchMapping(
            value = "/order-status/{orderStatusId}",
            produces = { "application/json" }
    )
    public ResponseEntity<Void> orderStatusOrderStatusIdPatch(@ApiParam(value = "",required=true) @PathVariable("orderStatusId") Integer orderStatusId,@ApiParam(value = "", allowableValues = "0, 1, 2, 3, 4, 5, 6, 7, 8, 9") @Valid @RequestParam(value = "newOrderStatus", required = false) OrderStatusEnum newOrderStatus, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        orderStatusService.orderStatusOrderStatusIdPatch(orderStatusId, newOrderStatus, user);
        return RestUtils.ok();
    }


    /**
     * PUT /order-status/{orderStatusId} : Updates order status
     *
     * @param orderStatusId  (required)
     * @param orderStatusDTO  (optional)
     * @return If order status have been succesfully updated (status code 200)
     *         or If provided order status details do not pass the validation (status code 400)
     *         or If no order status ID matched the search (status code 404)
     */
    @ApiOperation(value = "Updates order status", nickname = "orderStatusOrderStatusIdPut", notes = "", tags={ "OrderStatus", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If order status have been succesfully updated"),
            @ApiResponse(code = 400, message = "If provided order status details do not pass the validation", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no order status ID matched the search", response = ProblemDetails.class) })
    @PutMapping(
            value = "/order-status/{orderStatusId}",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> orderStatusOrderStatusIdPut(@ApiParam(value = "",required=true) @PathVariable("orderStatusId") Integer orderStatusId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) OrderStatusDTO orderStatusDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        orderStatusService.orderStatusOrderStatusIdPut(orderStatusId, orderStatusDTO, user);
        return RestUtils.ok();
    }


    /**
     * POST /order-status : Creates order status
     *
     * @param orderStatusDTO  (optional)
     * @return If order status has been succesfully created (status code 201)
     *         or If provided order status details do not pass the validation (status code 400)
     */
    @ApiOperation(value = "Creates order status", nickname = "orderStatusPost", notes = "", tags={ "OrderStatus", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "If order status has been succesfully created"),
            @ApiResponse(code = 400, message = "If provided order status details do not pass the validation", response = ProblemDetails.class) })
    @PostMapping(
            value = "/order-status",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> orderStatusPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) OrderStatusDTO orderStatusDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        orderStatusService.orderStatusPost(orderStatusDTO, user);
        return RestUtils.ok();
    }
}
