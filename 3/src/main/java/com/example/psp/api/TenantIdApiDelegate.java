package com.example.psp.api;

import com.example.psp.model.AccountDetailsDTO;
import com.example.psp.model.AddCartItemDTO;
import com.example.psp.model.ApplyTaxRateToCategoryDTO;
import com.example.psp.model.AssignDiscountToBrandDTO;
import com.example.psp.model.AssignDiscountToCategoryDTO;
import com.example.psp.model.AssignDiscountToItemDTO;
import com.example.psp.model.AssignTaxRateToItemDTO;
import com.example.psp.model.BearerTokenDTO;
import com.example.psp.model.BriefSalesReportDTO;
import com.example.psp.model.BundleDTO;
import com.example.psp.model.BundleProduct;
import com.example.psp.model.CartDTO;
import com.example.psp.model.CartItem;
import com.example.psp.model.CartItemDTO;
import com.example.psp.model.CreateAccountDTO;
import com.example.psp.model.CreateReservationDTO;
import com.example.psp.model.DetailedSalesReportDTO;
import com.example.psp.model.Discount;
import com.example.psp.model.DiscountDto;
import com.example.psp.model.EmployeeDTO;
import com.example.psp.model.EmployeePermissionDTO;
import com.example.psp.model.Location;
import com.example.psp.model.LocationDto;
import com.example.psp.model.LoginDetailsDTO;
import com.example.psp.model.MaterialDTO;
import java.time.OffsetDateTime;
import com.example.psp.model.OrderStatusDTO;
import com.example.psp.model.OrderStatusTypes;
import com.example.psp.model.ProductDTO;
import com.example.psp.model.ProductMaterial;
import com.example.psp.model.ProductStatusDTO;
import com.example.psp.model.ReservationInformationDTO;
import com.example.psp.model.Service;
import com.example.psp.model.ServiceDto;
import com.example.psp.model.ServiceFilterDto;
import com.example.psp.model.TaxRate;
import com.example.psp.model.TaxRateDto;
import com.example.psp.model.TimeSlotDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TenantIdApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
public interface TenantIdApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /{tenantId}/Bundle/{bundleId} : Delete bundle by id.
     *
     * @param bundleId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdBundleBundleIdDelete
     */
    default ResponseEntity<Void> tenantIdBundleBundleIdDelete(Integer bundleId,
        String tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Bundle/{bundleId} : Get bundle by Id.
     *
     * @param bundleId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdBundleBundleIdGet
     */
    default ResponseEntity<BundleDTO> tenantIdBundleBundleIdGet(Integer bundleId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"products\" : [ { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }, { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Bundle/{bundleId} : Update bundle by id.
     *
     * @param bundleId  (required)
     * @param tenantId  (required)
     * @param bundleDTO  (optional)
     * @return Success (status code 200)
     *         or If some bundle details are missing. (status code 400)
     *         or If bundle with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdBundleBundleIdPut
     */
    default ResponseEntity<Void> tenantIdBundleBundleIdPut(Integer bundleId,
        String tenantId,
        BundleDTO bundleDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Bundle : Get a list of bundles.
     *
     * @param tenantId  (required)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * @see TenantIdApi#tenantIdBundleGet
     */
    default ResponseEntity<List<BundleDTO>> tenantIdBundleGet(String tenantId,
        Integer pageSize,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"products\" : [ { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }, { \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Bundle : Create bundle.
     *
     * @param tenantId  (required)
     * @param bundleDTO  (optional)
     * @return Success (status code 200)
     *         or If some bundle details are missing. (status code 400)
     * @see TenantIdApi#tenantIdBundlePost
     */
    default ResponseEntity<Void> tenantIdBundlePost(String tenantId,
        BundleDTO bundleDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/BundleProduct/{bundleId} : Get list of bundle&#39;s all assigned products by bundle Id.
     *
     * @param bundleId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If bundle with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdBundleProductBundleIdGet
     */
    default ResponseEntity<List<BundleProduct>> tenantIdBundleProductBundleIdGet(Integer bundleId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/BundleProduct/{bundleId}/{productId} : Delete bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     * @see TenantIdApi#tenantIdBundleProductBundleIdProductIdDelete
     */
    default ResponseEntity<Void> tenantIdBundleProductBundleIdProductIdDelete(Integer bundleId,
        Integer productId,
        String tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/BundleProduct/{bundleId}/{productId} : Get bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     * @see TenantIdApi#tenantIdBundleProductBundleIdProductIdGet
     */
    default ResponseEntity<BundleProduct> tenantIdBundleProductBundleIdProductIdGet(Integer bundleId,
        Integer productId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 5, \"bundle_id\" : 1, \"product_id\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/BundleProduct/{bundleId}/{productId} : Update bundle&#39;s assigned product by bundle Id and product Id.
     *
     * @param bundleId  (required)
     * @param productId  (required)
     * @param tenantId  (required)
     * @param bundleProduct  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     *         or If product with such id is not assigned to bundle with such id. (status code 404)
     * @see TenantIdApi#tenantIdBundleProductBundleIdProductIdPut
     */
    default ResponseEntity<Void> tenantIdBundleProductBundleIdProductIdPut(Integer bundleId,
        Integer productId,
        String tenantId,
        BundleProduct bundleProduct) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/BundleProduct : Assign product to a bundle.
     *
     * @param tenantId  (required)
     * @param bundleProduct  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     * @see TenantIdApi#tenantIdBundleProductPost
     */
    default ResponseEntity<Void> tenantIdBundleProductPost(String tenantId,
        BundleProduct bundleProduct) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Cart/{cartId} : Get a cart by id.
     *
     * @param tenantId Id of the tenant. (required)
     * @param cartId Id of the cart. (required)
     * @return Returns the cart. (status code 200)
     *         or If cart doesn&#39;t exist. (status code 404)
     * @see TenantIdApi#tenantIdCartCartIdGet
     */
    default ResponseEntity<CartDTO> tenantIdCartCartIdGet(Integer tenantId,
        Integer cartId) {
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
     * POST /{tenantId}/Cart/CartId : Adds an item to a cart.
     *
     * @param tenantId Id of the tenant. (required)
     * @param cartId Id of the cart. (optional)
     * @param addCartItemDTO Item to be added to the cart. (optional)
     * @return Returns newly added cart item. (status code 200)
     *         or If ids of both product and bundle are provided. (status code 400)
     *         or If cart doen&#39;t exist. (status code 404)
     * @see TenantIdApi#tenantIdCartCartIdPost
     */
    default ResponseEntity<CartItemDTO> tenantIdCartCartIdPost(Integer tenantId,
        Integer cartId,
        AddCartItemDTO addCartItemDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"itemName\" : \"itemName\", \"quantity\" : 9, \"productId\" : 5, \"cartId\" : 5, \"bundleId\" : 2, \"itemPrice\" : 7.061401241503109, \"id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/Cart/Item/{cartItemId} : Removes cart item from a cart.
     *
     * @param tenantId Id of the tenant. (required)
     * @param cartItemId Id of the cart item. (required)
     * @return Returns a response that cart item was removed successfully. (status code 200)
     *         or If cart item doesn&#39;t exist. (status code 404)
     * @see TenantIdApi#tenantIdCartItemCartItemIdDelete
     */
    default ResponseEntity<Void> tenantIdCartItemCartItemIdDelete(Integer tenantId,
        Integer cartItemId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Cart/Item/{itemId} : Updates cart item.
     * If item quantity is set to 0, item should be removed from the cart.
     *
     * @param tenantId Id of the tenant. (required)
     * @param itemId Id of the cart item. (required)
     * @param cartItem Cart item with updated information. (optional)
     * @return Returns cart item with updated information. (status code 200)
     *         or If cart item doesn&#39;t exist. (status code 404)
     * @see TenantIdApi#tenantIdCartItemItemIdPut
     */
    default ResponseEntity<Void> tenantIdCartItemItemIdPut(Integer tenantId,
        Integer itemId,
        CartItem cartItem) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Cart : Creates a cart for a specified customer.
     *
     * @param tenantId Id of the tenant. (required)
     * @param body Id of the customer. (optional)
     * @return Returns newly created cart. (status code 200)
     *         or If customer doesn&#39;t exists. (status code 404)
     * @see TenantIdApi#tenantIdCartPost
     */
    default ResponseEntity<CartDTO> tenantIdCartPost(Integer tenantId,
        Integer body) {
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
     * GET /{tenantId}/Customer/{customerId}/Cart : Returns a cart of a specified customer.
     *
     * @param tenantId Id of the tenant. (required)
     * @param customerId Id of the customer. (required)
     * @return Success (status code 200)
     *         or If customer doesn&#39;t exist. (status code 404)
     * @see TenantIdApi#tenantIdCustomerCustomerIdCartGet
     */
    default ResponseEntity<CartDTO> tenantIdCustomerCustomerIdCartGet(Integer tenantId,
        Integer customerId) {
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
     * GET /{tenantId}/Customer/{customerId}/Reservation : Gets alist of reservations of a customer optionally filtered by date.
     *
     * @param tenantId Id of the tenant. (required)
     * @param customerId Id of the customer. (required)
     * @param from Get reservations starting after specified date. (optional)
     * @param to Get reservations starting before specified date. (optional)
     * @return Returns empty lsit is no reservations were found. (status code 200)
     *         or If user doesn&#39;t have authorization to view data. (status code 401)
     *         or If user is not authenticated. (status code 403)
     * @see TenantIdApi#tenantIdCustomerCustomerIdReservationGet
     */
    default ResponseEntity<List<ReservationInformationDTO>> tenantIdCustomerCustomerIdReservationGet(Integer tenantId,
        Integer customerId,
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
     * GET /{tenantId}/Customer : Endpoint for admins to get a list of registered users.
     *
     * @param tenantId Id of the tenant. (required)
     * @param email Optional parameter to query by email. (optional)
     * @param name Optional parameter to query by name. (optional)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     *         or If user doesn&#39;t exist (status code 404)
     * @see TenantIdApi#tenantIdCustomerGet
     */
    default ResponseEntity<List<AccountDetailsDTO>> tenantIdCustomerGet(Integer tenantId,
        String email,
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
     * POST /{tenantId}/Customer/login : Endpoint for customer to log in.
     *
     * @param tenantId  (required)
     * @param loginDetailsDTO Login details of the customer. (optional)
     * @return Success (status code 200)
     * @see TenantIdApi#tenantIdCustomerLoginPost
     */
    default ResponseEntity<BearerTokenDTO> tenantIdCustomerLoginPost(String tenantId,
        LoginDetailsDTO loginDetailsDTO) {
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
     * POST /{tenantId}/Customer : Endpoint for creating a new customer account.
     *
     * @param tenantId Id of the store customer is registering to. (required)
     * @param createAccountDTO Customer account details. (required)
     * @return Returns a bearer token of newly created account. (status code 201)
     *         or If account details don&#39;t pass validation. (status code 400)
     *         or If email matches a previously registered users email. (status code 409)
     * @see TenantIdApi#tenantIdCustomerPost
     */
    default ResponseEntity<BearerTokenDTO> tenantIdCustomerPost(Integer tenantId,
        CreateAccountDTO createAccountDTO) {
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
     * GET /{tenantId}/Customer/{userId} : Endpoint to get user account details.
     *
     * @param userId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If user doesn&#39;t exist (status code 404)
     * @see TenantIdApi#tenantIdCustomerUserIdGet
     */
    default ResponseEntity<AccountDetailsDTO> tenantIdCustomerUserIdGet(Integer userId,
        String tenantId) {
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
     * PUT /{tenantId}/Customer/{userId} : Endpoint to update user account details.
     *
     * @param userId  (required)
     * @param tenantId  (required)
     * @param createAccountDTO Customer account details. (optional)
     * @return Success (status code 200)
     *         or If account details don&#39;t pass validation. (status code 400)
     *         or If user doesn&#39;t exists. (status code 404)
     * @see TenantIdApi#tenantIdCustomerUserIdPut
     */
    default ResponseEntity<Void> tenantIdCustomerUserIdPut(Integer userId,
        String tenantId,
        CreateAccountDTO createAccountDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Discount/AssignDiscountToBrand : Endpoint to assign a discount to a brand.
     *
     * @param tenantId Id of the store. (required)
     * @param assignDiscountToBrandDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdDiscountAssignDiscountToBrandPost
     */
    default ResponseEntity<Void> tenantIdDiscountAssignDiscountToBrandPost(Integer tenantId,
        AssignDiscountToBrandDTO assignDiscountToBrandDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Discount/AssignDiscountToCategory : Endpoint to assign a discount to a category.
     *
     * @param tenantId Id of the store. (required)
     * @param assignDiscountToCategoryDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdDiscountAssignDiscountToCategoryPost
     */
    default ResponseEntity<Void> tenantIdDiscountAssignDiscountToCategoryPost(Integer tenantId,
        AssignDiscountToCategoryDTO assignDiscountToCategoryDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Discount/AssignDiscountToItem : Endpoint to assign a discount to a product or service.
     *
     * @param tenantId Id of the store. (required)
     * @param assignDiscountToItemDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdDiscountAssignDiscountToItemPost
     */
    default ResponseEntity<Void> tenantIdDiscountAssignDiscountToItemPost(Integer tenantId,
        AssignDiscountToItemDTO assignDiscountToItemDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Discount/{id} : Endpoint to get a single discount.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the discount to get (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdDiscountIdGet
     */
    default ResponseEntity<DiscountDto> tenantIdDiscountIdGet(Integer tenantId,
        Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 0.8008281904610115, \"name\" : \"name\", \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\", \"expiresAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Discount/{id} : Endpoint to update a discount.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the discount to update. (required)
     * @param discountDto Discount to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdDiscountIdPut
     */
    default ResponseEntity<Void> tenantIdDiscountIdPut(Integer tenantId,
        Integer id,
        DiscountDto discountDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Discount/{pageSize}/{pageNumber} : Endpoint to get multiple discounts.
     *
     * @param tenantId Id of the store. (required)
     * @param pageSize The maximum amount of discounts in response. (required)
     * @param pageNumber The page number of discounts to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdDiscountPageSizePageNumberGet
     */
    default ResponseEntity<List<Discount>> tenantIdDiscountPageSizePageNumberGet(Integer tenantId,
        Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 1.4658129805029452, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0, \"validFrom\" : \"2000-01-23T04:56:07.000+00:00\", \"expiresAt\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Discount : Endpoint to create a new discount.
     *
     * @param tenantId  (required)
     * @param discountDto Discount to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdDiscountPost
     */
    default ResponseEntity<Void> tenantIdDiscountPost(String tenantId,
        DiscountDto discountDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/Employee/{employeeId} : Deletes employee
     *
     * @param tenantId  (required)
     * @param employeeId  (required)
     * @return If employee have been succesfully deleted (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeeEmployeeIdDelete
     */
    default ResponseEntity<Void> tenantIdEmployeeEmployeeIdDelete(Integer tenantId,
        Integer employeeId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Employee/{employeeId} : Gets employee details
     *
     * @param tenantId  (required)
     * @param employeeId ID of the employee (required)
     * @return Returns employee details (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeeEmployeeIdGet
     */
    default ResponseEntity<EmployeeDTO> tenantIdEmployeeEmployeeIdGet(Integer tenantId,
        Integer employeeId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"role\" : \"role\", \"dateHired\" : \"2000-01-23T04:56:07.000+00:00\", \"dateDeleted\" : \"2000-01-23T04:56:07.000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /{tenantId}/Employee/{employeeId} : Hides the employee
     *
     * @param tenantId  (required)
     * @param employeeId  (required)
     * @param date  (optional)
     * @return If employee have been succesfully hiden (status code 200)
     *         or If invalid date provided (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeeEmployeeIdPatch
     */
    default ResponseEntity<Void> tenantIdEmployeeEmployeeIdPatch(Integer tenantId,
        Integer employeeId,
        OffsetDateTime date) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /{tenantId}/Employee/{employeeId}/{permissionId} : Changes employee permissions
     *
     * @param tenantId  (required)
     * @param employeeId  (required)
     * @param permissionId  (required)
     * @return If the employee permissions have been succesfully updated (status code 200)
     *         or If employee ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeeEmployeeIdPermissionIdPatch
     */
    default ResponseEntity<Void> tenantIdEmployeeEmployeeIdPermissionIdPatch(Integer tenantId,
        Integer employeeId,
        Integer permissionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Employee/{employeeId} : Updates employee details
     *
     * @param tenantId  (required)
     * @param employeeId  (required)
     * @param employeeDTO  (optional)
     * @return If employee details have been succesfully updated (status code 200)
     *         or If provided employee details do not pass the validation (status code 400)
     *         or If no employee ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeeEmployeeIdPut
     */
    default ResponseEntity<Void> tenantIdEmployeeEmployeeIdPut(Integer tenantId,
        Integer employeeId,
        EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/EmployeePermission/{employeeId} : Gets permission details
     *
     * @param tenantId  (required)
     * @param employeeId  (required)
     * @param permissionId  (optional)
     * @return Returns permissions (status code 200)
     *         or If permission ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeePermissionEmployeeIdGet
     */
    default ResponseEntity<EmployeePermissionDTO> tenantIdEmployeePermissionEmployeeIdGet(Integer tenantId,
        String employeeId,
        Integer permissionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"permissionId\" : 0, \"employeeId\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/EmployeePermission/{permissionId} : Deletes permission
     *
     * @param tenantId  (required)
     * @param permissionId  (required)
     * @return If permission has been succesfully deleted (status code 200)
     *         or If permission ID is less or equal to 0 (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeePermissionPermissionIdDelete
     */
    default ResponseEntity<Void> tenantIdEmployeePermissionPermissionIdDelete(Integer tenantId,
        Integer permissionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/EmployeePermission/{permissionId} : Updates permission details
     *
     * @param tenantId  (required)
     * @param permissionId  (required)
     * @param employeePermissionDTO  (optional)
     * @return If permission details hae been succesfully updates (status code 200)
     *         or If provided permission details do not pass the validation (status code 400)
     *         or If no permission ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdEmployeePermissionPermissionIdPut
     */
    default ResponseEntity<Void> tenantIdEmployeePermissionPermissionIdPut(Integer tenantId,
        Integer permissionId,
        EmployeePermissionDTO employeePermissionDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/EmployeePermission : Creates a permission
     *
     * @param tenantId  (required)
     * @param employeePermissionDTO  (optional)
     * @return If permission has been succesfully created (status code 201)
     *         or If provided permission details do not pass the validation (status code 400)
     * @see TenantIdApi#tenantIdEmployeePermissionPost
     */
    default ResponseEntity<Void> tenantIdEmployeePermissionPost(Integer tenantId,
        EmployeePermissionDTO employeePermissionDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Employee : Creates an employee
     *
     * @param tenantId  (required)
     * @param employeeDTO  (optional)
     * @return If employee has been succesfully created (status code 201)
     *         or If provided employee details do not pass the validation (status code 400)
     * @see TenantIdApi#tenantIdEmployeePost
     */
    default ResponseEntity<Void> tenantIdEmployeePost(Integer tenantId,
        EmployeeDTO employeeDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/Location/Delete/{id} : Endpoint to delete a business location.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the business location to delete. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdLocationDeleteIdDelete
     */
    default ResponseEntity<Void> tenantIdLocationDeleteIdDelete(Integer tenantId,
        Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Location/Get/{id} : Endpoint to get a single business location.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the business location to get (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdLocationGetIdGet
     */
    default ResponseEntity<LocationDto> tenantIdLocationGetIdGet(Integer tenantId,
        Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"region\" : \"region\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"name\" : \"name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Location/Get/{pageSize}/{pageNumber} : Endpoint to get multiple business locations.
     *
     * @param tenantId Id of the store. (required)
     * @param pageSize The maximum amount of business locations in response. (required)
     * @param pageNumber The page number of business locations to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdLocationGetPageSizePageNumberGet
     */
    default ResponseEntity<List<Location>> tenantIdLocationGetPageSizePageNumberGet(Integer tenantId,
        Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"address\" : { \"country\" : \"country\", \"city\" : \"city\", \"postalCode\" : \"postalCode\", \"id\" : 1, \"region\" : \"region\", \"line2\" : \"line2\", \"line1\" : \"line1\" }, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Location/Post : Endpoint to create a new business location.
     *
     * @param tenantId Id of the store. (required)
     * @param locationDto Business location to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdLocationPostPost
     */
    default ResponseEntity<Void> tenantIdLocationPostPost(Integer tenantId,
        LocationDto locationDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Location/Put/{id} : Endpoint to update a business location.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the business location to update. (required)
     * @param locationDto Business location to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdLocationPutIdPut
     */
    default ResponseEntity<Void> tenantIdLocationPutIdPut(Integer tenantId,
        Integer id,
        LocationDto locationDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Material : Get a list of materials.
     *
     * @param tenantId  (required)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * @see TenantIdApi#tenantIdMaterialGet
     */
    default ResponseEntity<List<MaterialDTO>> tenantIdMaterialGet(String tenantId,
        Integer pageSize,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"available_quantity\" : 6, \"unit\" : \"unit\", \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/Material/{materialId} : Delete material by id.
     *
     * @param materialId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If material with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdMaterialMaterialIdDelete
     */
    default ResponseEntity<Void> tenantIdMaterialMaterialIdDelete(Integer materialId,
        String tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Material/{materialId} : Get material by Id.
     *
     * @param materialId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If material with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdMaterialMaterialIdGet
     */
    default ResponseEntity<MaterialDTO> tenantIdMaterialMaterialIdGet(Integer materialId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"available_quantity\" : 6, \"unit\" : \"unit\", \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Material/{materialId} : Update material by id.
     *
     * @param materialId  (required)
     * @param tenantId  (required)
     * @param materialDTO  (optional)
     * @return Success (status code 200)
     *         or If some material details are missing. (status code 400)
     *         or If material with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdMaterialMaterialIdPut
     */
    default ResponseEntity<Void> tenantIdMaterialMaterialIdPut(Integer materialId,
        String tenantId,
        MaterialDTO materialDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Material : Create material.
     *
     * @param tenantId  (required)
     * @param materialDTO  (optional)
     * @return Success (status code 200)
     *         or If some material details are missing. (status code 400)
     * @see TenantIdApi#tenantIdMaterialPost
     */
    default ResponseEntity<Void> tenantIdMaterialPost(String tenantId,
        MaterialDTO materialDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/OrderStatus/{orderStatusId} : Deletes order status
     *
     * @param tenantId  (required)
     * @param orderStatusId  (required)
     * @return If order status have been succesfully delete (status code 200)
     *         or If provided order status details do not pass the validation (status code 400)
     *         or If no order status ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdOrderStatusOrderStatusIdDelete
     */
    default ResponseEntity<Void> tenantIdOrderStatusOrderStatusIdDelete(Integer tenantId,
        Integer orderStatusId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/OrderStatus/{orderStatusId} : Gets order status
     *
     * @param tenantId  (required)
     * @param orderStatusId  (required)
     * @return Returns order status (status code 200)
     *         or If order status ID is less or equal to 0 (status code 400)
     *         or If no orderstatus ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdOrderStatusOrderStatusIdGet
     */
    default ResponseEntity<OrderStatusDTO> tenantIdOrderStatusOrderStatusIdGet(Integer tenantId,
        Integer orderStatusId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"orderId\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PATCH /{tenantId}/OrderStatus/{orderStatusId} : Updates order status
     *
     * @param tenantId  (required)
     * @param orderStatusId  (required)
     * @param newOrderStatus  (optional)
     * @return If order status have been succesfully updated (status code 200)
     *         or If the provided order status enum value is invalid (status code 400)
     *         or If no order status ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdOrderStatusOrderStatusIdPatch
     */
    default ResponseEntity<Void> tenantIdOrderStatusOrderStatusIdPatch(Integer tenantId,
        Integer orderStatusId,
        OrderStatusTypes newOrderStatus) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/OrderStatus/{orderStatusId} : Updates order status
     *
     * @param tenantId  (required)
     * @param orderStatusId  (required)
     * @param orderStatusDTO  (optional)
     * @return If order status have been succesfully updated (status code 200)
     *         or If provided order status details do not pass the validation (status code 400)
     *         or If no order status ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdOrderStatusOrderStatusIdPut
     */
    default ResponseEntity<Void> tenantIdOrderStatusOrderStatusIdPut(Integer tenantId,
        Integer orderStatusId,
        OrderStatusDTO orderStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/OrderStatus : Creates order status
     *
     * @param tenantId  (required)
     * @param orderStatusDTO  (optional)
     * @return If order status has been succesfully created (status code 201)
     *         or If provided order status details do not pass the validation (status code 400)
     * @see TenantIdApi#tenantIdOrderStatusPost
     */
    default ResponseEntity<Void> tenantIdOrderStatusPost(Integer tenantId,
        OrderStatusDTO orderStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Product : Get a list of products.
     *
     * @param tenantId  (required)
     * @param materialId Parameter to return all products that contain one or more specified materials. (optional)
     * @param categoryId Parameter to return all products that belong in one or more specified categories. (optional)
     * @param brandId Parameter to return all products assigned to specific brands. (optional)
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * @see TenantIdApi#tenantIdProductGet
     */
    default ResponseEntity<List<ProductDTO>> tenantIdProductGet(String tenantId,
        List<Integer> materialId,
        List<Integer> categoryId,
        List<Integer> brandId,
        Integer pageSize,
        Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tax_rate_id\" : 5, \"unit\" : \"unit\", \"materials\" : [ { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }, { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 } ], \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"categories\" : [ { \"category_id\" : \"category_id\", \"product_id\" : 9 }, { \"category_id\" : \"category_id\", \"product_id\" : 9 } ], \"brand_id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/ProductMaterial : Assign material to a product.
     *
     * @param tenantId  (required)
     * @param productMaterial  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     * @see TenantIdApi#tenantIdProductMaterialPost
     */
    default ResponseEntity<Void> tenantIdProductMaterialPost(String tenantId,
        ProductMaterial productMaterial) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/ProductMaterial/{productId} : Get list of product&#39;s all assigned materials by product Id.
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductMaterialProductIdGet
     */
    default ResponseEntity<List<ProductMaterial>> tenantIdProductMaterialProductIdGet(Integer productId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/ProductMaterial/{productId}/{materialId} : Delete product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If material with such id is not assigned to product with such id. (status code 404)
     * @see TenantIdApi#tenantIdProductMaterialProductIdMaterialIdDelete
     */
    default ResponseEntity<Void> tenantIdProductMaterialProductIdMaterialIdDelete(Integer productId,
        Integer materialId,
        String tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/ProductMaterial/{productId}/{materialId} : Get product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If material with such id is not assigned to product with such id. (status code 404)
     * @see TenantIdApi#tenantIdProductMaterialProductIdMaterialIdGet
     */
    default ResponseEntity<ProductMaterial> tenantIdProductMaterialProductIdMaterialIdGet(Integer productId,
        Integer materialId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/ProductMaterial/{productId}/{materialId} : Update product&#39;s assigned material by product Id and material Id.
     *
     * @param productId  (required)
     * @param materialId  (required)
     * @param tenantId  (required)
     * @param productMaterial  (optional)
     * @return Success (status code 200)
     *         or If some class details are missing. (status code 400)
     *         or If material with such id is not assigned to product with such id. (status code 404)
     * @see TenantIdApi#tenantIdProductMaterialProductIdMaterialIdPut
     */
    default ResponseEntity<Void> tenantIdProductMaterialProductIdMaterialIdPut(Integer productId,
        Integer materialId,
        String tenantId,
        ProductMaterial productMaterial) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Product : Create product.
     *
     * @param tenantId  (required)
     * @param productDTO  (optional)
     * @return Success (status code 200)
     *         or If some product details are missing. (status code 400)
     * @see TenantIdApi#tenantIdProductPost
     */
    default ResponseEntity<Void> tenantIdProductPost(String tenantId,
        ProductDTO productDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/Product/{productId} : Delete product by id.
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductProductIdDelete
     */
    default ResponseEntity<Void> tenantIdProductProductIdDelete(Integer productId,
        String tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Product/{productId} : Get product by Id.
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductProductIdGet
     */
    default ResponseEntity<ProductDTO> tenantIdProductProductIdGet(Integer productId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tax_rate_id\" : 5, \"unit\" : \"unit\", \"materials\" : [ { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 }, { \"quantity\" : 7, \"product_id\" : 5, \"material_id\" : 2 } ], \"price\" : 6, \"name\" : \"name\", \"id\" : 0, \"categories\" : [ { \"category_id\" : \"category_id\", \"product_id\" : 9 }, { \"category_id\" : \"category_id\", \"product_id\" : 9 } ], \"brand_id\" : 1 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Product/{productId} : Update product by id.
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @param productDTO  (optional)
     * @return Success (status code 200)
     *         or If some product details are missing. (status code 400)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductProductIdPut
     */
    default ResponseEntity<Void> tenantIdProductProductIdPut(Integer productId,
        String tenantId,
        ProductDTO productDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/ProductStatus : Create product status.
     *
     * @param tenantId  (required)
     * @param productStatusDTO  (optional)
     * @return Success (status code 200)
     *         or If some product status details are missing. (status code 400)
     * @see TenantIdApi#tenantIdProductStatusPost
     */
    default ResponseEntity<Void> tenantIdProductStatusPost(String tenantId,
        ProductStatusDTO productStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/ProductStatus/{productId} : Delete product status by id.
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductStatusProductIdDelete
     */
    default ResponseEntity<Void> tenantIdProductStatusProductIdDelete(Integer productId,
        String tenantId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/ProductStatus/{productId} : Get product status by Id.
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @return Success (status code 200)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductStatusProductIdGet
     */
    default ResponseEntity<ProductStatusDTO> tenantIdProductStatusProductIdGet(Integer productId,
        String tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"available_quantity\" : 6, \"product_id\" : 0, \"is_disabled\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/ProductStatus/{productId} : Update product status by id (Enable/Disable, update quantity).
     *
     * @param productId  (required)
     * @param tenantId  (required)
     * @param productStatusDTO  (optional)
     * @return Success (status code 200)
     *         or If some product status details are missing. (status code 400)
     *         or If product with such id does not exist. (status code 404)
     * @see TenantIdApi#tenantIdProductStatusProductIdPut
     */
    default ResponseEntity<Void> tenantIdProductStatusProductIdPut(Integer productId,
        String tenantId,
        ProductStatusDTO productStatusDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Report/BriefSalesReport : Endpoint to get brief sales report.
     *
     * @param tenantId Id of the store. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdReportBriefSalesReportGet
     */
    default ResponseEntity<BriefSalesReportDTO> tenantIdReportBriefSalesReportGet(Integer tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 2.3021358869347655, \"items\" : [ { \"quantity\" : 5, \"totalPrice\" : 5.637376656633329, \"name\" : \"name\", \"discount\" : 1.4658129805029452, \"tax\" : 6.027456183070403, \"id\" : 0 }, { \"quantity\" : 5, \"totalPrice\" : 5.637376656633329, \"name\" : \"name\", \"discount\" : 1.4658129805029452, \"tax\" : 6.027456183070403, \"id\" : 0 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Report/DetailedSalesReport : Endpoint to get detailed sales report.
     *
     * @param tenantId Id of the store. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdReportDetailedSalesReportGet
     */
    default ResponseEntity<DetailedSalesReportDTO> tenantIdReportDetailedSalesReportGet(Integer tenantId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 0.8008281904610115, \"items\" : [ { \"unitPrice\" : 2.027123023002322, \"discountRate\" : 4.145608029883936, \"taxRate\" : 7.386281948385884, \"total\" : 1.2315135367772556, \"notes\" : \"notes\", \"quantity\" : 3, \"productId\" : 2, \"bundleId\" : 9, \"name\" : \"name\", \"id\" : 5, \"serviceId\" : 7 }, { \"unitPrice\" : 2.027123023002322, \"discountRate\" : 4.145608029883936, \"taxRate\" : 7.386281948385884, \"total\" : 1.2315135367772556, \"notes\" : \"notes\", \"quantity\" : 3, \"productId\" : 2, \"bundleId\" : 9, \"name\" : \"name\", \"id\" : 5, \"serviceId\" : 7 } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Reservation : Creates a reservation.
     *
     * @param tenantId Id of the tenant. (required)
     * @param createReservationDTO Details needed to create a reservation. (optional)
     * @return Returns information of the newly created reservation. (status code 200)
     * @see TenantIdApi#tenantIdReservationPost
     */
    default ResponseEntity<ReservationInformationDTO> tenantIdReservationPost(Integer tenantId,
        CreateReservationDTO createReservationDTO) {
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
     * POST /{tenantId}/Reservation/{reservationId}/Cancel : Cancels a reservation.
     * At first should check if the action is being performed by an authorized user or service provider.  When the reservation gets canceled this endpoint should send a notification to the customer and the shop.
     *
     * @param tenantId Id of the tenant. (required)
     * @param reservationId Id of the reservation. (required)
     * @return Returns that cancelation completed successfully. (status code 200)
     * @see TenantIdApi#tenantIdReservationReservationIdCancelPost
     */
    default ResponseEntity<Void> tenantIdReservationReservationIdCancelPost(Integer tenantId,
        Integer reservationId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Reservation/{reservationId} : Gets a reservation by id.
     *
     * @param tenantId Id of the tenant. (required)
     * @param reservationId Id of the reservation (required)
     * @return Returns information of the specified reservation. (status code 200)
     *         or When reservation doesn&#39;t exist. (status code 404)
     * @see TenantIdApi#tenantIdReservationReservationIdGet
     */
    default ResponseEntity<ReservationInformationDTO> tenantIdReservationReservationIdGet(Integer tenantId,
        Integer reservationId) {
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
     * DELETE /{tenantId}/Service/{id} : Endpoint to delete a service.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the service to delete. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdServiceIdDelete
     */
    default ResponseEntity<Void> tenantIdServiceIdDelete(Integer tenantId,
        Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Service/{id} : Endpoint to get a single service.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the service to get (required)
     * @return Success (status code 200)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdServiceIdGet
     */
    default ResponseEntity<Service> tenantIdServiceIdGet(Integer tenantId,
        Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"tenantId\" : 6, \"name\" : \"name\", \"durationMins\" : 1, \"id\" : 0, \"taxRateId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/Service/{id} : Endpoint to update a service.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the service to update. (required)
     * @param serviceDto Service to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdServiceIdPut
     */
    default ResponseEntity<Void> tenantIdServiceIdPut(Integer tenantId,
        Integer id,
        ServiceDto serviceDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/Service/{pageSize}/{pageNumber} : Endpoint to get multiple services.
     *
     * @param tenantId Id of the store. (required)
     * @param pageSize The maximum amount of services in response. (required)
     * @param pageNumber The page number of services to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     * @see TenantIdApi#tenantIdServicePageSizePageNumberGet
     */
    default ResponseEntity<List<Service>> tenantIdServicePageSizePageNumberGet(Integer tenantId,
        Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"tenantId\" : 6, \"name\" : \"name\", \"durationMins\" : 1, \"id\" : 0, \"taxRateId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Service/{pageSize}/{pageNumber} : Endpoint to get multiple services with applied filter.
     *
     * @param tenantId Id of the store. (required)
     * @param pageSize The maximum amount of services in response. (required)
     * @param pageNumber The page number of services to return. (required)
     * @param serviceFilterDto Filter to apply to the services. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     * @see TenantIdApi#tenantIdServicePageSizePageNumberPost
     */
    default ResponseEntity<List<Service>> tenantIdServicePageSizePageNumberPost(Integer tenantId,
        Integer pageSize,
        Integer pageNumber,
        ServiceFilterDto serviceFilterDto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"isAvailable\" : true, \"tenantId\" : 6, \"name\" : \"name\", \"durationMins\" : 1, \"id\" : 0, \"taxRateId\" : 5 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/Service : Endpoint to create a new service.
     *
     * @param tenantId  (required)
     * @param serviceDto Service to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdServicePost
     */
    default ResponseEntity<Void> tenantIdServicePost(String tenantId,
        ServiceDto serviceDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/TaxRate/ApplyTaxRateToCategory : Endpoint for applying tax rate to all items in the category.
     *
     * @param tenantId Id of the store. (required)
     * @param applyTaxRateToCategoryDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdTaxRateApplyTaxRateToCategoryPost
     */
    default ResponseEntity<Void> tenantIdTaxRateApplyTaxRateToCategoryPost(Integer tenantId,
        ApplyTaxRateToCategoryDTO applyTaxRateToCategoryDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/TaxRate/AssignTaxRateToItem : Endpoint for assigning tax rate to an item.
     *
     * @param tenantId Id of the store. (required)
     * @param assignTaxRateToItemDTO  (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdTaxRateAssignTaxRateToItemPost
     */
    default ResponseEntity<Void> tenantIdTaxRateAssignTaxRateToItemPost(Integer tenantId,
        AssignTaxRateToItemDTO assignTaxRateToItemDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /{tenantId}/TaxRate/{id} : Endpoint to delete a tax rate.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the tax rate to delete. (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdTaxRateIdDelete
     */
    default ResponseEntity<Void> tenantIdTaxRateIdDelete(Integer tenantId,
        Integer id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/TaxRate/{id} : Endpoint to get a single tax rate.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the tax rate to get (required)
     * @return Success (status code 200)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdTaxRateIdGet
     */
    default ResponseEntity<TaxRate> tenantIdTaxRateIdGet(Integer tenantId,
        Integer id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 1.4658129805029452, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /{tenantId}/TaxRate/{id} : Endpoint to update a tax rate.
     *
     * @param tenantId Id of the store. (required)
     * @param id Id of the tax rate to update. (required)
     * @param taxRateDto Tax rate to update. (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Not Found (status code 404)
     * @see TenantIdApi#tenantIdTaxRateIdPut
     */
    default ResponseEntity<Void> tenantIdTaxRateIdPut(Integer tenantId,
        Integer id,
        TaxRateDto taxRateDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/TaxRate/{pageSize}/{pageNumber} : Endpoint to get multiple tax rates.
     *
     * @param tenantId Id of the store. (required)
     * @param pageSize The maximum amount of tax rates in response. (required)
     * @param pageNumber The page number of tax rates to return. (required)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdTaxRatePageSizePageNumberGet
     */
    default ResponseEntity<List<TaxRate>> tenantIdTaxRatePageSizePageNumberGet(Integer tenantId,
        Integer pageSize,
        Integer pageNumber) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"rate\" : 1.4658129805029452, \"tenantId\" : 6, \"name\" : \"name\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /{tenantId}/TaxRate : Endpoint to create a new tax rate.
     *
     * @param tenantId  (required)
     * @param taxRateDto Tax rate to create. (optional)
     * @return Success (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     * @see TenantIdApi#tenantIdTaxRatePost
     */
    default ResponseEntity<Void> tenantIdTaxRatePost(String tenantId,
        TaxRateDto taxRateDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/TimeSlot/{employeeId} : Gets all time slots by employee id
     *
     * @param tenantId  (required)
     * @param employeeId  (required)
     * @return Returns time slot details (status code 200)
     *         or If time slot ID is less or equal to 0 (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotEmployeeIdGet
     */
    default ResponseEntity<TimeSlotDTO> tenantIdTimeSlotEmployeeIdGet(Integer tenantId,
        Integer employeeId) {
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
     * GET /{tenantId}/TimeSlot : Gets all time slots by date
     *
     * @param tenantId  (required)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @return Returns time slot details (status code 200)
     *         or If provided dates are invalid (status code 400)
     *         or If no dates matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotGet
     */
    default ResponseEntity<TimeSlotDTO> tenantIdTimeSlotGet(Integer tenantId,
        OffsetDateTime fromDate,
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
     * GET /{tenantId}/TimeSlot/{locationId} : Gets all time slots by location id
     *
     * @param tenantId  (required)
     * @param locationId  (required)
     * @return Returns time slot details (status code 200)
     *         or If time slot location ID is less or equal to 0 (status code 400)
     *         or If no time slot location ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotLocationIdGet
     */
    default ResponseEntity<TimeSlotDTO> tenantIdTimeSlotLocationIdGet(Integer tenantId,
        Integer locationId) {
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
     * POST /{tenantId}/TimeSlot : Creates a time slot
     *
     * @param tenantId  (required)
     * @param timeSlotDTO  (optional)
     * @return If time slot has been succesfully created (status code 201)
     *         or If provided time slot details do not pass the validation (status code 400)
     * @see TenantIdApi#tenantIdTimeSlotPost
     */
    default ResponseEntity<Void> tenantIdTimeSlotPost(Integer tenantId,
        TimeSlotDTO timeSlotDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/TimeSlot/{serviceId} : Gets all time slots by service id
     *
     * @param tenantId  (required)
     * @param serviceId  (required)
     * @return Success (status code 200)
     *         or If time slot service ID is less or equal to 0 (status code 400)
     *         or If no time slot service ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotServiceIdGet
     */
    default ResponseEntity<TimeSlotDTO> tenantIdTimeSlotServiceIdGet(Integer tenantId,
        Integer serviceId) {
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
     * DELETE /{tenantId}/TimeSlot/{timeSlotId} : Deletes time slot
     *
     * @param tenantId  (required)
     * @param timeSlotId  (required)
     * @return If time slot have been succesfully deleted (status code 200)
     *         or If time slot ID is less or equal to 0 (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotTimeSlotIdDelete
     */
    default ResponseEntity<Void> tenantIdTimeSlotTimeSlotIdDelete(Integer tenantId,
        Integer timeSlotId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /{tenantId}/TimeSlot/{timeSlotId} : Gets time slot details
     *
     * @param tenantId  (required)
     * @param timeSlotId  (required)
     * @return Returns time slot details (status code 200)
     *         or If time slot ID is less or equal to 0 (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotTimeSlotIdGet
     */
    default ResponseEntity<TimeSlotDTO> tenantIdTimeSlotTimeSlotIdGet(Integer tenantId,
        Integer timeSlotId) {
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
     * PUT /{tenantId}/TimeSlot/{timeSlotId} : Updates time slot
     *
     * @param tenantId  (required)
     * @param timeSlotId  (required)
     * @param timeSlotDTO  (optional)
     * @return If time slot details have been succesfully updated (status code 200)
     *         or If provided time slot details do not pass the validation (status code 400)
     *         or If no time slot ID matched the search (status code 404)
     * @see TenantIdApi#tenantIdTimeSlotTimeSlotIdPut
     */
    default ResponseEntity<Void> tenantIdTimeSlotTimeSlotIdPut(Integer tenantId,
        Integer timeSlotId,
        TimeSlotDTO timeSlotDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
