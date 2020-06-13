package co.pragra.ISP_framework.TestCases;

import co.pragra.ISP_framework.base.TestBase;
import co.pragra.ISP_framework.pages.LoginPage;
import co.pragra.ISP_framework.pages.UserDashboard;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    UserDashboard userDashboard;

    @BeforeSuite
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test
    public void loginTest() {
        userDashboard = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @Test
    public void verifyLoginPageTitleTest() {
        String title = loginPage.verifyLoginPageTitle();
        Assert.assertEquals(title,"User Dashboard | ISP Cloud");
    }

    @Test
    public void validateISPLogoTest() {
        boolean logo = loginPage.validateISPLogo();
        Assert.assertTrue(logo);
    }

    @Test
    public void verifyCurrentUrlTest() {
        String currentUrl = loginPage.verifyCurrentUrl();
        Assert.assertTrue(currentUrl.contains("user_login"),"The current url does not match!!");
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
