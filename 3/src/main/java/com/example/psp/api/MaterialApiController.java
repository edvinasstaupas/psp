package com.example.psp.api;

import com.example.psp.api.utils.RestUtils;
import com.example.psp.dto.MaterialDTO;
import com.example.psp.security.User;
import com.example.psp.services.MaterialService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class MaterialApiController {
    private final MaterialService materialService;

    private final UserDetailsService userDetailsService;
    /**
     * GET /material : Get a list of materials.
     *
     * @param pageSize Parameter to define how many records are in a page. (optional)
     * @param page Parameter to specify which page of records to return. (optional)
     * @return Success (status code 200)
     */
    @ApiOperation(value = "Get a list of materials.", nickname = "materialGet", notes = "", response = MaterialDTO.class, responseContainer = "List", tags={ "Material", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = MaterialDTO.class, responseContainer = "List") })
    @GetMapping(
            value = "/material",
            produces = { "application/json" }
    )
    public ResponseEntity<List<MaterialDTO>> materialGet(@ApiParam(value = "Parameter to define how many records are in a page.") @Valid @RequestParam(value = "pageSize", required = false) Integer pageSize, @ApiParam(value = "Parameter to specify which page of records to return.") @Valid @RequestParam(value = "page", required = false) Integer page, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return ResponseEntity.ok(materialService.materialGet(pageSize, page, user));
    }


    /**
     * DELETE /material/{materialId} : Delete material by id.
     *
     * @param materialId  (required)
     * @return Success (status code 200)
     *         or If material with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Delete material by id.", nickname = "materialMaterialIdDelete", notes = "", tags={ "Material", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 404, message = "If material with such id does not exist.") })
    @DeleteMapping(
            value = "/material/{materialId}"
    )
    public ResponseEntity<Void> materialMaterialIdDelete(@ApiParam(value = "",required=true) @PathVariable("materialId") Integer materialId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        materialService.materialMaterialIdDelete(materialId, user);
        return RestUtils.ok();
    }


    /**
     * GET /material/{materialId} : Get material by Id.
     *
     * @param materialId  (required)
     * @return Success (status code 200)
     *         or If material with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Get material by Id.", nickname = "materialMaterialIdGet", notes = "", response = MaterialDTO.class, tags={ "Material", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success", response = MaterialDTO.class),
            @ApiResponse(code = 404, message = "If material with such id does not exist.") })
    @GetMapping(
            value = "/material/{materialId}",
            produces = { "application/json" }
    )
    public ResponseEntity<MaterialDTO> materialMaterialIdGet(@ApiParam(value = "",required=true) @PathVariable("materialId") Integer materialId, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        return RestUtils.okOrNotFound(materialService.materialMaterialIdGet(materialId, user));
    }


    /**
     * PUT /material/{materialId} : Update material by id.
     *
     * @param materialId  (required)
     * @param materialDTO  (optional)
     * @return Success (status code 200)
     *         or If some material details are missing. (status code 400)
     *         or If material with such id does not exist. (status code 404)
     */
    @ApiOperation(value = "Update material by id.", nickname = "materialMaterialIdPut", notes = "", tags={ "Material", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some material details are missing."),
            @ApiResponse(code = 404, message = "If material with such id does not exist.") })
    @PutMapping(
            value = "/material/{materialId}",
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> materialMaterialIdPut(@ApiParam(value = "",required=true) @PathVariable("materialId") Integer materialId,@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MaterialDTO materialDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        materialService.materialMaterialIdPut(materialId, materialDTO, user);
        return RestUtils.ok();
    }


    /**
     * POST /material : Create material.
     *
     * @param materialDTO  (optional)
     * @return Success (status code 200)
     *         or If some material details are missing. (status code 400)
     */
    @ApiOperation(value = "Create material.", nickname = "materialPost", notes = "", tags={ "Material", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success"),
            @ApiResponse(code = 400, message = "If some material details are missing.") })
    @PostMapping(
            value = "/material",
            consumes = { "application/json" }
    )
    public ResponseEntity<Void> materialPost(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) MaterialDTO materialDTO, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        materialService.materialPost(materialDTO, user);
        return RestUtils.ok();
    }


}
