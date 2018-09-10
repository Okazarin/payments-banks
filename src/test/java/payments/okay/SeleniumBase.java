package payments.okay;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public abstract class SeleniumBase {

    protected WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = createDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    private WebDriver createDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("-private");
        FirefoxProfile profile = new FirefoxProfile();
        options.setProfile(profile);
        return new FirefoxDriver(options);
    }

}
