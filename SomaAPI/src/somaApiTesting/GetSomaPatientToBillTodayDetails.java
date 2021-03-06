package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetSomaPatientToBillTodayDetails extends BaseClass
{

	@Test
	public void DjNotificationSettings()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientToBillTodayDetails?LoggedInMemberId=10&PracticeId=1&FromDate=2021-08-06&ToDate=2021-09-04&SomaPatientId=43456&LocationId=1");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Provider/SomaGetPatientToBillTodayDetails?LoggedInMemberId=10&PracticeId=1&FromDate=2021-08-06&ToDate=2021-09-04&SomaPatientId=43456&LocationId=1");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
