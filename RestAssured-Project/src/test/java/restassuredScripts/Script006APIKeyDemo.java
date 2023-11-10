package restassuredScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Script006APIKeyDemo {

	
	@Test
	public void postmanGetRequest() {
		
		String PM_Key="PMAK-65447c6e08a9063891b1ab14-915149ea4b18587f604bef9cc9dbb47398";
		
		RestAssured
		.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PM_Key)
		.when().get()
		.then().statusCode(200)
		.log().all();
	}
	
	
	@Test(priority=2)
	public void extract_Value_From_Response() {
		
		String PM_Key="PMAK-65447c6e08a9063891b1ab14-915149ea4b18587f604bef9cc9dbb47398";
		
	String responseOutput=RestAssured
		.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PM_Key)
		.when().get()
		.then()
		.extract().path("workspaces[1].name");
	
	System.out.println("Workspace name: "+responseOutput);
	
	
	}
	
	@Test(priority=3)
	public void extract_Response_JSONPath() {
		
		String PM_Key="PMAK-65447c6e08a9063891b1ab14-915149ea4b18587f604bef9cc9dbb47398";
		
	Response response=RestAssured
		.given()
		.baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PM_Key)
		.when().get()
		.then()
		.extract().response();
	
		JsonPath json=new JsonPath(response.asString());
		
		System.out.println(json.getString("workspaces[1]"));
	
	
	}
	
	
	
	
}
