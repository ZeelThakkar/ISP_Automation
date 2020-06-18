package co.pragra.ISP_framework.TestCases;

import co.pragra.ISP_framework.base.TestBase;
import co.pragra.ISP_framework.pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GeneralInfoPageTest extends TestBase {
    LoginPage loginPage;
    UserDashboard userDashboard;
    StudentModule studentModule;
    GeneralInfoPage generalInfoPage;
    GeneralInfoSection generalInfoSection;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
        userDashboard = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
        studentModule = userDashboard.clickOnStudentModule();
        generalInfoPage = studentModule.clickOnGenInfoTab();
    }

    @Test
    public void clickOnAddNewStudentTest() throws InterruptedException {
        generalInfoSection = generalInfoPage.clickOnAddNewStudent();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
