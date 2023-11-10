package restassuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script011LoggingRestAssured {

	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "PMAK-65447c6e08a9063891b1ab14-915149ea4b18587f604bef9cc9dbb47398";
		RestAssured.given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}

}
