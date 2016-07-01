import com.epam.taf.steps.Steps;
import com.epam.taf.webDriverFacroryMethod.FirefoxDriverCreator;
import com.epam.taf.webDriverFacroryMethod.WebDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWithFactory {
    WebDriverCreator creator;
    private WebDriver driver;
    private Steps steps;

    @BeforeMethod
    public void setUp() {
        creator = new FirefoxDriverCreator();
        driver = creator.factoryMethod();
        creator.initBrowser();

    }

    @AfterMethod
    public void ternDown() {
        creator.closeDriver();
        creator = null;
        driver = null;
    }

    @Test
    public void userCanLogin() {
        steps = new Steps(driver);
        steps.logIn("LOGIN", "PASSWORD");

    }
}
