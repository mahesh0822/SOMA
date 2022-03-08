package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientTeamNormalZones extends BaseClass
{

	@Test
	public void patientTeamNormalZones()
	{
		
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/SomaGetPatientTeamNormalZones?PatientId=43061&PatientTeamId=900&ReadingTypeId=1");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Device/SomaGetPatientTeamNormalZones?PatientId=43061&PatientTeamId=900&ReadingTypeId=1");
	//  this api gives the 	normal zones of ReadingTypeId = 1(BP) for team where PatientTeamId = 900(Bangalore mount sanai)
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
		
		
	}
}
