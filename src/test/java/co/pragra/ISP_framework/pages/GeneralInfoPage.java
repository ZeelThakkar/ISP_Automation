package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInfoPage extends TestBase {

    @FindBy(xpath = "//a[@class = 'btn btn-dark2 m-l-7 ng-scope']//hide[text() = 'Add New ']")
    WebElement addStudent;

    public GeneralInfoPage() {
        PageFactory.initElements(driver,this);
    }

    public GeneralInfoSection clickOnAddNewStudent() {
        addStudent.click();
        return new GeneralInfoSection();
    }

}
