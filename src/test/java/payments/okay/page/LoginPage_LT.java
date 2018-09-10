package payments.okay.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import payments.okay.item.Button;
import payments.okay.item.Input;

public class LoginPage_LT extends BasePage {

    private final Input login;
    private final Input pass;

    public LoginPage_LT(WebDriver driver) {
        super(driver);
        login = new Input(waitFor(By.id("internet_banking_user_name")));
        pass = new Input(waitFor(By.id("internet_banking_password")));
    }

    public Button getSubmit() {
        return new Button(waitFor(By.cssSelector("button.button")));
    }

    public Input getLogin() {
        return login;
    }

    public Input getPass() {
        return pass;
    }
}
