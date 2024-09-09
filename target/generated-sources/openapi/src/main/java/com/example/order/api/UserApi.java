/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.order.api;

import java.util.Date;
import com.example.order.model.User;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-08T20:58:44.441422-05:00[America/Mexico_City]", comments = "Generator version: 7.8.0")
@Validated
@Tag(name = "user", description = "Operations about user")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     * This can only be done by the logged in user.
     *
     * @param user Created user object (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<User> createUser(
        @Parameter(name = "User", description = "Created user object") @Valid @RequestBody(required = false) User user
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"James\", \"password\" : \"12345\", \"userStatus\" : 1, \"phone\" : \"12345\", \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"theUser\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<user> <id>10</id> <username>theUser</username> <firstName>John</firstName> <lastName>James</lastName> <email>john@email.com</email> <password>12345</password> <phone>12345</phone> <userStatus>1</userStatus> </user>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/createWithList : Creates list of users with given input array
     * Creates list of users with given input array
     *
     * @param user  (optional)
     * @return Successful operation (status code 200)
     *         or successful operation (status code 200)
     */
    @Operation(
        operationId = "createUsersWithListInput",
        summary = "Creates list of users with given input array",
        description = "Creates list of users with given input array",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user/createWithList",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<User> createUsersWithListInput(
        @Parameter(name = "User", description = "") @Valid @RequestBody(required = false) List<@Valid User> user
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"James\", \"password\" : \"12345\", \"userStatus\" : 1, \"phone\" : \"12345\", \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"theUser\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<user> <id>10</id> <username>theUser</username> <firstName>John</firstName> <lastName>James</lastName> <email>john@email.com</email> <password>12345</password> <phone>12345</phone> <userStatus>1</userStatus> </user>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /user/{username} : Delete user
     * This can only be done by the logged in user.
     *
     * @param username The name that needs to be deleted (required)
     * @return Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{username}"
    )
    
    default ResponseEntity<Void> deleteUser(
        @Parameter(name = "username", description = "The name that needs to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{username} : Get user by user name
     * 
     *
     * @param username The name that needs to be fetched. Use user1 for testing.  (required)
     * @return successful operation (status code 200)
     *         or Invalid username supplied (status code 400)
     *         or User not found (status code 404)
     */
    @Operation(
        operationId = "getUserByName",
        summary = "Get user by user name",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = User.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username supplied"),
            @ApiResponse(responseCode = "404", description = "User not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{username}",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<User> getUserByName(
        @Parameter(name = "username", description = "The name that needs to be fetched. Use user1 for testing. ", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"John\", \"lastName\" : \"James\", \"password\" : \"12345\", \"userStatus\" : 1, \"phone\" : \"12345\", \"id\" : 10, \"email\" : \"john@email.com\", \"username\" : \"theUser\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<user> <id>10</id> <username>theUser</username> <firstName>John</firstName> <lastName>James</lastName> <email>john@email.com</email> <password>12345</password> <phone>12345</phone> <userStatus>1</userStatus> </user>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/login : Logs user into the system
     * 
     *
     * @param username The user name for login (optional)
     * @param password The password for login in clear text (optional)
     * @return successful operation (status code 200)
     *         or Invalid username/password supplied (status code 400)
     */
    @Operation(
        operationId = "loginUser",
        summary = "Logs user into the system",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/xml", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid username/password supplied")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/login",
        produces = { "application/xml", "application/json" }
    )
    
    default ResponseEntity<String> loginUser(
        @Parameter(name = "username", description = "The user name for login", in = ParameterIn.QUERY) @Valid @RequestParam(value = "username", required = false) String username,
        @Parameter(name = "password", description = "The password for login in clear text", in = ParameterIn.QUERY) @Valid @RequestParam(value = "password", required = false) String password
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/logout : Logs out current logged in user session
     * 
     *
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "logoutUser",
        summary = "Logs out current logged in user session",
        description = "",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/logout"
    )
    
    default ResponseEntity<Void> logoutUser(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /user/{username} : Update user
     * This can only be done by the logged in user.
     *
     * @param username name that need to be deleted (required)
     * @param user Update an existent user in the store (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Update user",
        description = "This can only be done by the logged in user.",
        tags = { "user" },
        responses = {
            @ApiResponse(responseCode = "default", description = "successful operation")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{username}",
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<Void> updateUser(
        @Parameter(name = "username", description = "name that need to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("username") String username,
        @Parameter(name = "User", description = "Update an existent user in the store") @Valid @RequestBody(required = false) User user
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
