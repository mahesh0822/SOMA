package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientAlertsConfiguration extends BaseClass
{

	
	@Test
	public void patientAlertsConfiguration()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Journal/SomaGetPatientAlertsConfiguration?SomaPatientId=43061");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Journal/SomaGetPatientAlertsConfiguration?SomaPatientId=43061");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
