package com.achintya.api.tests;

import com.achintya.api.base.BaseTest;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class PingApiTest extends BaseTest {
    @Test
    public void pingTest() {
        given()
                .when()
                    .get("/ping")
                .then()
                    .assertThat().statusCode(201);

    }
}
