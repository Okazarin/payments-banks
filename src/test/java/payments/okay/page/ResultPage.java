package payments.okay.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import payments.okay.item.Text;

public class ResultPage extends BasePage {

    public ResultPage(WebDriver driver) {
        super(driver);
    }

    public String getExpectedTextLV(String text) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("body"), text));
        Text message = new Text(findElement(By.cssSelector("div.css_result.css_result-failure h2")));
        return message.getText();
    }

    public String getExpectedTextLT(String text) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("body"), text));
        Text message = new Text(findElement(By.cssSelector("div.contentLine")));
        return message.getText();
    }

    public String getExpectedTextEE(String text) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("body"), text));
        Text message = new Text(findElement(By.cssSelector("dl.css_error dt")));
        return message.getText();
    }

}