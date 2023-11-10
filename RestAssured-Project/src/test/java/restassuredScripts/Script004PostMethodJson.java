package restassuredScripts;

import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Script004PostMethodJson {
	
	//Send the body with the post request with content type json
	
	@Test
	public void postUsingJSON() {
		
			
		
		JSONObject body = new JSONObject();
		body.put("name", "asish");
		body.put("salary", "4567");
		body.put("age", "30");
		
		int responseid=RestAssured.given()
		.baseUri("https://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(body)
		.when().post("/create")
		.then()
		.statusCode(200)
		.body("data.name", equalTo("asish"))
		.extract().path("data.id");
		
		
		System.out.println(responseid);
		
		
	}

	

}
