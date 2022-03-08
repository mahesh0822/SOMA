package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientNormalZones extends BaseClass
{

	@Test
	public void patientNormalZones()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientNormalZones?ReadingTypeId=2&PatientId=43061&LoggedInMemberId=7226&SomaPatientTeamId=900");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientNormalZones?ReadingTypeId=2&PatientId=43061&LoggedInMemberId=7226&SomaPatientTeamId=900");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
