package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import static org.hamcrest.core.IsEqual.*;





public class GetReadingTypes extends BaseClass
{

	@Test
	public void GetReadingTypesApi()
	{

		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/GetReadingTypes");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Device/GetReadingTypes");
	//  readingtypes 1 = BP, 2 = Temperature, 3= heartrate, 4= bloodglucose, 5=HRV, 6=SPO2, 8=Activity move, 9=body measurements, 10=RHR, 11=activity calories, 12=respiratory rate	
		System.out.println(response.getStatusCode());
		
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		response.then().log().all();
		
		//response.body("id[0]", 1);
		
		String resp = response.then().extract().path("readingTypeName[0]");
	//  above code will 
		
		String resp1 = response.then().extract().path("readingTypeName").toString();
		
		System.out.println(resp);
	}
	
	//@Test
	public void testGetMemberDeviceIDs()
	{
		ValidatableResponse resp1 = RestAssured.get("https://qaapi.somahealth.com/api/Account/GetReadingTypes").then().statusCode(200).body("id[0]", equalTo(1));
	
		 
		System.out.println(resp1);
	}
}
