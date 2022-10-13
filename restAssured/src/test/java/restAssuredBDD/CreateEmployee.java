package restAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class CreateEmployee {

	@Test
	public void createEmployee() {

		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+"\"first_name\": \"Naga\",\r\n"
				+"\"last_name\": \"E\",\r\n"
				+"\"email\": \"nagae@gmail.com\"\r\n"
				+ "}")

		.when()
		.post("/employees")
		.prettyPrint();
	}

}
