import com.epam.taf.steps.Steps;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainTest {
    public static final String LOGIN = "LOGIN";
    public static final String PASSWORD = "PASSWORD";
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
        Assert.assertEquals(steps.getLoggedInUserName(), LOGIN, "User name not correct");
    }

}
