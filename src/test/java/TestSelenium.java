
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

public class TestSelenium {

    @Test
    public void baseTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        PageFactory.initElements(webDriver, LogInPage.class);
        LogInPage logInPage = new LogInPage();
        webDriver.get("https://rozetka.com.ua/");
        //LOGIN
        logInPage.logIn("bla", "bla");
        //additional logic
        Actions actions = new Actions(webDriver);
      actions.moveByOffset(3,5).perform();
      //var element = (new WebDriverWait(webDriver, 10)).until(new CustomConditions(By.xpath("")));
      {

    }

   // private void until(ExpectedCondition<WebElement> presenceOfElementLocated) {
    }
}
