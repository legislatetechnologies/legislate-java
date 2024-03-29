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

import com.legislate.model.ContractFieldResponseDTO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ContractFieldsApi
 */
@Ignore
public class ContractFieldsApiTest {

    private final ContractFieldsApi api = new ContractFieldsApi();

    /**
     * Get template term.
     *
     * This operation will retrieve terms about a given template.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTemplateTermUsingGETTest() throws Exception {
        Long termId = null;
        ContractFieldResponseDTO response = api.getTemplateTermUsingGET(termId);

        // TODO: test validations
    }
    /**
     * Get template terms.
     *
     * This operation will retrieve terms about a given template.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTemplateTermsUsingGETTest() throws Exception {
        Long templateId = null;
        List<ContractFieldResponseDTO> response = api.getTemplateTermsUsingGET(templateId);

        // TODO: test validations
    }
}
