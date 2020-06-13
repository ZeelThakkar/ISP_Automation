package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboard extends TestBase {

    @FindBy(partialLinkText = "Students")
    WebElement studentsTab;

    @FindBy(partialLinkText = "Homestays")
    WebElement homestaysTab;

    @FindBy(partialLinkText = "Agents")
    WebElement agentsTab;

    @FindBy(partialLinkText = "Classes")
    WebElement classesTab;

    @FindBy(partialLinkText = "Attendance")
    WebElement attendanceTab;

    @FindBy(partialLinkText = "Letters")
    WebElement lettersTab;

    @FindBy(partialLinkText = "Reports")
    WebElement reportsTab;

    @FindBy(partialLinkText = "Settings")
    WebElement settingsTab;

    @FindBy(partialLinkText = "Audit Log")
    WebElement auditLogTab;

    @FindBy(partialLinkText = "Integrations")
    WebElement integrationsTab;

    @FindBy(partialLinkText = "Class Generator")
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











}
