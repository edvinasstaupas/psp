package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.*;
import com.example.psp.security.User;
import com.example.psp.services.CustomerService;
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
import java.time.OffsetDateTime;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class CustomerApiController {


    private final CustomerService customerService;

    private final UserDetailsService userDetailsService;

    /**
     * GET /customer/{customerId}/reservation : Returns a cart of a specified customer.
     *
     * @param customerId Id of the customer. (required)
     * @return Success (status code 200)
     * or If customer doesn&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Returns a cart of a specified customer.", nickname = "customerCustomerIdReservationGet", notes = "", response = CartDTO.class, tags = {"Cart",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = CartDTO.class),
            @ApiResponse(code = 404, message = "If customer doesn't exist.")})
    @GetMapping(
            value = "/customer/{customerId}/reservation",
            produces = {"application/json"}
    )
    public ResponseEntity<CartDTO> customerCustomerIdReservationGet(@ApiParam(value = "Id of the customer.", required = true) @PathVariable("customerId") Integer customerId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(customerService.customerCustomerIdReservationGet(customerId, user));
    }


    /**
     * GET /customer/{customerId}/reservation/list : Gets alist of reservations of a customer optionally filtered by date.
     *
     * @param customerId Id of the customer. (required)
     * @param from       Get reservations starting after specified date. (optional)
     * @param to         Get reservations starting before specified date. (optional)
     * @return Returns empty lsit is no reservations were found. (status code 200)
     * or If user doesn&#39;t have authorization to view data. (status code 401)
     * or If user is not authenticated. (status code 403)
     */
    @ApiOperation(value = "Gets alist of reservations of a customer optionally filtered by date.", nickname = "customerCustomerIdReservationListGet", notes = "", response = ReservationInformationDTO.class, responseContainer = "List", tags = {"Reservation",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns empty lsit is no reservations were found.", response = ReservationInformationDTO.class, responseContainer = "List"),
            @ApiResponse(code = 401, message = "If user doesn't have authorization to view data."),
            @ApiResponse(code = 403, message = "If user is not authenticated.")})
    @GetMapping(
            value = "/customer/{customerId}/reservation/list",
            produces = {"application/json"}
    )
    public ResponseEntity<List<ReservationInformationDTO>> customerCustomerIdReservationListGet(@ApiParam(value = "Id of the customer.", required = true) @PathVariable("customerId") Integer customerId, @ApiParam(value = "Get reservations starting after specified date.") @Valid @RequestParam(value = "from", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) OffsetDateTime from, @ApiParam(value = "Get reservations starting before specified date.") @Valid @RequestParam(value = "to", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) OffsetDateTime to, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(customerService.customerCustomerIdReservationListGet(customerId, from, to, user));
    }


    /**
     * GET /customer : Endpoint for admins to get a list of registered users.
     *
     * @param email    Optional parameter to query by email. (optional)
     * @param name     Optional parameter to query by name. (optional)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page     Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * or If user doesn&#39;t exist (status code 404)
     */
    @ApiOperation(value = "Endpoint for admins to get a list of registered users.", nickname = "customerGet", notes = "", response = AccountDetailsDTO.class, responseContainer = "List", tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = AccountDetailsDTO.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "If user doesn't exist")})
    @GetMapping(
            value = "/customer",
            produces = {"application/json"}
    )
    public ResponseEntity<List<AccountDetailsDTO>> customerGet(@ApiParam(value = "Optional parameter to query by email.") @Valid @RequestParam(value = "email", required = false) String email, @ApiParam(value = "Optional parameter to query by name.") @Valid @RequestParam(value = "name", required = false) String name, @ApiParam(value = "Parameter to define how many records are in a page.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Parameter to specify which page of records to return.") @Valid @RequestParam(value = "page", required = false) Integer page, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(customerService.customerGet(email, name, pageSize, page, user));
    }

    /**
     * POST /customer : Endpoint for creating a new customer account.
     *
     * @param createAccountDTO Customer account details. (required)
     * @return Returns a bearer token of newly created account. (status code 201)
     * or If account details don&#39;t pass validation. (status code 400)
     * or If email matches a previously registered users email. (status code 409)
     */
    @ApiOperation(value = "Endpoint for creating a new customer account.", nickname = "customerPost", notes = "", response = BearerTokenDTO.class, tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Returns a bearer token of newly created account.", response = BearerTokenDTO.class),
            @ApiResponse(code = 400, message = "If account details don't pass validation."),
            @ApiResponse(code = 409, message = "If email matches a previously registered users email.")})
    @PostMapping(
            value = "/customer",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> customerPost(@ApiParam(value = "Customer account details.", required = true) @Valid @RequestBody CreateAccountDTO createAccountDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        customerService.customerPost(createAccountDTO, user);
        return RestUtils.ok();
    }


    /**
     * GET /customer/{userId} : Endpoint to get user account details.
     *
     * @param userId (required)
     * @return Success (status code 200)
     * or If user doesn&#39;t exist (status code 404)
     */
    @ApiOperation(value = "Endpoint to get user account details.", nickname = "customerUserIdGet", notes = "", response = AccountDetailsDTO.class, tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = AccountDetailsDTO.class),
            @ApiResponse(code = 404, message = "If user doesn't exist")})
    @GetMapping(
            value = "/customer/{userId}",
            produces = {"application/json"}
    )
    public ResponseEntity<AccountDetailsDTO> customerUserIdGet(@ApiParam(value = "", required = true) @PathVariable("userId") Integer userId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(customerService.customerUserIdGet(userId, user));
    }


    /**
     * PUT /customer/{userId} : Endpoint to update user account details.
     *
     * @param userId           (required)
     * @param createAccountDTO Customer account details. (optional)
     * @return Success (status code 200)
     * or If account details don&#39;t pass validation. (status code 400)
     * or If user doesn&#39;t exists. (status code 404)
     */
    @ApiOperation(value = "Endpoint to update user account details.", nickname = "customerUserIdPut", notes = "", tags = {"Customer",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If account details don't pass validation."),
            @ApiResponse(code = 404, message = "If user doesn't exists.")})
    @PutMapping(
            value = "/customer/{userId}",
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> customerUserIdPut(@ApiParam(value = "", required = true) @PathVariable("userId") Integer userId, @ApiParam(value = "Customer account details.") @Valid @RequestBody(required = false) CreateAccountDTO createAccountDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        customerService.customerUserIdPut(userId, createAccountDTO, user);
        return RestUtils.ok();
    }
}
