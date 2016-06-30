import com.epam.taf.steps.Steps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest {
    public static final String LOGIN = "mx.kevich@gmail.com";
    public static final String PASSWORD = "Barcelona24";
    private Steps steps = null;

    @BeforeMethod
    public void setUp() {
        steps = new Steps();
        steps.initBrowser();
    }

    @AfterMethod
    public void ternDown() {
        steps.closeDriver();
    }

    @Test
    public void userCanLogin() {
        steps.logIn(LOGIN, PASSWORD);
        Assert.assertEquals(steps.getLoggedInUserName(), "Gmail", "User name not correct");
    }

}
