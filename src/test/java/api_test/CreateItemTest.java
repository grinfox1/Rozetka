package api_test;

import api.model.request.CreateItemRequest;
import api.model.request.GetItemRequest;
import api.model.response.CreateItemResponse;
import api.model.response.ErrorResponse;
import api.model.response.GetItemResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateItemTest extends BaseApiTest {

    @Test
    public void createItemTest(){
        CreateItemRequest request = new CreateItemRequest();
        request.setName("Tovar1");
        request.setDescription("3.14zdec");
        request.setSection("Test");
        request.setColor("RED");
        request.setSize(44);
        request.setPrice(666);
        request.setParams("dress");
        CreateItemResponse response = given().when().body(request).post("/create/").body().as(CreateItemResponse.class);
     //   ErrorResponse response = given().when().body(request).post("/create/").body().as(ErrorResponse.class);
        Assert.assertEquals(response.getCreateResult().getName(),"Tovar1");
    }

}
