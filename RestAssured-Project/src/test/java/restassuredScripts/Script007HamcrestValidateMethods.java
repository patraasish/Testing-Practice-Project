package restassuredScripts;

import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;

public class Script007HamcrestValidateMethods {

	
	@Test(enabled=false)
	public void validate_Response_Body() {
		
		String PM_Key="PMAK-65447c6e08a9063891b1ab14-915149ea4b18587f604bef9cc9dbb47398";
		
		//[id:a2d64642-4d96-4540-8e59-a99e6a27db8c, name:Phase3-Lesson2-APITesting, type:personal, visibility:personal]
		RestAssured
		.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PM_Key)
		.when().get()
		.then().statusCode(200)
		.body("workspaces[1].id",equalTo("a2d64642-4d96-4540-8e59-a99e6a27db8c"),
				"workspaces[1].name",equalTo("Phase3-Lesson2-APITesting"),
				"workspaces[1].type",equalTo("personal")); //fetch the body and validate if response
	}
	
	
	@Test(priority=1)
	public void validate_Response_Body_equalTo() {
		
		
		
		//[id:a2d64642-4d96-4540-8e59-a99e6a27db8c, name:Phase3-Lesson2-APITesting, type:personal, visibility:personal]
		RestAssured
		.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		.body("username",equalTo("Uname001"),
				"email",equalTo( "Positive@Attitude.com"),
				"userStatus",equalTo( 1)); //fetch the body and validate if response
	}
	
	@Test(priority=2)
	public void validate_Response_Body_hasItems() {
		
		
		
		//[id:a2d64642-4d96-4540-8e59-a99e6a27db8c, name:Phase3-Lesson2-APITesting, type:personal, visibility:personal]
		RestAssured
		.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/Uname001")
		.when().get()
		.then().statusCode(200)
		.body("username",equalTo("Uname001"),
				"email",equalTo( "Positive@Attitude.com"),
				"userStatus",equalTo( 1)); //fetch the body and validate if response
	}
}
