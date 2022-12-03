package com.example.psp.api;

import com.example.psp.model.AccountDetailsDTO;
import com.example.psp.model.BearerTokenDTO;
import com.example.psp.model.CartDTO;
import com.example.psp.model.CreateAccountDTO;
import com.example.psp.model.LoginDetailsDTO;
import java.time.OffsetDateTime;
import com.example.psp.model.ReservationInformationDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link CustomerApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface CustomerApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /customer/{customerId}/reservation : Returns a cart of a specified customer.
     *
     * @param customerId Id of the customer. (required)
     * @return Success (status code 200)
     *         or If customer doesn&#39;t exist. (status code 404)
     * @see CustomerApi#customerCustomerIdReservationGet
     */
    default ResponseEntity<CartDTO> customerCustomerIdReservationGet(Integer customerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"dateCreated\" : \"2000-01-23T04:56:07.000+00:00\", \"customerId\" : 6, \"lastAccessed\" : \"2000-01-23T04:56:07.000+00:00\", \"id\" : 0, \"items\" : [ { \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 }, { \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customer/{customerId}/reservation/list : Gets alist of reservations of a customer optionally filtered by date.
     *
     * @param customerId Id of the customer. (required)
     * @param from Get reservations starting after specified date. (optional)
     * @param to Get reservations starting before specified date. (optional)
     * @return Returns empty lsit is no reservations were found. (status code 200)
     *         or If user doesn&#39;t have authorization to view data. (status code 401)
     *         or If user is not authenticated. (status code 403)
     * @see CustomerApi#customerCustomerIdReservationListGet
     */
    default ResponseEntity<List<ReservationInformationDTO>> customerCustomerIdReservationListGet(Integer customerId,
        OffsetDateTime from,
        OffsetDateTime to) {
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
     * GET /customer : Endpoint for admins to get a list of registered users.
     *
     * @param email Optional parameter to query by email. (optional)
     * @param name Optional parameter to query by name. (optional)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     *         or If user doesn&#39;t exist (status code 404)
     * @see CustomerApi#customerGet
     */
    default ResponseEntity<List<AccountDetailsDTO>> customerGet(String email,
        String name,
        Integer pageSize,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /customer/login : Endpoint for customer to log in.
     *
     * @param loginDetailsDTO Login details of the customer. (optional)
     * @return Success (status code 200)
     * @see CustomerApi#customerLoginPost
     */
    default ResponseEntity<BearerTokenDTO> customerLoginPost(LoginDetailsDTO loginDetailsDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /customer : Endpoint for creating a new customer account.
     *
     * @param createAccountDTO Customer account details. (required)
     * @return Returns a bearer token of newly created account. (status code 201)
     *         or If account details don&#39;t pass validation. (status code 400)
     *         or If email matches a previously registered users email. (status code 409)
     * @see CustomerApi#customerPost
     */
    default ResponseEntity<BearerTokenDTO> customerPost(CreateAccountDTO createAccountDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"token\" : \"token\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /customer/{userId} : Endpoint to get user account details.
     *
     * @param userId  (required)
     * @return Success (status code 200)
     *         or If user doesn&#39;t exist (status code 404)
     * @see CustomerApi#customerUserIdGet
     */
    default ResponseEntity<AccountDetailsDTO> customerUserIdGet(Integer userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"email\" : \"email\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /customer/{userId} : Endpoint to update user account details.
     *
     * @param userId  (required)
     * @param createAccountDTO Customer account details. (optional)
     * @return Success (status code 200)
     *         or If account details don&#39;t pass validation. (status code 400)
     *         or If user doesn&#39;t exists. (status code 404)
     * @see CustomerApi#customerUserIdPut
     */
    default ResponseEntity<Void> customerUserIdPut(Integer userId,
        CreateAccountDTO createAccountDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
