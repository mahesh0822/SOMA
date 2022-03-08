package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
public class PostCheckMemberPhoneNUmberExists 
{

	@Test
	@SuppressWarnings("unchecked")
	public void checkMemberPhoneNumberExists()
	{ 
	 RestAssured.baseURI ="https://qaapi.somahealth.com/api/Device";
	 RequestSpecification request = RestAssured.given();
	 
	 JSONObject requestParams = new JSONObject();
	 requestParams.put("phoneCode", "+1");
	 requestParams.put("phonenumber", "8660324965");
	 requestParams.put("loggedInMemberId", "6392");
	
	 
	 
//	 request.body(requestParams.toJSONString());
	 
	 
	 request.header("Content-Type", "application/json");
	 request.body(requestParams.toJSONString());
//   RequestSpecification.body(toJSONString);
	 Response response = request.post("/CheckMemberPhoneNumberExists");
	 int statusCode = response.getStatusCode();
	 Assert.assertEquals(statusCode, "405");
	 String successCode = response.jsonPath().get("statusMessage");
	 Assert.assertEquals( "Phone number already exists", successCode, "OPERATION_SUCCESS");
	}
}
