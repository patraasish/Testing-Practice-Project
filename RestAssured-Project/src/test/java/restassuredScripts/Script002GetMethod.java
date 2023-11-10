package restassuredScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Script002GetMethod {

	@Test(enabled=false)
	public void httpGetMethod() {
		
		//writing rest assured as simple java program
		//http get method
		Response response=RestAssured.get("https://reqres.in/api/users?page=2"); //send request
		
		System.out.println("Status Code "+response.getStatusCode());
		System.out.println(response.getBody().asString());
		System.out.println(response.getTime());
		System.out.println(response.getHeader("Content-Type"));
		
		int expectStatusCode=200;
		int ActualStatusCode=response.getStatusCode();
		Assert.assertEquals(expectStatusCode, ActualStatusCode);
		 
	}
	
	@Test
	public void getMethodBDDStyle() {
		
		RestAssured
		.given()
		.baseUri("https://reqres.in/api/users")
		.queryParam("page", 2)
		.when()
		.get()
		.then()
		.statusCode(200)//it is validate if the status code is 200 or not//it is a  validation method//if not 200 it will give error
		.log().all(); //fetch the response and print it on console				
							
	}
}
