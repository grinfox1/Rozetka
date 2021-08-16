import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertNotNull;


public class Action {
    private static WebDriver driver;
    private static String url;
    private final Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withMessage("Element was not found").withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);

    @BeforeClass
    public static void getWebDriver() throws Exception  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua/");
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void logoRozetka() {
        WebElement logoRozetka = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/a/picture/img"));
        Actions builder = new Actions(driver);
        builder.moveToElement(logoRozetka)
                .click(logoRozetka);
        assertNotNull("Rozetka logo is not found", logoRozetka);
    }
}
