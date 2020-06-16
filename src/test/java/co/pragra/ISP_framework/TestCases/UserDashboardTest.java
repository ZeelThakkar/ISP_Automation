package co.pragra.ISP_framework.TestCases;

import co.pragra.ISP_framework.base.TestBase;
import co.pragra.ISP_framework.pages.LoginPage;
import co.pragra.ISP_framework.pages.StudentModule;
import co.pragra.ISP_framework.pages.UserDashboard;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class UserDashboardTest extends TestBase {
    LoginPage loginPage;
    UserDashboard userDashboard;
    StudentModule studentModule;

    @BeforeSuite
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        userDashboard = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @Test
    public void verifyStudentsTabTest() {
       boolean flag_stu =  userDashboard.verifyStudentsTab();
        Assert.assertTrue(flag_stu);
    }

    @Test
    public void verifyHomestaysTabTest() {
        boolean flag_hom =  userDashboard.verifyHomestaysTab();
        Assert.assertTrue(flag_hom);
    }

    @Test
    public void verifyAgentsTabTest() {
        boolean flag_ag =  userDashboard.verifyAgentsTab();
        Assert.assertTrue(flag_ag);
    }

    @Test
    public void verifyClassesTabTest() {
        boolean flag_cla =  userDashboard.verifyClassesTab();
        Assert.assertTrue(flag_cla);
    }

    @Test
    public void verifyAttendanceTabTest() {
        boolean flag_att =  userDashboard.verifyAttendanceTab();
        Assert.assertTrue(flag_att);
    }

    @Test
    public void verifyLettersTabTest() {
        boolean flag_lett =  userDashboard.verifyLettersTab();
        Assert.assertTrue(flag_lett);
    }

    @Test
    public void verifyReportsTabTest() {
        boolean flag_rep =  userDashboard.verifyReportsTab();
        Assert.assertTrue(flag_rep);
    }

    @Test
    public void verifySettingsTabTest() {
        boolean flag_set =  userDashboard.verifySettingsTab();
        Assert.assertTrue(flag_set);
    }

    @Test
    public void verifyAuditLogTabTest() {
        boolean flag_aud =  userDashboard.verifyAuditLogTab();
        Assert.assertTrue(flag_aud);
    }

    @Test
    public void verifyIntegrationsTabTest() {
        boolean flag_int =  userDashboard.verifyIntegrationsTab();
        Assert.assertTrue(flag_int);
    }

    @Test
    public void verifyClassGeneratorTabTest() {
        boolean flag_cla =  userDashboard.verifyClassGeneratorTab();
        Assert.assertTrue(flag_cla);
    }

    @Test
    public void clickOnStudentModuleTest() throws InterruptedException {
        studentModule = userDashboard.clickOnStudentModule();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
