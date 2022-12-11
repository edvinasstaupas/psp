package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.ProblemDetails;
import com.example.psp.dto.TimeSlotDTO;
import com.example.psp.security.User;
import com.example.psp.services.TimeSlotService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.time.OffsetDateTime;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
@RequiredArgsConstructor
public class TimeSlotApiController {

    private final TimeSlotService timeSlotService;

    private final UserDetailsService userDetailsService;

    /**
     * GET /time-slot/{employeeId} : Gets all time slots by employee id
     *
     * @param employeeId (required)
     * @return Returns time slot details (status code 200)
     * or If time slot ID is less or equal to 0 (status code 400)
     * or If no time slot ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets all time slots by employee id", nickname = "timeSlotEmployeeIdGet", notes = "", response = TimeSlotDTO.class, tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns time slot details", response = TimeSlotDTO.class),
            @ApiResponse(code = 400, message = "If time slot ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no time slot ID matched the search", response = ProblemDetails.class)})
    @GetMapping(
            value = "/time-slot/{employeeId}",
            produces = {"application/json"}
    )
    public ResponseEntity<List<TimeSlotDTO>> timeSlotEmployeeIdGet(@ApiParam(value = "", required = true) @PathVariable("employeeId") Integer employeeId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(timeSlotService.timeSlotEmployeeIdGet(employeeId, user));
    }


    /**
     * GET /time-slot : Gets all time slots by date
     *
     * @param fromDate (optional)
     * @param toDate   (optional)
     * @return Returns time slot details (status code 200)
     * or If provided dates are invalid (status code 400)
     * or If no dates matched the search (status code 404)
     */
    @ApiOperation(value = "Gets all time slots by date", nickname = "timeSlotGet", notes = "", response = TimeSlotDTO.class, tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns time slot details", response = TimeSlotDTO.class),
            @ApiResponse(code = 400, message = "If provided dates are invalid", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no dates matched the search", response = ProblemDetails.class)})
    @GetMapping(
            value = "/time-slot",
            produces = {"application/json"}
    )
    public ResponseEntity<List<TimeSlotDTO>> timeSlotGet(@ApiParam(value = "") @Valid @RequestParam(value = "FromDate", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) OffsetDateTime fromDate, @ApiParam(value = "") @Valid @RequestParam(value = "ToDate", required = false) @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME) OffsetDateTime toDate, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(timeSlotService.timeSlotGet(fromDate, toDate, user));
    }


    /**
     * GET /time-slot/{locationId} : Gets all time slots by location id
     *
     * @param locationId (required)
     * @return Returns time slot details (status code 200)
     * or If time slot location ID is less or equal to 0 (status code 400)
     * or If no time slot location ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets all time slots by location id", nickname = "timeSlotLocationIdGet", notes = "", response = TimeSlotDTO.class, tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns time slot details", response = TimeSlotDTO.class),
            @ApiResponse(code = 400, message = "If time slot location ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no time slot location ID matched the search", response = ProblemDetails.class)})
    @GetMapping(
            value = "/time-slot/{locationId}",
            produces = {"application/json"}
    )
    public ResponseEntity<List<TimeSlotDTO>> timeSlotLocationIdGet(@ApiParam(value = "", required = true) @PathVariable("locationId") Integer locationId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(timeSlotService.timeSlotLocationIdGet(locationId, user));
    }


    /**
     * POST /time-slot : Creates a time slot
     *
     * @param timeSlotDTO (optional)
     * @return If time slot has been succesfully created (status code 201)
     * or If provided time slot details do not pass the validation (status code 400)
     */
    @ApiOperation(value = "Creates a time slot", nickname = "timeSlotPost", notes = "", tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "If time slot has been succesfully created"),
            @ApiResponse(code = 400, message = "If provided time slot details do not pass the validation", response = ProblemDetails.class)})
    @PostMapping(
            value = "/time-slot",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> timeSlotPost(@ApiParam(value = "") @Valid @RequestBody(required = false) TimeSlotDTO timeSlotDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        timeSlotService.timeSlotPost(timeSlotDTO, user);
        return RestUtils.ok();
    }


    /**
     * GET /time-slot/{serviceId} : Gets all time slots by service id
     *
     * @param serviceId (required)
     * @return Success (status code 200)
     * or If time slot service ID is less or equal to 0 (status code 400)
     * or If no time slot service ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets all time slots by service id", nickname = "timeSlotServiceIdGet", notes = "", response = TimeSlotDTO.class, tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = TimeSlotDTO.class),
            @ApiResponse(code = 400, message = "If time slot service ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no time slot service ID matched the search", response = ProblemDetails.class)})
    @GetMapping(
            value = "/time-slot/{serviceId}",
            produces = {"application/json"}
    )
    public ResponseEntity<List<TimeSlotDTO>> timeSlotServiceIdGet(@ApiParam(value = "", required = true) @PathVariable("serviceId") Integer serviceId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(timeSlotService.timeSlotServiceIdGet(serviceId, user));
    }


    /**
     * DELETE /time-slot/{timeSlotId} : Deletes time slot
     *
     * @param timeSlotId (required)
     * @return If time slot have been succesfully deleted (status code 200)
     * or If time slot ID is less or equal to 0 (status code 400)
     * or If no time slot ID matched the search (status code 404)
     */
    @ApiOperation(value = "Deletes time slot", nickname = "timeSlotTimeSlotIdDelete", notes = "", tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If time slot have been succesfully deleted"),
            @ApiResponse(code = 400, message = "If time slot ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no time slot ID matched the search", response = ProblemDetails.class)})
    @DeleteMapping(
            value = "/time-slot/{timeSlotId}",
            produces = {"application/json"}
    )
    public ResponseEntity<Void> timeSlotTimeSlotIdDelete(@ApiParam(value = "", required = true) @PathVariable("timeSlotId") Integer timeSlotId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        timeSlotService.timeSlotTimeSlotIdDelete(timeSlotId, user);
        return RestUtils.ok();
    }


    /**
     * GET /time-slot/{timeSlotId} : Gets time slot details
     *
     * @param timeSlotId (required)
     * @return Returns time slot details (status code 200)
     * or If time slot ID is less or equal to 0 (status code 400)
     * or If no time slot ID matched the search (status code 404)
     */
    @ApiOperation(value = "Gets time slot details", nickname = "timeSlotTimeSlotIdGet", notes = "", response = TimeSlotDTO.class, tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Returns time slot details", response = TimeSlotDTO.class),
            @ApiResponse(code = 400, message = "If time slot ID is less or equal to 0", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no time slot ID matched the search", response = ProblemDetails.class)})
    @GetMapping(
            value = "/time-slot/{timeSlotId}",
            produces = {"application/json"}
    )
    public ResponseEntity<TimeSlotDTO> timeSlotTimeSlotIdGet(@ApiParam(value = "", required = true) @PathVariable("timeSlotId") Integer timeSlotId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(timeSlotService.timeSlotTimeSlotIdGet(timeSlotId, user));
    }


    /**
     * PUT /time-slot/{timeSlotId} : Updates time slot
     *
     * @param timeSlotId  (required)
     * @param timeSlotDTO (optional)
     * @return If time slot details have been succesfully updated (status code 200)
     * or If provided time slot details do not pass the validation (status code 400)
     * or If no time slot ID matched the search (status code 404)
     */
    @ApiOperation(value = "Updates time slot", nickname = "timeSlotTimeSlotIdPut", notes = "", tags = {"TimeSlot",})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "If time slot details have been succesfully updated"),
            @ApiResponse(code = 400, message = "If provided time slot details do not pass the validation", response = ProblemDetails.class),
            @ApiResponse(code = 404, message = "If no time slot ID matched the search", response = ProblemDetails.class)})
    @PutMapping(
            value = "/time-slot/{timeSlotId}",
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public ResponseEntity<Void> timeSlotTimeSlotIdPut(@ApiParam(value = "", required = true) @PathVariable("timeSlotId") Integer timeSlotId, @ApiParam(value = "") @Valid @RequestBody(required = false) TimeSlotDTO timeSlotDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        timeSlotService.timeSlotTimeSlotIdPut(timeSlotId, timeSlotDTO, user);
        return RestUtils.ok();
    }

}
