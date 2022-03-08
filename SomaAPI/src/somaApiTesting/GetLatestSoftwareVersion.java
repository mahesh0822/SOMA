package somaApiTesting;

import static org.hamcrest.core.IsEqual.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetLatestSoftwareVersion extends BaseClass
{

	@Test
	public void LatestSoftwareVersion()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/SomaGetLatestSoftwareVersion?platformid=1&versionnumber=1&memberid=7226&isflutterapp=true");
		//Response response = RestAssured.get("\r\n" + 
		//		"https://qaapi.somahealth.com/api/Device/SomaGetLatestSoftwareVersion?platformid=1&versionnumber=1&memberid=7226&isflutterapp=true");
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		response.then().log().all();
		String statusMessage = response.then().extract().path("header.statusMessage");
		System.out.println(statusMessage);
		//Assert.assertEquals(newStatusCode, 200);
	//	Assert.assertEquals(statusMessage, "success", "Api reponse was expected Internal Server Error but received not matching");
	//	response.then().log().all();
			
	}
	
	
}
