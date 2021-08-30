package api2;

import org.apache.commons.io.IOUtils;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpHost;
import org.testng.annotations.Test;

import java.io.IOException;


public class ApiTest {

    String url = "https://reqres.in/api/users?page=1";

    @Test
    public void apiTest() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("https://reqres.in/api/users?page=2");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        System.out.println(IOUtils.toString(response.getEntity().getContent()));

    }


}
