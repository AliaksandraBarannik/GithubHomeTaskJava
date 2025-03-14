package tests;

import actions.CommonActions;
import actions.LoginActions;
import models.User;
import models.UserFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CommonPage;


public class LoginTest extends BaseTest {
    private LoginActions loginActions;
    private CommonActions commonActions;
    private User user;

    @BeforeClass
    public void setupLoginTest() {
        loginActions = new LoginActions(driver);
        commonActions = new CommonActions(driver);
        user = new UserFactory().getUser();
    }

    @Test(groups = {"sanity"})
    public void loginTest() {
        commonActions.clickSignInButton();
        loginActions.login(user);
        boolean isUserLoggedIn = headerActions.isUserLoggedIn();
        Assert.assertTrue(isUserLoggedIn, "User is not logged in");
    }
}
