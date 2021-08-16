import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
    @FindBy(xpath = "div")
    WebElement loginInputField;

    @FindBy(xpath = "div")
    WebElement passwordInputField;

    @FindBy(xpath = "div")
    WebElement logInButton;

    public void logIn(String login, String password) {
        loginInputField.sendKeys(login);
        passwordInputField.sendKeys(password);
        logInButton.click();
    }
}
