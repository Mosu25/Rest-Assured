package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

	@Test
	
	public void getAllEmployees() {
		
//		RestAssured.baseURI="http://localhost:3000/";
		RestAssured.baseURI ="http://localhost:3000/employees";
		RequestSpecification requestspecification = RestAssured.given();
//		Response response = requestspecification.request(Method.GET,"employees");
		Response response = requestspecification.request(Method.GET);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
		
	}
}
