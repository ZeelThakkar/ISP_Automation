package co.pragra.ISP_framework.TestCases;

import co.pragra.ISP_framework.base.TestBase;
import co.pragra.ISP_framework.pages.GeneralInfoSection;
import co.pragra.ISP_framework.pages.LoginPage;
import co.pragra.ISP_framework.pages.StudentModule;
import co.pragra.ISP_framework.pages.UserDashboard;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class StudentModuleTest extends TestBase {
    LoginPage loginPage;
    UserDashboard userDashboard;
    StudentModule studentModule;
    GeneralInfoSection genInfoSection;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
        userDashboard = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
        studentModule = userDashboard.clickOnStudentModule();
    }

    @Test
    public void verifyCurrentUrlTest() {
        String Url = studentModule.verifyCurrentUrl();
        Assert.assertTrue(Url.contains("student/datasheet"), "The current url does not match!!");
    }

    @Test
    public void clickOnGenInfoTabTest() throws InterruptedException {
        genInfoSection = studentModule.clickOnGenInfoTab();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
