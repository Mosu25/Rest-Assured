package restassured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteEmployee {

	@Test
	public void deleteEmployee() {
		
		RestAssured.baseURI="http://localhost:3000/employees/11";
		
		RequestSpecification rs = RestAssured.given();
		Response res = rs.request(Method.DELETE);
//		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
		System.out.println(res.statusLine());
		
	}
	
}
