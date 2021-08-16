package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy (xpath = "/html/body/app-root/div/div/rz-header/header/div/div/a/picture/img")
    private WebElement logo;

    public WebElement getLogo() {
        return logo;
    }

    public void setLogo(WebElement logo) {
        this.logo = logo;
    }
}
