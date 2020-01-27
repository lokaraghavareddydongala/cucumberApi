package testcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class GoogleAPI {

	@Test
	public void getAddress() {
		RestAssured.baseURI = "https://maps.googleapis.com";
		String res = given().queryParam("key", "AIzaSyDYO-iGLG1cpA3bNQMpOQsagf1tVJHx4ok")
				.queryParam("query", "abdhdhdsdkdskj").when().get("/maps/api/place/textsearch/json").then().assertThat()
				.statusCode(200).and().statusLine("HTTP/1.1 200 OK").extract().response().asString();
		System.out.println(res);

	}

}
