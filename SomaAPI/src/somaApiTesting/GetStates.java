package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStates extends BaseClass
{

	@Test
	public void DjNotificationSettings()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/MasterData/GetStates");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/MasterData/GetStates");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}

