package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.CreateReservationDTO;
import com.example.psp.dto.ReservationInformationDTO;
import com.example.psp.security.User;
import com.example.psp.services.ReservationService;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated

@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
@RequiredArgsConstructor
public class ReservationApiController {

    private final ReservationService reservationService;

    private final UserDetailsService userDetailsService;

    /**
     * POST /reservation : Creates a reservation.
     *
     * @param createReservationDTO Details needed to create a reservation. (optional)
     * @return Returns information of the newly created reservation. (status code 200)
     */
    @ApiOperation(value = "Creates a reservation.", nickname = "reservationPost", notes = "", response = ReservationInformationDTO.class, tags = {"Reservation",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns information of the newly created reservation.", response = ReservationInformationDTO.class)})
    @PostMapping(
            value = "/reservation",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<ReservationInformationDTO> reservationPost(@ApiParam(value = "Details needed to create a reservation.") @Valid @RequestBody(required = false) CreateReservationDTO createReservationDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(reservationService.reservationPost(createReservationDTO, user));
    }


    /**
     * POST /reservation/{reservationId}/cancel : Cancels a reservation.
     * At first should check if the action is being performed by an authorized user or service provider.  When the reservation gets canceled this endpoint should send a notification to the customer and the shop.
     *
     * @param reservationId Id of the reservation. (required)
     * @return Returns that cancelation completed successfully. (status code 200)
     */
    @ApiOperation(value = "Cancels a reservation.", nickname = "reservationReservationIdCancelPost", notes = "At first should check if the action is being performed by an authorized user or service provider.  When the reservation gets canceled this endpoint should send a notification to the customer and the shop.", tags = {"Reservation",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns that cancelation completed successfully."),
            @ApiResponse(code = 404, message = "Returns that reservation was not found.")
})

    @PostMapping(
            value = "/reservation/{reservationId}/cancel"
    )
    public ResponseEntity<Void> reservationReservationIdCancelPost(@ApiParam(value = "Id of the reservation.", required = true) @PathVariable("reservationId") Integer reservationId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        reservationService.reservationReservationIdCancelPost(reservationId, user);
        return RestUtils.ok();
    }


    /**
     * GET /reservation/{reservationId} : Gets a reservation by id.
     *
     * @param reservationId Id of the reservation (required)
     * @return Returns information of the specified reservation. (status code 200)
     * or When reservation doesn&#39;t exist. (status code 404)
     */
    @ApiOperation(value = "Gets a reservation by id.", nickname = "reservationReservationIdGet", notes = "", response = ReservationInformationDTO.class, tags = {"Reservation",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns information of the specified reservation.", response = ReservationInformationDTO.class),
            @ApiResponse(code = 404, message = "When reservation doesn't exist.")})
    @GetMapping(
            value = "/reservation/{reservationId}",
            produces = {"application/json"}
    )
    public ResponseEntity<ReservationInformationDTO> reservationReservationIdGet(@ApiParam(value = "Id of the reservation", required = true) @PathVariable("reservationId") Integer reservationId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(reservationService.reservationReservationIdGet(reservationId, user));
    }

}
