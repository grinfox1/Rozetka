package ui.main_page_test;

import driver.Driver;
import helpers.HeaderHelper;
import helpers.SearchResultHelper;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTest {
    private static WebDriver driver;
    private static String URL = "http://rozetka.com.ua/";
    private HeaderHelper headerHelper = new HeaderHelper();
    private SearchResultHelper searchResultHelper = new SearchResultHelper();

    @BeforeMethod
    public void init() {
        driver = Driver.getWebDriver();
        driver.get(URL);
    }

    @Test
    public void checkUrl() {
        Assert.assertEquals(driver.getCurrentUrl(), URL);
    }

    @Test
    public void checkSearch() {
        String searchText = "телефон1";
        headerHelper.search(searchText);
       List<String> titles = searchResultHelper.getResultTitle();
        boolean result = false;
        for (String item: titles) {
            if(!item.contains(searchText)){
                result = false;
                break;
            }
            result = true;
        }
        Assert.assertTrue(result);


    }
    @AfterMethod
    public static void setDown() throws Exception {
        driver.quit();
    }
}
