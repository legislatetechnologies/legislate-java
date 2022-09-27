# legislate-java

Legislate API
- API version: 1.1.0

The Legislate API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs.


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.legislate</groupId>
  <artifactId>legislate-java</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.legislate:legislate-java:1.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/legislate-java-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator you'd like to delete.
        try {
            apiInstance.deleteCollaboratorUsingDELETE(collaboratorId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#deleteCollaboratorUsingDELETE");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        Long idTemplate = 789L; // Long | The unique Id of the template of the contract which is associated with the collaborator.
        List<String> roles = Arrays.asList("roles_example"); // List<String> | The role of the contract collaborator.
        String side = "side_example"; // String | The sde of the contract collaborator.
        try {
            List<IdentityFieldsCollaboratorRoleDTO> result = apiInstance.getCollaboratorIdentityFieldsUsingGET(idTemplate, roles, side);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#getCollaboratorIdentityFieldsUsingGET");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator you'd like to look up.
        try {
            ContractCollaboratorResponseDTO result = apiInstance.getCollaboratorUsingGET(collaboratorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#getCollaboratorUsingGET");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        Long contractId = 789L; // Long | The unique Id of the contract associated with the collaborator you'd like to look up.
        try {
            List<ContractCollaboratorResponseDTO> result = apiInstance.getCollaboratorsUsingGET(contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#getCollaboratorsUsingGET");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        CollaboratorFieldsRequestDTO body = new CollaboratorFieldsRequestDTO(); // CollaboratorFieldsRequestDTO | createCollaboratorRequestDTO
        Long contractId = 789L; // Long | The unique Id of the contract associated with the collaborator you'd like to look up.
        try {
            Link result = apiInstance.postCollaboratorUsingPOST(body, contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#postCollaboratorUsingPOST");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        CompanyFieldsDTO body = new CompanyFieldsDTO(); // CompanyFieldsDTO | companyFieldsDTORequest
        Long contractId = 789L; // Long | The unique Id of the contract configuration.
        try {
            CompanyCreatedResponseDTO result = apiInstance.postCompanyUsingPOST(body, contractId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#postCompanyUsingPOST");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator who is signing.
        try {
            ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorBinaryFileSignatureUsingPATCH(collaboratorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#updateCollaboratorBinaryFileSignatureUsingPATCH");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        UpdateCollaboratorIdentityFieldsRequestDTO body = new UpdateCollaboratorIdentityFieldsRequestDTO(); // UpdateCollaboratorIdentityFieldsRequestDTO | fields
        Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator you'd like to update.
        try {
            ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorFieldsUsingPATCH(body, collaboratorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#updateCollaboratorFieldsUsingPATCH");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        UpdateFieldsCollaboratorDTO body = new UpdateFieldsCollaboratorDTO(); // UpdateFieldsCollaboratorDTO | fields
        Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator who is signing.
        try {
            ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorRolesUsingPATCH(body, collaboratorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#updateCollaboratorRolesUsingPATCH");
            e.printStackTrace();
        }
    }
}
import com.legislate.*;
import com.legislate.auth.*;
import com.legislate.model.*;
import com.legislate.api.CollaboratorApi;

import java.io.File;
import java.util.*;

public class CollaboratorApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: auth0_jwt
        OAuth auth0_jwt = (OAuth) defaultClient.getAuthentication("auth0_jwt");
        auth0_jwt.setAccessToken("YOUR ACCESS TOKEN");

        CollaboratorApi apiInstance = new CollaboratorApi();
        Long collaboratorId = 789L; // Long | The unique Id of the contract collaborator who is signing.
        try {
            ContractCollaboratorResponseDTO result = apiInstance.updateCollaboratorSignatureUsingPATCH(collaboratorId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollaboratorApi#updateCollaboratorSignatureUsingPATCH");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to https://api.legislate.tech

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CollaboratorApi* | [**deleteCollaboratorUsingDELETE**](docs/CollaboratorApi.md#deleteCollaboratorUsingDELETE) | **DELETE** /v1/collaborators/{collaboratorId} | Delete a Collaborator by its id.
*CollaboratorApi* | [**getCollaboratorIdentityFieldsUsingGET**](docs/CollaboratorApi.md#getCollaboratorIdentityFieldsUsingGET) | **GET** /v1/templates/{idTemplate}/fields | Get Identity fields
*CollaboratorApi* | [**getCollaboratorUsingGET**](docs/CollaboratorApi.md#getCollaboratorUsingGET) | **GET** /v1/collaborators/{collaboratorId} | Get contract collaborator details
*CollaboratorApi* | [**getCollaboratorsUsingGET**](docs/CollaboratorApi.md#getCollaboratorsUsingGET) | **GET** /v1/contracts/{contractId}/collaborators | Get collaborators for a given contract
*CollaboratorApi* | [**postCollaboratorUsingPOST**](docs/CollaboratorApi.md#postCollaboratorUsingPOST) | **POST** /v1/contracts/{contractId}/collaborators | Create a collaborator given a contract
*CollaboratorApi* | [**postCompanyUsingPOST**](docs/CollaboratorApi.md#postCompanyUsingPOST) | **POST** /v1/contracts/{contractId}/company | Create a company given a contract
*CollaboratorApi* | [**updateCollaboratorBinaryFileSignatureUsingPATCH**](docs/CollaboratorApi.md#updateCollaboratorBinaryFileSignatureUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/signature | Upload a signature to a collaborator
*CollaboratorApi* | [**updateCollaboratorFieldsUsingPATCH**](docs/CollaboratorApi.md#updateCollaboratorFieldsUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/fields | Update collaborator fields
*CollaboratorApi* | [**updateCollaboratorRolesUsingPATCH**](docs/CollaboratorApi.md#updateCollaboratorRolesUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/roles | Update collaborator role
*CollaboratorApi* | [**updateCollaboratorSignatureUsingPATCH**](docs/CollaboratorApi.md#updateCollaboratorSignatureUsingPATCH) | **PATCH** /v1/collaborators/{collaboratorId}/user-signature | Upload a signature to a collaborator
*ContractApi* | [**deleteContractUsingDELETE**](docs/ContractApi.md#deleteContractUsingDELETE) | **DELETE** /v1/contracts/{contractId} | Deletes a contract by its id.
*ContractApi* | [**getContractFileUsingGET**](docs/ContractApi.md#getContractFileUsingGET) | **GET** /v1/contracts/{contractId}/pdf | Get contract pdf
*ContractApi* | [**getContractHtmlUsingGET**](docs/ContractApi.md#getContractHtmlUsingGET) | **GET** /v1/contracts/{contractId}/html | Get contract html
*ContractApi* | [**getContractUsingGET**](docs/ContractApi.md#getContractUsingGET) | **GET** /v1/contracts/{contractId} | Get contract details.
*ContractApi* | [**getContractsUsingGET**](docs/ContractApi.md#getContractsUsingGET) | **GET** /v1/teams/{teamId}/contracts | Get contracts in a team
*ContractApi* | [**postContractUsingPOST**](docs/ContractApi.md#postContractUsingPOST) | **POST** /v1/teams/{teamId}/contracts | Create a contract with an auto-generated bundle.
*ContractApi* | [**updateContractUsingPATCH**](docs/ContractApi.md#updateContractUsingPATCH) | **PATCH** /v1/contracts/{contractId} | Updates a contract.
*ContractFieldApi* | [**getTemplateTermUsingGET**](docs/ContractFieldApi.md#getTemplateTermUsingGET) | **GET** /v1/terms/{termId} | Get template term.
*ContractFieldApi* | [**getTemplateTermsUsingGET**](docs/ContractFieldApi.md#getTemplateTermsUsingGET) | **GET** /v1/templates/{templateId}/terms | Get template terms.
*ContractTypeApi* | [**getContractTypePerTeamUsingGET**](docs/ContractTypeApi.md#getContractTypePerTeamUsingGET) | **GET** /v1/teams/{teamId}/contract-types/{contractTypeId} | Get information relative a given contract type.
*ContractTypeApi* | [**getContractTypeUsingGET**](docs/ContractTypeApi.md#getContractTypeUsingGET) | **GET** /v1/contract-types/{contractTypeId} | Get contract type terms.
*ContractTypeApi* | [**getContractTypesPerTeamUsingGET**](docs/ContractTypeApi.md#getContractTypesPerTeamUsingGET) | **GET** /v1/teams/{teamId}/contract-types | Get contract types of a team
*ContractTypeApi* | [**getContractTypesUsingGET**](docs/ContractTypeApi.md#getContractTypesUsingGET) | **GET** /v1/contract-types | Get public contract types.
*ContractTypeTemplateApi* | [**getTemplateUsingGET**](docs/ContractTypeTemplateApi.md#getTemplateUsingGET) | **GET** /v1/teams/{teamId}/contract-types/{contractTypeId}/templates/{templateId} | Get contract template.
*ContractTypeTemplateApi* | [**getTemplatesUsingGET**](docs/ContractTypeTemplateApi.md#getTemplatesUsingGET) | **GET** /v1/teams/{teamId}/contract-types/{contractTypeId}/templates | Get the latest template version for a contract type
*CouponApi* | [**getEmailCouponSubscritpionUsingGET**](docs/CouponApi.md#getEmailCouponSubscritpionUsingGET) | **GET** /v1/email/coupon/{couponId}/register/{email} | Send an email with a coupon for new users.
*TeamApi* | [**getTeamUsingGET**](docs/TeamApi.md#getTeamUsingGET) | **GET** /v1/teams/{teamId} | Get team details.
*TeamApi* | [**getTeamsUsingGET**](docs/TeamApi.md#getTeamsUsingGET) | **GET** /v1/users/{userId}/teams | Get teams.
*TeamApi* | [**postTeamUsingPOST**](docs/TeamApi.md#postTeamUsingPOST) | **POST** /v1/users/{userId}/teams | Create a team for a given user.
*TeamApi* | [**updateTeamUsingPATCH**](docs/TeamApi.md#updateTeamUsingPATCH) | **PATCH** /v1/teams/{teamId} | Updates a team.
*UserApi* | [**createUserUsingPOST**](docs/UserApi.md#createUserUsingPOST) | **POST** /v1/users | Create a user
*UserApi* | [**getUserUsingGET**](docs/UserApi.md#getUserUsingGET) | **GET** /v1/users/{userId} | Get user details.
*UserApi* | [**getUsersUsingGET**](docs/UserApi.md#getUsersUsingGET) | **GET** /v1/users | Get all users.

## Documentation for Models

 - [CollaboratorFieldsRequestDTO](docs/CollaboratorFieldsRequestDTO.md)
 - [CollaboratorResponseDTO](docs/CollaboratorResponseDTO.md)
 - [CompanyCreatedResponseDTO](docs/CompanyCreatedResponseDTO.md)
 - [CompanyFieldsDTO](docs/CompanyFieldsDTO.md)
 - [ContractCollaboratorResponseDTO](docs/ContractCollaboratorResponseDTO.md)
 - [ContractFieldOptionDTO](docs/ContractFieldOptionDTO.md)
 - [ContractFieldRequestDTO](docs/ContractFieldRequestDTO.md)
 - [ContractFieldResponseDTO](docs/ContractFieldResponseDTO.md)
 - [ContractResponseDTO](docs/ContractResponseDTO.md)
 - [ContractTypeResponseDTO](docs/ContractTypeResponseDTO.md)
 - [ContractTypeTemplateResponseDTO](docs/ContractTypeTemplateResponseDTO.md)
 - [CreateCollaboratorIdentityFieldV1DTO](docs/CreateCollaboratorIdentityFieldV1DTO.md)
 - [CreateContractRequestDTO](docs/CreateContractRequestDTO.md)
 - [CreateTeamRequestDTO](docs/CreateTeamRequestDTO.md)
 - [CreateUserRequestDTO](docs/CreateUserRequestDTO.md)
 - [FieldDTO](docs/FieldDTO.md)
 - [IdentityFieldOptionDTO](docs/IdentityFieldOptionDTO.md)
 - [IdentityFieldsCollaboratorRoleDTO](docs/IdentityFieldsCollaboratorRoleDTO.md)
 - [IdentityFieldsCollaboratorRoleRequestDTO](docs/IdentityFieldsCollaboratorRoleRequestDTO.md)
 - [IdentityPartyFieldTemplatev1DTO](docs/IdentityPartyFieldTemplatev1DTO.md)
 - [Link](docs/Link.md)
 - [LinkRelation](docs/LinkRelation.md)
 - [Links](docs/Links.md)
 - [RegisteredOfficeAddressDTO](docs/RegisteredOfficeAddressDTO.md)
 - [RoleVisibilityDTO](docs/RoleVisibilityDTO.md)
 - [TeamResponseDTO](docs/TeamResponseDTO.md)
 - [TemplateVariable](docs/TemplateVariable.md)
 - [UpdateCollaboratorIdentityFieldsRequestDTO](docs/UpdateCollaboratorIdentityFieldsRequestDTO.md)
 - [UpdateContractRequestDTO](docs/UpdateContractRequestDTO.md)
 - [UpdateFieldsCollaboratorDTO](docs/UpdateFieldsCollaboratorDTO.md)
 - [UpdateTeamRequestDTO](docs/UpdateTeamRequestDTO.md)
 - [UriTemplate](docs/UriTemplate.md)
 - [UserResponseDTO](docs/UserResponseDTO.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### auth0_jwt

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


