package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetDjNotificationSettings extends BaseClass
{

	@Test
	public void DjNotificationSettings()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Journal/SomaGetDJNotificationSettings?LoggedInMemberId=6392&SomaPatientId=43061");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Journal/SomaGetDJNotificationSettings?LoggedInMemberId=6392&SomaPatientId=43061");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
