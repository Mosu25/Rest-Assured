package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateEmployeeUsingPatch {

	@Test
	public void updateEmployeeUsingPatch() {
		
		RestAssured.baseURI="http://localhost:3000/employees/12";
		RequestSpecification rs = RestAssured.given()
				.header("Content-Type", "application/json")
				.body("{\r\n"
						+"\"first_name\": \"Ramu\",\r\n"
						+"\"last_name\": \"P\",\r\n"
						+"\"email\": \"ramup@gmail.com\"\r\n"
						+ "}");
		
		Response res = rs.request(Method.PATCH);
				System.out.println(res.asPrettyString());
				System.out.println(res.statusLine());
				System.out.println(res.statusCode());
		
	}
	
}
