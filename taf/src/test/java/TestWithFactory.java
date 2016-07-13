import com.epam.taf.steps.Steps;
import com.epam.taf.webDriverFacroryMethod.FirefoxDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWithFactory {

    private final static String USER = "mx.kevich@gmail.com";
    private final static String PASS = "Barcelona24";
    private WebDriver driver;
    private Steps steps;

    @BeforeClass
    public void setUp() {

        driver = FirefoxDriverCreator.getInstance();
        FirefoxDriverCreator.initBrowser();
        steps = new Steps(driver);
        steps.logOut(USER, PASS);
    }

    @AfterClass
    public void tearDown() {
        FirefoxDriverCreator.closeDriver();
        driver = null;
    }

    @Test(priority = 1)
    public void userCanLogin() throws InterruptedException {

        Assert.assertTrue(steps.getLoggedInUserName().contains(USER));

    }


    @Test(dependsOnMethods = "userCanLogin")
    public void userCanLogOut() {

    }
}
