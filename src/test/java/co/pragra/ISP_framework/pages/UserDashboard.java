package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UserDashboard extends TestBase {

    @FindBy(xpath = "//div[@class = 'panel-heading panel-blue' and @id = 'headingOne']")
    WebElement studentsTab;

    @FindBy(xpath = "//h3[text()=' Homestays']")
    WebElement homestaysTab;

    @FindBy(xpath = "//h3[text()=' Agents']")
    WebElement agentsTab;

    @FindBy(xpath = "//h3[text()=' Classes']")
    WebElement classesTab;

    @FindBy(xpath = "//h3[text()=' Attendance']")
    WebElement attendanceTab;

    @FindBy(xpath = "//h3[text()=' Letters']")
    WebElement lettersTab;

    @FindBy(xpath = "//h3[text()=' Reports']")
    WebElement reportsTab;

    @FindBy(xpath = "//h3[text()=' Settings']")
    WebElement settingsTab;

    @FindBy(xpath = "//h3[text()=' Audit Log']")
    WebElement auditLogTab;

    @FindBy(xpath = "//h3[text()=' Integrations']")
    WebElement integrationsTab;

    @FindBy(xpath = "//h3[text()=' Class Generator']")
    WebElement classGeneratorTab;

    @FindBy(className = "navbar-logo active")
    WebElement ispLogo;

    public UserDashboard() {
        PageFactory.initElements(driver,this);
    }

    public String verifyCurrentUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public boolean validateISPLogo() {
        boolean logo = ispLogo.isDisplayed();
        return logo;
    }

    public boolean verifyStudentsTab() {
        boolean stuTab = studentsTab.isDisplayed();
        return stuTab;
    }

    public boolean verifyHomestaysTab() {
        boolean homTab = homestaysTab.isDisplayed();
        return homTab;
    }

    public boolean verifyAgentsTab() {
        boolean agTab = agentsTab.isDisplayed();
        return agTab;
    }

    public boolean verifyClassesTab() {
        boolean claTab = classesTab.isDisplayed();
        return claTab;
    }

    public boolean verifyAttendanceTab() {
        boolean attTab = attendanceTab.isDisplayed();
        return attTab;
    }

    public boolean verifyLettersTab() {
        boolean lettTab = lettersTab.isDisplayed();
        return lettTab;
    }

    public boolean verifyReportsTab() {
        boolean repTab = reportsTab.isDisplayed();
        return repTab;
    }

    public boolean verifySettingsTab() {
        boolean setTab = settingsTab.isDisplayed();
        return setTab;
    }

    public boolean verifyAuditLogTab() {
        boolean autTab = auditLogTab.isDisplayed();
        return autTab;
    }

    public boolean verifyIntegrationsTab() {
        boolean intTab = integrationsTab.isDisplayed();
        return intTab;
    }

    public boolean verifyClassGeneratorTab() {
        boolean clasGenTab = classGeneratorTab.isDisplayed();
        return clasGenTab;
    }

    public StudentModule clickOnStudentModule() throws InterruptedException {
       // WebDriverWait wait = new WebDriverWait(driver,30);
       // wait.until(ExpectedConditions.visibilityOf(studentsTab));
        Thread.sleep(15000);
        studentsTab.click();
        return new StudentModule();
    }
}
