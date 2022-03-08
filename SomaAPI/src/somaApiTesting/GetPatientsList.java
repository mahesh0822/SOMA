package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientsList extends BaseClass
{

	
	@Test
	public void patientList()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientsList?LoggedInMemberId=6392&SomaPatientTeamId=900&Page=1");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientsList?LoggedInMemberId=6392&SomaPatientTeamId=900&Page=1");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
