import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.*;

public class NestSelenium2 {

    @BeforeMethod
    public void beforeTest() {
        Configuration.browser = "edge";
    }
        @AfterMethod
                public void afterMethod() {
        Configuration.reportsUrl ="bla";
        }

    @Test
    public void baseTest() {
        Configuration.browser = "edge";
        open("https://www.google.com/");
           //var element = $(By.xpath(("div")).$(By.xpath("div"));
          // $$(By.xpath("")).stream().filter(s ->s.exist).collect();
       // Browser = (""))
           var elements = $$(By.xpath(""));

        }

        // private void until(ExpectedCondition<WebElement> presenceOfElementLocated) {
    }


