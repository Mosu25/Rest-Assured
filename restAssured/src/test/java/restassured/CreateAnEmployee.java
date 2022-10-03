package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAnEmployee {

	@Test
	public void createAnEmployee() {
		
		RestAssured.baseURI = "http://localhost:3000/employees";
		RequestSpecification requestSpecification = RestAssured.given()
				.header("Content-Type", "application/json")
				.body("{\r\n"
						+"\"first_name\": \"Arun\",\r\n"
						+"\"last_name\": \"M\",\r\n"
						+"\"email\": \"arunm@gmail.com\"\r\n"
						+ "}");
						    
				
		Response response = requestSpecification.request(Method.POST);
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
				
		
	}
	
}
