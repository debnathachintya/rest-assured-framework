package com.achintya.api.base;

import com.achintya.api.utilities.RequestSpecBuilderUtil;
import com.achintya.api.utilities.ResponseSpecBuilderUtil;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected RequestSpecification requestSpecification;
    protected ResponseSpecification responseSpecification;

    @BeforeMethod
    public void setup() {
        requestSpecification = RequestSpecBuilderUtil.getRequestSpecification();
        responseSpecification = ResponseSpecBuilderUtil.getResponseSpecification();
        RestAssured.requestSpecification = requestSpecification;
    }
}
