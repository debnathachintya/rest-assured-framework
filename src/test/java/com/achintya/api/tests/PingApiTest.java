package com.achintya.api.tests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PingApiTest {
    @Test
    public void pingTest() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

        given()
                .when().get("/ping")
                .then().assertThat().statusCode(201);

    }
}
