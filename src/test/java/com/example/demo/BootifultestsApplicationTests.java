package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class BootifultestsApplicationTests {
	private final static String BASE_URI = "http://localhost:8090";
	@LocalServerPort
	private int port;

	@Before
	public void configureRestAssured() {
		RestAssured.baseURI = BASE_URI;
		RestAssured.port = port;
	}

	@Test
	public void TestgetCurrentStatus() {
		given()
		.baseUri("http://localhost:8090")
				.when()
				.get("/adder/current")
				.then()
				.log().all()
				.assertThat().statusCode(200);
	}

	/*@Test
	public void TestgetCurrentRes() {
		given()
				.baseUri("http://localhost:8090")
				.when()
				.get("/adder/current")
				.then().equals(5678);
	}*/


	@Test
	public void TestaddNumStatus() {
		given()
				.baseUri("http://localhost:8090")
				.queryParam("num","2")
				.when()
				.post("/adder")
				.then()
				.log().all()
				.assertThat().statusCode(200);

	}


	/*@Test
	public void TestaddNumRes() {
		given()
				.baseUri("http://localhost:8090")
				.when()
				.get("/adder/current")
				.then().equals(1);
	}*/

}
