package restassuredScripts;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Script003PostMethod {
	
	@Test
	public void httpPostMethod() {
		
		//this is the payload which we have to send with request
		
		HashMap<String, String> hashMap=new HashMap<String, String>();
		hashMap.put("name","Asish");
		hashMap.put("job","Tester");
		
		RestAssured
		.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType("application/json")
		.body(hashMap)
		.when()
		.post()
		.then()
		.statusCode(201)
		.log()
		.all();
		

	}

}
