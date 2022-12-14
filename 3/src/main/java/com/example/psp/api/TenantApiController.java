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
public class TenantApiController {
//
//    private final TenantService tenantService;
//
//    private final UserDetailsService userDetailsService;
//
//    /**
//     * DELETE /tenant : Endpoint to delete a store.
//     *
//     * @return Success (status code 200)
//     */
//    @ApiOperation(value = "Endpoint to delete a store.", nickname = "tenantDelete", notes = "", tags={ "Tenant", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success") })
//    @DeleteMapping(
//            value = "/tenant"
//    )
//    public ResponseEntity<Void> tenantDelete(Principal principal) {
//        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
//        return tenantService.tenantDelete();
//    }
//
//
//    /**
//     * GET /tenant : Endpoint to get the details of a store.
//     *
//     * @return Success (status code 200)
//     *         or Unauthorized (status code 401)
//     *         or Not Found (status code 404)
//     */
//    @ApiOperation(value = "Endpoint to get the details of a store.", nickname = "tenantGet", notes = "", response = TenantAccountDetailsDTO.class, tags={ "Tenant", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success", response = TenantAccountDetailsDTO.class),
//            @ApiResponse(code = 401, message = "Unauthorized", response = ProblemDetails.class),
//            @ApiResponse(code = 404, message = "Not Found", response = ProblemDetails.class) })
//    @GetMapping(
//            value = "/tenant",
//            produces = { "application/json" }
//    )
//    public ResponseEntity<TenantAccountDetailsDTO> tenantGet(Principal principal) {
//        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
//        return tenantService.tenantGet();
//    }
//
//
//    /**
//     * POST /tenant/login : Endpoint to login to a store.
//     *
//     * @param credentialsDto  (optional)
//     * @return Success (status code 200)
//     *         or Bad Request (status code 400)
//     */
//    @ApiOperation(value = "Endpoint to login to a store.", nickname = "tenantLoginPost", notes = "", response = TokenDTO.class, tags={ "Tenant", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success", response = TokenDTO.class),
//            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class) })
//    @PostMapping(
//            value = "/tenant/login",
//            produces = { "application/json" },
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<TokenDTO> tenantLoginPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) CredentialsDto credentialsDto, Principal principal) {
//        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
//        return tenantService.tenantLoginPost(credentialsDto);
//    }
//
//
//    /**
//     * POST /tenant : Endpoint to create a new store.
//     *
//     * @param createTenantAccountDTO  (optional)
//     * @return Success (status code 200)
//     *         or Bad Request (status code 400)
//     */
//    @ApiOperation(value = "Endpoint to create a new store.", nickname = "tenantPost", notes = "", tags={ "Tenant", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success"),
//            @ApiResponse(code = 400, message = "Bad Request", response = ProblemDetails.class) })
//    @PostMapping(
//            value = "/tenant",
//            produces = { "application/json" },
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<Void> tenantPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) CreateTenantAccountDTO createTenantAccountDTO, Principal principal) {
//        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
//        return tenantService.tenantPost(createTenantAccountDTO);
//    }
//
//
//    /**
//     * PUT /tenant : Endpoint to update a store.
//     *
//     * @param createTenantAccountDTO  (optional)
//     * @return Success (status code 200)
//     */
//    @ApiOperation(value = "Endpoint to update a store.", nickname = "tenantPut", notes = "", tags={ "Tenant", })
//    @ApiResponses(value = {
//            @ApiResponse(code = 200, message = "Success") })
//    @PutMapping(
//            value = "/tenant",
//            consumes = { "application/json" }
//    )
//    public ResponseEntity<Void> tenantPut(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) CreateTenantAccountDTO createTenantAccountDTO) {
//        return tenantService.tenantPut(createTenantAccountDTO);
//    }

}
