package com.example.psp.api;

import com.example.psp.model.CreateReservationDTO;
import com.example.psp.model.ReservationInformationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link ReservationApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface ReservationApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /reservation : Creates a reservation.
     *
     * @param createReservationDTO Details needed to create a reservation. (optional)
     * @return Returns information of the newly created reservation. (status code 200)
     * @see ReservationApi#reservationPost
     */
    default ResponseEntity<ReservationInformationDTO> reservationPost(CreateReservationDTO createReservationDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"timeSlotId\" : 1, \"serviceWorkerName\" : \"serviceWorkerName\", \"reservationId\" : 0, \"ends\" : \"2000-01-23T04:56:07.000+00:00\", \"customerId\" : 6, \"serviceName\" : \"serviceName\", \"starts\" : \"2000-01-23T04:56:07.000+00:00\", \"customerName\" : \"customerName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /reservation/{reservationId}/cancel : Cancels a reservation.
     * At first should check if the action is being performed by an authorized user or service provider.  When the reservation gets canceled this endpoint should send a notification to the customer and the shop.
     *
     * @param reservationId Id of the reservation. (required)
     * @return Returns that cancelation completed successfully. (status code 200)
     * @see ReservationApi#reservationReservationIdCancelPost
     */
    default ResponseEntity<Void> reservationReservationIdCancelPost(Integer reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /reservation/{reservationId} : Gets a reservation by id.
     *
     * @param reservationId Id of the reservation (required)
     * @return Returns information of the specified reservation. (status code 200)
     *         or When reservation doesn&#39;t exist. (status code 404)
     * @see ReservationApi#reservationReservationIdGet
     */
    default ResponseEntity<ReservationInformationDTO> reservationReservationIdGet(Integer reservationId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"timeSlotId\" : 1, \"serviceWorkerName\" : \"serviceWorkerName\", \"reservationId\" : 0, \"ends\" : \"2000-01-23T04:56:07.000+00:00\", \"customerId\" : 6, \"serviceName\" : \"serviceName\", \"starts\" : \"2000-01-23T04:56:07.000+00:00\", \"customerName\" : \"customerName\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
