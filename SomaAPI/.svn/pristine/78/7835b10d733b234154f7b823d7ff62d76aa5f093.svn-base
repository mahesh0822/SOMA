package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientCount extends BaseClass
{

	@Test
	public void patientCount()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientCount?LoggedInMemberId=6392");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientCount?LoggedInMemberId=6392");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
