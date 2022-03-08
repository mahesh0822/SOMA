package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientTeams extends BaseClass
{

	@Test
	public void patientTeams()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/GetPatientTeams?PatientId=43061&LoggedInMemberId=43061&pageIndex=1");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Device/GetPatientTeams?PatientId=43061&LoggedInMemberId=43061&pageIndex=1");
	//  pageIndex = 1, displays only first page results and if it made as 2, then it will display 2nd page results
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
