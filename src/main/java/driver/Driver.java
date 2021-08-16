package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;

    static {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }
}
