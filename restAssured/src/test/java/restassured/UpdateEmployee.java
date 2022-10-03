package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployee {
	
	@Test
	public void updateEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/employees/22";
		
		RequestSpecification rs = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+"\"first_name\": \"Srini\",\r\n"
						+"\"last_name\": \"P\",\r\n"
						+"\"email\": \"srinip@gmail.com\"\r\n"
						+ "}");
		
		Response response = rs.request(Method.PUT);
		System.out.println(response.asPrettyString());
		System.out.println(response.statusCode());
		System.out.println(response.statusLine());
	}
	
}
