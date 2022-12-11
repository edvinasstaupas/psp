package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.CreateOrderDTO;
import com.example.psp.dto.OrderDTO;
import com.example.psp.dto.PaymentDTO;
import com.example.psp.security.User;
import com.example.psp.services.OrderService;
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
public class OrderApiController {

    private final OrderService orderService;

    private final UserDetailsService userDetailsService;
    /**
     * GET /order/{orderId} : Gets order by id.
     *
     * @param orderId Id of the order. (required)
     * @return Returns order information. (status code 200)
     *         or If order doesn&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Gets order by id.", nickname = "orderOrderIdGet", notes = "", response = OrderDTO.class, tags={ "Order", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns order information.", response = OrderDTO.class),
            @ApiResponse(code = 404, message = "If order doesn't exist.") })
    @GetMapping(
            value = "/order/{orderId}",
            produces = { "application/json" }
    )
    public ResponseEntity<OrderDTO> orderOrderIdGet(@ApiParam(value = "Id of the order.",required=true) @PathVariable("orderId") Integer orderId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(orderService.orderOrderIdGet(orderId, user));
    }


    /**
     * POST /order/{orderId}/payment : Links a payment to an order.
     *
     * @param orderId Id of the order. (required)
     * @param paymentDTO Payment information. (optional)
     * @return Returns payment information. (status code 200)
     *         or If paid with digital money, but change field is filled. (status code 400)
     *         or If order doesn&#39;t exists. (status code 404)
     */
    @ApiOperation(value = "Links a payment to an order.", nickname = "orderOrderIdPaymentPost", notes = "", response = PaymentDTO.class, tags={ "Order", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns payment information.", response = PaymentDTO.class),
            @ApiResponse(code = 400, message = "If paid with digital money, but change field is filled."),
            @ApiResponse(code = 404, message = "If order doesn't exists.") })
    @PostMapping(
            value = "/order/{orderId}/payment",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<PaymentDTO> orderOrderIdPaymentPost(@ApiParam(value = "Id of the order.",required=true) @PathVariable("orderId") Integer orderId,@ApiParam(value = "Payment information."  )  @Valid @RequestBody(required = false) PaymentDTO paymentDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(orderService.orderOrderIdPaymentPost(orderId, paymentDTO, user));
    }


    /**
     * POST /order/{orderId}/refund : Refunds an order.
     * This endpoint can only be used by an authorised service providers.
     *
     * @param orderId Id of the order. (required)
     * @return Returns a response that order was refunded successfully. (status code 200)
     *         or If order doesn&#39;t exists. (status code 404)
     */
    @ApiOperation(value = "Refunds an order.", nickname = "orderOrderIdRefundPost", notes = "This endpoint can only be used by an authorised service providers.", tags={ "Order", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns a response that order was refunded successfully."),
            @ApiResponse(code = 404, message = "If order doesn't exists.") })
    @PostMapping(
            value = "/order/{orderId}/refund"
    )
    public ResponseEntity<Void> orderOrderIdRefundPost(@ApiParam(value = "Id of the order.",required=true) @PathVariable("orderId") Integer orderId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        orderService.orderOrderIdRefundPost(orderId, user);
        return RestUtils.ok();
    }


    /**
     * POST /order : Creates and order.
     *
     * @param createOrderDTO Information required to create an order. (optional)
     * @return Returns information of the newly created order. (status code 200)
     */
    @ApiOperation(value = "Creates and order.", nickname = "orderPost", notes = "", response = OrderDTO.class, tags={ "Order", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns information of the newly created order.", response = OrderDTO.class) })
    @PostMapping(
            value = "/order",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    public ResponseEntity<OrderDTO> orderPost(@ApiParam(value = "Information required to create an order."  )  @Valid @RequestBody(required = false) CreateOrderDTO createOrderDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(orderService.orderPost(createOrderDTO, user));
    }

}
