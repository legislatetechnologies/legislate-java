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

import com.legislate.model.CreateTeamRequestDTO;
import com.legislate.model.TeamResponseDTO;
import com.legislate.model.UpdateTeamRequestDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for TeamApi
 */
@Ignore
public class TeamApiTest {

    private final TeamApi api = new TeamApi();

    /**
     * Get team details.
     *
     * This operation will retrieve details about a given team.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTeamUsingGETTest() throws Exception {
        Long teamId = null;
        TeamResponseDTO response = api.getTeamUsingGET(teamId);

        // TODO: test validations
    }
    /**
     * Get teams.
     *
     * This operation will retrieve all teams for a given user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTeamsUsingGETTest() throws Exception {
        Long userId = null;
        List<TeamResponseDTO> response = api.getTeamsUsingGET(userId);

        // TODO: test validations
    }
    /**
     * Create a team for a given user.
     *
     * This operation will create a team for a given user.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void postTeamUsingPOSTTest() throws Exception {
        CreateTeamRequestDTO body = null;
        Long userId = null;
        TeamResponseDTO response = api.postTeamUsingPOST(body, userId);

        // TODO: test validations
    }
    /**
     * Updates a team.
     *
     * This operation will update a team details.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateTeamUsingPATCHTest() throws Exception {
        UpdateTeamRequestDTO body = null;
        Long teamId = null;
        TeamResponseDTO response = api.updateTeamUsingPATCH(body, teamId);

        // TODO: test validations
    }
}