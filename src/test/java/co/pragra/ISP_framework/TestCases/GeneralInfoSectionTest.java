package co.pragra.ISP_framework.TestCases;

import co.pragra.ISP_framework.base.TestBase;
import co.pragra.ISP_framework.pages.*;
import co.pragra.ISP_framework.utils.ExcelUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class GeneralInfoSectionTest extends TestBase {
    LoginPage loginPage;
    UserDashboard userDashboard;
    StudentModule studentModule;
    GeneralInfoPage generalInfoPage;
    GeneralInfoSection generalInfoSection;
    PlacementTestingSection placementTestingSection;

    @BeforeSuite
    public void setUp() throws InterruptedException {
        initialization();
        loginPage = new LoginPage();
        userDashboard = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
        studentModule = userDashboard.clickOnStudentModule();
        generalInfoPage = studentModule.clickOnGenInfoTab();
        generalInfoSection = generalInfoPage.clickOnAddNewStudent();
    }

//    @Test
//    public void test1() {
//
//    }

    @Test(dataProvider = "getTestData")
    public void fillingTheFormTest(String fName, String lName,
                                   String nName, String mName) {
        placementTestingSection = generalInfoSection.fillingTheForm(fName, lName, nName, mName);
    }

    @DataProvider(name="getTestData")
    Object [][] getData() throws IOException {
        String path=prop.getProperty("excel.path");
        String sheet=prop.getProperty("sheetForm");
        int rownum= ExcelUtils.getRowCount(path, sheet);
        int colcount=ExcelUtils.getCellCount(path,sheet,1);

        String form[][]=new String[rownum][colcount];

        for(int i=1;i<=rownum;i++)
        {
            for(int j=0;j<colcount;j++)
            {
                form[i-1][j]=ExcelUtils.getCellData(path,sheet, i,j);//1 0
            }

        }
        return form;
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
