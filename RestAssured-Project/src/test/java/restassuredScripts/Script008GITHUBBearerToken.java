package restassuredScripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class Script008GITHUBBearerToken {


	@Test(priority='1')
	public void Authorization_bearertoken()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	

	
	@Test(priority='2')
	public void Authorization_bearertoken_specificrepo()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/repos/patraasish/Postman-Api-136")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
}
