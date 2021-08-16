package pages;

import driver.Driver;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.remote.ErrorCodes.TIMEOUT;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getWebDriver(), this);
    }

}
