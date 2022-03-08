package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientFullName extends BaseClass
{

	@Test
	public void patientFullName()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/GetPatientFullName?PatientId=43061");
		//Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/GetPatientFullName?PatientId=43061");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Device/GetPatientFullName?PatientId=43061");
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode,200);
		response.then().log().all();
	}
}
