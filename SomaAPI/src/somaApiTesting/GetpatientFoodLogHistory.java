package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetpatientFoodLogHistory extends BaseClass
{

	@Test
	public void patientFoodLogHistory()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Food/SomaGetPatientFoodLogHistory?SomaPatientId=43061&FromDate=2021-06-01&ToDate=2021-08-04&Page=1");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Food/SomaGetPatientFoodLogHistory?SomaPatientId=43061&FromDate=2021-06-01&ToDate=2021-08-04&Page=1");
	//  this api gives data from june 1st 2021 to august 4th 2021 
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		response.then().log().all();
	}
}
