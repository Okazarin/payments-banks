package payments.okay.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import payments.okay.item.Button;
import payments.okay.item.Input;

public class LoginPage_EE extends BasePage {


    public LoginPage_EE(WebDriver driver) {
        super(driver);
    }

    public Input getId() {
        return new Input(waitFor(By.id("internet_banking_id_card")));
    }

    private Button getSubmit() {
        return new Button(waitFor(By.cssSelector("button.button")));
    }

    public void submit() {
        getSubmit().click();
    }
}
