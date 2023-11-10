package steps;
import io.cucumber.java.en.Given;

import org.json.JSONObject;


import io.restassured.RestAssured;

import io.restassured.http.ContentType;



public class Endproject {
	
	@Given("User sends a Post request to create a user and validates status")
	public void user_sends_a_post_request_to_create_a_user_and_validates_status() {
		JSONObject body = new JSONObject();
		body.put("name", "admin");
		body.put("job", "developer");
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post()
		.then().statusCode(201).log().ifError();
	}

	@Given("User sends a post request to get user and validates status")
	public void user_sends_a_post_request_to_get_user_and_validates_status() {
		 JSONObject body = new JSONObject();
		  body.put("email", "eve.holt@reqres.in");
			body.put("password", "pistol");
		  
		  RestAssured.given() .baseUri("https://reqres.in")
		  .contentType(ContentType.JSON) .body(body.toString())
		  .when().post("api/register")
		  .then().statusCode(200)
		  
		  ;
		  
		  
	   
	}

	@Given("User sends a get request to get list of users and validates status")
	public void user_sends_a_get_request_to_get_list_of_users_and_validates_status() {
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/unknown")
		.when().get()
		.then().statusCode(200).log().all();
	
	}


}