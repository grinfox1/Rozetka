import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestSelenium {

    @Test
    public void baseTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://rozetka.com.ua/");
      Actions actions = new Actions(webDriver);
      actions.moveByOffset(3,5).perform();
      //var element: Boolean (new WebDriverWait(webDriver, 10)).until(new CustomConditions());
      {

    }

   // private void until(ExpectedCondition<WebElement> presenceOfElementLocated) {
    }
}
