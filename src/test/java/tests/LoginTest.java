package tests;

import actions.LoginActions;
import models.User;
import models.UserFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    private LoginActions loginActions;
    private User user;

    @BeforeClass
    public void setup() {
        loginActions = new LoginActions(driver);
        user = new UserFactory().getUser();
    }

    @Test
    public void loginTest() {
        loginActions.login(user);
        boolean isUserLoggedIn = headerActions.isUserLoggedIn();
        Assert.assertTrue(isUserLoggedIn, "User is not logged in");
    }
}
