package co.pragra.ISP_framework.TestCases;

import co.pragra.ISP_framework.base.TestBase;
import co.pragra.ISP_framework.pages.LoginPage;
import co.pragra.ISP_framework.pages.UserDashboard;
import co.pragra.ISP_framework.utils.ExcelUtils;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    UserDashboard userDashboard;

    @BeforeSuite
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(dataProvider = "LoginData" )
    public void loginTest(String uname, String password) {
        userDashboard = loginPage.Login(uname,password);
    }

    @DataProvider(name="LoginData")
    Object [][] getData() throws IOException {
        String path=prop.getProperty("excel.path");
        String sheet=prop.getProperty("sheetLogin");
        int rownum= ExcelUtils.getRowCount(path, sheet);
        int colcount=ExcelUtils.getCellCount(path,sheet,1);

        String logindata[][]=new String[rownum][colcount];

        for(int i=1;i<=rownum;i++)
        {
            for(int j=0;j<colcount;j++)
            {
                logindata[i-1][j]=ExcelUtils.getCellData(path,sheet, i,j);//1 0
            }

        }
        return logindata;
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
