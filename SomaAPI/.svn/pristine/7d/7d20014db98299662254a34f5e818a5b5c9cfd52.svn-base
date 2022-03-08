package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientFoodLogDetails extends BaseClass
{

	@Test
	public void patientFoodLogDetails()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Food/SomaGetPatientFoodLogDetails?SomaPatientId=43061&LogDate=2021-07-13");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Food/SomaGetPatientFoodLogDetails?SomaPatientId=43061&LogDate=2021-07-13");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
