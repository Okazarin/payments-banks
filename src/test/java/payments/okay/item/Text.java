package payments.okay.item;

import org.openqa.selenium.WebElement;

public class Text extends Element {

    public Text(WebElement element) {
        super(element);
    }

    public String getText() {
        return element.getText();
    }
}
