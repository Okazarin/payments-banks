package payments.okay.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import payments.okay.item.Button;
import payments.okay.item.Input;

public class LoginPage_LV extends BasePage {

    private final Button submit;
    private final Input login;
    private final Input pass;

    public LoginPage_LV(WebDriver driver) {
        super(driver);
        login = new Input(waitFor(By.id("internet_banking_user_name")));
        pass = new Input(waitFor(By.id("internet_banking_password")));
        submit = new Button(waitFor(By.cssSelector("button.button")));
    }

    public Input getPass() {
        return pass;
    }

    public Input getLogin() {
        return login;
    }

    public Button getSubmit() {
        return submit;
    }

}
