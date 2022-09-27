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

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CouponsApi
 */
@Ignore
public class CouponsApiTest {

    private final CouponsApi api = new CouponsApi();

    /**
     * Send an email with a coupon for new users.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getEmailCouponSubscritpionUsingGETTest() throws Exception {
        String couponId = null;
        String email = null;
        api.getEmailCouponSubscritpionUsingGET(couponId, email);

        // TODO: test validations
    }
}
