package com.achintya.api.base;

import com.achintya.api.config.ConfigReader;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    public void setup() {
        RestAssured.baseURI = ConfigReader.getProperty("base.url");
    }
}
