package api_test;

import api.model.GetItemResponse;
import api.model.request.GetItemRequest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import api.model.ErrorResponse;
import org.testng.asserts.SoftAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class GetItem extends BaseApiTest {
    @Test
    public void getItemError(){
        ErrorResponse expectedResponse = new ErrorResponse();
        expectedResponse.setError("id_not_filled");
        expectedResponse.setMethod("/items/get/");
        expectedResponse.setStatus("error");
        expectedResponse.setFieldError("id");
        expectedResponse.setMessage("Поле ID товара  не заполнено");

        ErrorResponse errorResponse = when().get("/get/").then().extract().body().as(ErrorResponse.class);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(errorResponse.getMessage(),expectedResponse.getMessage());
        softAssert.assertEquals(errorResponse.getError(),expectedResponse.getError());
        softAssert.assertEquals(errorResponse.getFieldError(),expectedResponse.getFieldError());
        softAssert.assertAll();
    }
    @Test
    public void getItemTest(){
        GetItemRequest request = new GetItemRequest();
        request.setId("1");
        GetItemResponse response = given().when().body(request).post("/get/").body().as(GetItemResponse.class);
        Assert.assertEquals(response.getResult().getName(),"Товар 1");
    }
}
