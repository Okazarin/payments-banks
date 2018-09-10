package payments.okay.item;

import org.openqa.selenium.WebElement;

public abstract class Element {
    protected final WebElement element;

    public Element(WebElement element) {
        this.element = element;
    }
}
