package restAssuredBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteAnEmployee {

@Test
	public void deleteAnEmployee() {
	
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.when()
	.delete("/employees/20")
	.prettyPrint();
}


}
