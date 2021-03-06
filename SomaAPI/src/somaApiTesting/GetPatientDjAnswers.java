package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientDjAnswers extends BaseClass
{

	@Test
	public void patientDjAnswers()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Journal/SomaGetPatientDJAnswers?PatientId=43061&CurrentDate=2021-08-04");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Journal/SomaGetPatientDJAnswers?PatientId=43061&CurrentDate=2021-08-04");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
