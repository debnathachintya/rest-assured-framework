package com.achintya.api.utilities;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.lessThan;

public final class ResponseSpecBuilderUtil {
    private  ResponseSpecBuilderUtil() {

    }

    public static ResponseSpecification getResponseSpecification() {
        return new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(lessThan(3000L))
                .build();
    }
}
