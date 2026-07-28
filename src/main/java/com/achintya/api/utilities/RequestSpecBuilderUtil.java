package com.achintya.api.utilities;

import com.achintya.api.config.ConfigReader;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public final class RequestSpecBuilderUtil {
    private RequestSpecBuilderUtil() {

    }

    public static RequestSpecification getRequestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(ConfigReader.getProperty("base.url"))
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
                .build();
    }
}
