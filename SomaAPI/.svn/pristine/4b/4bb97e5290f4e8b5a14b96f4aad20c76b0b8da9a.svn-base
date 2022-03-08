package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetListOfDjQuestions extends BaseClass
{

	@Test
	public void listOfDjQuestions()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Journal/SomaGetListOfDJQuestions?LoggedInMemberId=7226");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Journal/SomaGetListOfDJQuestions?LoggedInMemberId=7226");
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
