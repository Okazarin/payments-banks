package payments.okay.item;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Input extends Element {
    public Input(WebElement element) {
        super(element);
    }

    public Input type(String value) {
        element.sendKeys(value);
        return this;
    }

    public Input sendEnter() {
        element.sendKeys(Keys.ENTER);
        return this;
    }
}