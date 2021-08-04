import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;


public class Rozetka {
    private static WebDriver driver;
    private static String url;
    private final Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withMessage("Element was not found").withTimeout(10, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS);

    @BeforeClass
    public static void getWebDriver() throws Exception
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://rozetka.com.ua/");
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void logoRozetka(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("header__logo"))));
        WebElement logoRozetka = driver.findElement(By.xpath("/html/body/app-root/div/div/rz-header/header/div/div/a/picture/img"));
        assertNotNull("Rozetka logo is not found", logoRozetka);

    }

    @Test
    public void searchField(){
        WebElement searchField = driver.findElement(By.name("search"));
        Assert.assertTrue("Search field is not found", searchField.isDisplayed());
    }

    @Test
    public void Premium(){
        WebElement premium = driver.findElement(By.xpath(".//*[@href='https://rozetka.com.ua/premium/']//*[contains(text(), 'Попробуйте')]"));
        Assert.assertTrue(premium.isDisplayed());
    }

    @Test
    public void category(){
        WebElement category = driver.findElement(By.xpath(".//*[@class='menu-categories__link']"));
        category.click();
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        WebElement Apple=driver.findElement(By.xpath(".//*['//rz-category-tile/a']//*[contains(text(), 'Apple')]"));
        Assert.assertTrue(Apple.isDisplayed());

    }

    @Test
    public void cart(){
        WebElement cart = driver.findElement(By.xpath(".//*[@class='header__button ng-star-inserted']"));
        cart.click();
        WebElement emptyCart = driver.findElement(By.className("ng-star-inserted"));
        Assert.assertTrue(emptyCart.isDisplayed());
        WebElement close = driver.findElement(By.xpath("/html/body/app-root/single-modal-window/div[2]/div[1]/button"));
        close.click();
    }

    @AfterClass
    public static void setDown() throws Exception {
        driver.quit();
    }

}