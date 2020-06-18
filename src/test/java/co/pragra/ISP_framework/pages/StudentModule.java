package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class StudentModule extends TestBase {

    @FindBy(partialLinkText = "General Information")
    WebElement GenInfoTab;

    public StudentModule() {
        PageFactory.initElements(driver,this);
    }

    public String verifyCurrentUrl() {
        String url = driver.getCurrentUrl();
        return url;
    }

    public GeneralInfoPage clickOnGenInfoTab() throws InterruptedException {
        Thread.sleep(50000);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        GenInfoTab.click();
        return new GeneralInfoPage();
    }
}
