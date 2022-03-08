package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientTotalReadingsCount extends BaseClass
{

	@Test
	public void patientTotalReadingsCount()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/GetPatientLatestReadings?PatientId=43061&DeviceCode=1&LoggedInMemberId=6392");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Device/GetPatientLatestReadings?PatientId=43061&DeviceCode=1&LoggedInMemberId=6392");
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode,200);
		response.then().log().all();
	}
}
