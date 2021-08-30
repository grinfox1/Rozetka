import com.google.gson.JsonObject;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.config.RestAssuredConfig;
import java.util.Map;
import static io.restassured.RestAssured.given;

public class Test_11 {

    @Test
    public void restAssuredTest() {
        RestAssuredConfig config = RestAssuredConfig.newConfig().logConfig(new LogConfig());
        given().headers(Map.of("Authorization", "123"))
                .sessionId("asws").config(config).body(new JsonObject())
                .when().post("https://google.com")
                .then().statusCode(201).header("bla", "1").extract().as(Response.class);

    }

    private <RestAssurredConfig> RequestSpecification prepareRequest(RestAssurredConfig config) {
        return given().headers(Map.of("Authorization", "123"))
                .sessionId("asws").config((RestAssuredConfig) config).body(new JsonObject());


    }
}
