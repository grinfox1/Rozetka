package api_test;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeTest;

public class BaseApiTest {
    @BeforeTest
    public void init(){
        RestAssured.baseURI = "http://shop.bugred.ru/api/items/";
    }


}
