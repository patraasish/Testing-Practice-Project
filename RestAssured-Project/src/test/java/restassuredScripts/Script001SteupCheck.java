package restassuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script001SteupCheck {
	
	@Test
	public void setupCheck() {
		
		//http get method
		Response response=RestAssured.get("https://reqres.in/api/users/2"); //send request
		
		System.out.println("Response"+response.asString());//covert to string
		System.out.println("Status Code "+response.getStatusCode());
		response.prettyPrint();
		 
	}

}
