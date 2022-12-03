package com.example.psp.api;

import com.example.psp.model.MaterialDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link MaterialApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public interface MaterialApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /material : Get a list of materials.
     *
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     * @see MaterialApi#materialGet
     */
    default ResponseEntity<List<MaterialDTO>> materialGet(Integer pageSize,
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
        return ResponseEntity.ok(List.of(new MaterialDTO().id(1).availableQuantity(1), new MaterialDTO().id(2).availableQuantity(1), new MaterialDTO().id(3).availableQuantity(1)));

    }

    /**
     * DELETE /material/{materialId} : Delete material by id.
     *
     * @param materialId  (required)
     * @return Success (status code 200)
     *         or If material with such id does not exist. (status code 404)
     * @see MaterialApi#materialMaterialIdDelete
     */
    default ResponseEntity<Void> materialMaterialIdDelete(Integer materialId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /material/{materialId} : Get material by Id.
     *
     * @param materialId  (required)
     * @return Success (status code 200)
     *         or If material with such id does not exist. (status code 404)
     * @see MaterialApi#materialMaterialIdGet
     */
    default ResponseEntity<MaterialDTO> materialMaterialIdGet(Integer materialId) {
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
     * PUT /material/{materialId} : Update material by id.
     *
     * @param materialId  (required)
     * @param materialDTO  (optional)
     * @return Success (status code 200)
     *         or If some material details are missing. (status code 400)
     *         or If material with such id does not exist. (status code 404)
     * @see MaterialApi#materialMaterialIdPut
     */
    default ResponseEntity<Void> materialMaterialIdPut(Integer materialId,
        MaterialDTO materialDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /material : Create material.
     *
     * @param materialDTO  (optional)
     * @return Success (status code 200)
     *         or If some material details are missing. (status code 400)
     * @see MaterialApi#materialPost
     */
    default ResponseEntity<Void> materialPost(MaterialDTO materialDTO) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
