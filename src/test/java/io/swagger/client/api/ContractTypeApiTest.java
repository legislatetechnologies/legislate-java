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

package io.swagger.client.api;

import io.swagger.client.model.ContractTypeResponseDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ContractTypeApi
 */
@Ignore
public class ContractTypeApiTest {

    private final ContractTypeApi api = new ContractTypeApi();

    /**
     * Get information relative a given contract type.
     *
     * This operation will retrieve information about a given contract type and a team.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getContractTypePerTeamUsingGETTest() throws Exception {
        Long contractTypeId = null;
        Long teamId = null;
        ContractTypeResponseDTO response = api.getContractTypePerTeamUsingGET(contractTypeId, teamId);

        // TODO: test validations
    }
    /**
     * Get contract type terms.
     *
     * This operation will retrieve terms about a given contract type.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getContractTypeUsingGETTest() throws Exception {
        Long contractTypeId = null;
        ContractTypeResponseDTO response = api.getContractTypeUsingGET(contractTypeId);

        // TODO: test validations
    }
    /**
     * Get contract types of a team
     *
     * This operation will retrieve information of every contract type relative a team.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getContractTypesPerTeamUsingGETTest() throws Exception {
        Long teamId = null;
        List<ContractTypeResponseDTO> response = api.getContractTypesPerTeamUsingGET(teamId);

        // TODO: test validations
    }
    /**
     * Get public contract types.
     *
     * This operation will retrieve terms about a given contract type.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getContractTypesUsingGETTest() throws Exception {
        List<ContractTypeResponseDTO> response = api.getContractTypesUsingGET();

        // TODO: test validations
    }
}
