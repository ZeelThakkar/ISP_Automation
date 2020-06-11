package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //  Object repositories:
    @FindBy(id = "email")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//img[@src='/bundles/site/images/ISPCloudLogo.png']")
    WebElement ispLogo;

    // Initializing the page objects..
    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    //  Actions:
    public String validateLoginPageTitle() {
        String title = driver.getTitle();
        return title;
    }

    public boolean validateISPLogo() {
        boolean ISPLogo = ispLogo.isDisplayed();
        return ISPLogo;
    }

    public UserDashboard Login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();
        return new UserDashboard();
    }
}
