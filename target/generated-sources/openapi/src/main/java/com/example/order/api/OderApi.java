/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.order.api;

import com.example.order.model.ModelApiResponse;
import com.example.order.model.Oder;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-03T20:06:37.500235-05:00[America/Mexico_City]", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "oder", description = "Everything about your Oders")
public interface OderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /oder/{oderId} : Deletes a oder
     * delete a oder
     *
     * @param oderId Oder id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid oder value (status code 400)
     */
    @Operation(
        operationId = "deleteOder",
        summary = "Deletes a oder",
        description = "delete a oder",
        tags = { "oder" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid oder value")
        },
        security = {
            @SecurityRequirement(name = "orderstore_auth", scopes={ "write:oders", "read:oders" })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/oder/{oderId}"
    )
    
    default ResponseEntity<Void> deleteOder(
        @Parameter(name = "oderId", description = "Oder id to delete", required = true, in = ParameterIn.PATH) @PathVariable("oderId") Long oderId,
        @Parameter(name = "api_key", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "api_key", required = false) String apiKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /oder/findByStatus : Finds Oders by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (optional, default to available)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     */
    @Operation(
        operationId = "findOdersByStatus",
        summary = "Finds Oders by status",
        description = "Multiple status values can be provided with comma separated strings",
        tags = { "oder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Oder.class))),
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Oder.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid status value")
        },
        security = {
            @SecurityRequirement(name = "orderstore_auth", scopes={ "write:oders", "read:oders" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/oder/findByStatus",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<List<Oder>> findOdersByStatus(
        @Parameter(name = "status", description = "Status values that need to be considered for filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "status", required = false, defaultValue = "available") String status
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<oder> <id>10</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </oder>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /oder/findByTags : Finds Oders by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (optional)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     */
    @Operation(
        operationId = "findOdersByTags",
        summary = "Finds Oders by tags",
        description = "Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.",
        tags = { "oder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Oder.class))),
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = Oder.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid tag value")
        },
        security = {
            @SecurityRequirement(name = "orderstore_auth", scopes={ "write:oders", "read:oders" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/oder/findByTags",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<List<Oder>> findOdersByTags(
        @Parameter(name = "tags", description = "Tags to filter by", in = ParameterIn.QUERY) @Valid @RequestParam(value = "tags", required = false) List<String> tags
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<oder> <id>10</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </oder>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /oder/{oderId} : Find oder by ID
     * Returns a single oder
     *
     * @param oderId ID of oder to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Oder not found (status code 404)
     */
    @Operation(
        operationId = "getOderById",
        summary = "Find oder by ID",
        description = "Returns a single oder",
        tags = { "oder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Oder.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = Oder.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
            @ApiResponse(responseCode = "404", description = "Oder not found")
        },
        security = {
            @SecurityRequirement(name = "api_key"),
            @SecurityRequirement(name = "orderstore_auth", scopes={ "write:oders", "read:oders" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/oder/{oderId}",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<Oder> getOderById(
        @Parameter(name = "oderId", description = "ID of oder to return", required = true, in = ParameterIn.PATH) @PathVariable("oderId") Long oderId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<oder> <id>10</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </oder>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /oder/{oderId} : Updates a oder in the store with form data
     * 
     *
     * @param oderId ID of oder that needs to be updated (required)
     * @param name Name of oder that needs to be updated (optional)
     * @param status Status of oder that needs to be updated (optional)
     * @return Invalid input (status code 400)
     */
    @Operation(
        operationId = "updateOderWithForm",
        summary = "Updates a oder in the store with form data",
        description = "",
        tags = { "oder" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid input")
        },
        security = {
            @SecurityRequirement(name = "orderstore_auth", scopes={ "write:oders", "read:oders" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/oder/{oderId}"
    )
    
    default ResponseEntity<Void> updateOderWithForm(
        @Parameter(name = "oderId", description = "ID of oder that needs to be updated", required = true, in = ParameterIn.PATH) @PathVariable("oderId") Long oderId,
        @Parameter(name = "name", description = "Name of oder that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = false) String name,
        @Parameter(name = "status", description = "Status of oder that needs to be updated", in = ParameterIn.QUERY) @Valid @RequestParam(value = "status", required = false) String status
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /oder/{oderId}/uploadImage : uploads an image
     * 
     *
     * @param oderId ID of oder to update (required)
     * @param additionalMetadata Additional Metadata (optional)
     * @param body  (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "uploadFile",
        summary = "uploads an image",
        description = "",
        tags = { "oder" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ModelApiResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "orderstore_auth", scopes={ "write:oders", "read:oders" })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/oder/{oderId}/uploadImage",
        produces = { "application/json" },
        consumes = { "application/octet-stream" }
    )
    
    default ResponseEntity<ModelApiResponse> uploadFile(
        @Parameter(name = "oderId", description = "ID of oder to update", required = true, in = ParameterIn.PATH) @PathVariable("oderId") Long oderId,
        @Parameter(name = "additionalMetadata", description = "Additional Metadata", in = ParameterIn.QUERY) @Valid @RequestParam(value = "additionalMetadata", required = false) String additionalMetadata,
        @Parameter(name = "body", description = "") @Valid @RequestBody(required = false) org.springframework.core.io.Resource body
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
