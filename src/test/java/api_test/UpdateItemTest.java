package api_test;

import api.model.request.CreateItemRequest;
import api.model.request.UpdateItemRequest;
import api.model.response.CreateItemResponse;
import api.model.response.UpdateItemResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateItemTest extends BaseApiTest {

    @Test
    public void UpdateItemTest() {
        UpdateItemRequest request = new UpdateItemRequest();
        request.setId(1);
        request.setName("Tovar1");
        request.setDescription("3.14zdec");
        request.setSection("Test");
        request.setColor("RED");
        request.setSize(44);
        request.setPrice(666);
        request.setParams("dress");
        UpdateItemResponse response = given().when().body(request).post("/update/").body().as(UpdateItemResponse.class);
        //   ErrorResponse response = given().when().body(request).post("/create/").body().as(ErrorResponse.class);
        Assert.assertEquals(response.getResult(),"Товар обновлен!");
    }

}
