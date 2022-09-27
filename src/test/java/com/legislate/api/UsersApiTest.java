/*
 * Legislate API
 * The Legislate API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.legislate.api;

import com.legislate.model.CreateUserRequestDTO;
import com.legislate.model.Link;
import com.legislate.model.UserResponseDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    /**
     * Create a user
     *
     * This operation will create a user
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createUserUsingPOSTTest() throws Exception {
        CreateUserRequestDTO body = null;
        Link response = api.createUserUsingPOST(body);

        // TODO: test validations
    }
    /**
     * Get user details.
     *
     * This operation will retrieve details about a given user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUserUsingGETTest() throws Exception {
        Long userId = null;
        UserResponseDTO response = api.getUserUsingGET(userId);

        // TODO: test validations
    }
    /**
     * Get all users.
     *
     * This operation will retrieve all users.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getUsersUsingGETTest() throws Exception {
        List<Object> response = api.getUsersUsingGET();

        // TODO: test validations
    }
}
