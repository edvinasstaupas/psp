package com.example.psp.api;

import java.time.OffsetDateTime;

import com.example.psp.model.TimeSlotDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link TimeSlotApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface TimeSlotApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /time-slot/{employeeId} : Gets all time slots by employee id
     *
     * @param employeeId  (required)
     * @return Returns time slot details (status code 200)
     *         or If time slot ID is less or equal to 0 (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TimeSlotApi#timeSlotEmployeeIdGet
     */
    default ResponseEntity<TimeSlotDTO> timeSlotEmployeeIdGet(Integer employeeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"locationId\" : 6, \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"serviceId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /time-slot : Gets all time slots by date
     *
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @return Returns time slot details (status code 200)
     *         or If provided dates are invalid (status code 400)
     *         or If no dates matched the search (status code 404)
     * @see TimeSlotApi#timeSlotGet
     */
    default ResponseEntity<TimeSlotDTO> timeSlotGet(OffsetDateTime fromDate,
        OffsetDateTime toDate) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"locationId\" : 6, \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"serviceId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /time-slot/{locationId} : Gets all time slots by location id
     *
     * @param locationId  (required)
     * @return Returns time slot details (status code 200)
     *         or If time slot location ID is less or equal to 0 (status code 400)
     *         or If no time slot location ID matched the search (status code 404)
     * @see TimeSlotApi#timeSlotLocationIdGet
     */
    default ResponseEntity<TimeSlotDTO> timeSlotLocationIdGet(Integer locationId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"locationId\" : 6, \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"serviceId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /time-slot : Creates a time slot
     *
     * @param timeSlotDTO  (optional)
     * @return If time slot has been succesfully created (status code 201)
     *         or If provided time slot details do not pass the validation (status code 400)
     * @see TimeSlotApi#timeSlotPost
     */
    default ResponseEntity<Void> timeSlotPost(TimeSlotDTO timeSlotDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /time-slot/{serviceId} : Gets all time slots by service id
     *
     * @param serviceId  (required)
     * @return Success (status code 200)
     *         or If time slot service ID is less or equal to 0 (status code 400)
     *         or If no time slot service ID matched the search (status code 404)
     * @see TimeSlotApi#timeSlotServiceIdGet
     */
    default ResponseEntity<TimeSlotDTO> timeSlotServiceIdGet(Integer serviceId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"locationId\" : 6, \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"serviceId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /time-slot/{timeSlotId} : Deletes time slot
     *
     * @param timeSlotId  (required)
     * @return If time slot have been succesfully deleted (status code 200)
     *         or If time slot ID is less or equal to 0 (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TimeSlotApi#timeSlotTimeSlotIdDelete
     */
    default ResponseEntity<Void> timeSlotTimeSlotIdDelete(Integer timeSlotId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /time-slot/{timeSlotId} : Gets time slot details
     *
     * @param timeSlotId  (required)
     * @return Returns time slot details (status code 200)
     *         or If time slot ID is less or equal to 0 (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TimeSlotApi#timeSlotTimeSlotIdGet
     */
    default ResponseEntity<TimeSlotDTO> timeSlotTimeSlotIdGet(Integer timeSlotId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"locationId\" : 6, \"employeeId\" : 1, \"startTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endTime\" : \"2000-01-23T04:56:07.000+00:00\", \"serviceId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /time-slot/{timeSlotId} : Updates time slot
     *
     * @param timeSlotId  (required)
     * @param timeSlotDTO  (optional)
     * @return If time slot details have been succesfully updated (status code 200)
     *         or If provided time slot details do not pass the validation (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TimeSlotApi#timeSlotTimeSlotIdPut
     */
    default ResponseEntity<Void> timeSlotTimeSlotIdPut(Integer timeSlotId,
        TimeSlotDTO timeSlotDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
