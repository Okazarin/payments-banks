package payments.okay;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import payments.okay.page.LoginPage_EE;
import payments.okay.page.LoginPage_LT;
import payments.okay.page.LoginPage_LV;
import payments.okay.page.ResultPage;

class LoginTest extends SeleniumBase {

    @Test
    void Latvia() {
        driver.get("https://www.citadele.lv/en/");
        LoginPage_LV loginPage = new LoginPage_LV(driver);
        loginPage.getLogin().type("12345");
        loginPage.getPass().type("12345");
        loginPage.getSubmit().click();

        ResultPage result = new ResultPage(driver);
        MatcherAssert.assertThat(result.getExpectedTextLV("Your login name is locked."), Matchers.containsString("Your login name is locked."));

    }

    @Test
    void Lithuania() {
        driver.get("https://www.citadele.lt/en/");

        LoginPage_LT loginPage = new LoginPage_LT(driver);
        loginPage.getLogin().type("12345");
        loginPage.getPass().type("12345");
        loginPage.getSubmit().click();

        ResultPage result = new ResultPage(driver);
        MatcherAssert.assertThat(result.getExpectedTextLT("Wrong username or password"), Matchers.containsString("Wrong username or password"));

    }

    @Test
    void Estonia() {
        driver.get("https://www.citadele.ee/en/");
        LoginPage_EE loginPage = new LoginPage_EE(driver);
        loginPage.getId().type("12345");
        loginPage.submit();

        ResultPage result = new ResultPage(driver);
        MatcherAssert.assertThat(result.getExpectedTextEE("Identification failed."), Matchers.containsString("Identification failed."));

    }
}
