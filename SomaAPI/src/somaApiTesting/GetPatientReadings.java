package somaApiTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetPatientReadings extends BaseClass

{
	
	@Test
	public void patientReadings()
	{
		Response response = RestAssured.given().auth().oauth2(token).get("https://qaapi.somahealth.com/api/Device/GetPatientReadings?PatientId=43061&MemberId=7226&ReadingFrom=2021-08-01&ReadingTo=2021-08-03&ReadingTypeId=2&pageIndex=1&getSomaWearableReadings=true&LoggedInMemberId=43061");
		//Response response = RestAssured.get("https://qaapi.somahealth.com/api/Device/GetPatientReadings?PatientId=43061&MemberId=7226&ReadingFrom=2021-08-01&ReadingTo=2021-08-03&ReadingTypeId=2&pageIndex=1&getSomaWearableReadings=true&LoggedInMemberId=43061");
	//  readingtypes 1 = BP, 2 = Temperature, 3= heartrate, 4= bloodglucose, 5=HRV, 6=SPO2, 8=Activity move, 9=body measurements, 10=RHR, 11=activity calories, 12=respiratory rate
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode,200);
		response.then().log().all();
	//	response.then().extract().contentType();
	}

}
