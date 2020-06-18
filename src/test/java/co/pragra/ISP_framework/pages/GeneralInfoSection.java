package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GeneralInfoSection extends TestBase {

    @FindBy(id = "StdStatusField-selectized")
    WebElement Status_dropdown;

    @FindBy(xpath = "//div[@class = 'option' and text()='Active']")
    WebElement sDropdown;

    @FindBy(xpath = "//div[@class = 'option' and text()='Exchange Student']")
    WebElement rDropdown;

    @FindBy(xpath = "//i[@id = 'Reason']")
    WebElement Reason_dropdown;
//
//    @FindBy(xpath = "//input[@class = 'form-control ng-pristine ng-valid' and @placeholder = 'ESIS_ID']")
//    WebElement ESIS_ID;

 //   @FindBy(xpath = "//input[@id = 'checkIfStudentIsActiveField']")
   // WebElement Active_checkbox;

    @FindBy(id = "fName")
    WebElement firstName;

    @FindBy(id = "lName")
    WebElement lastName;

    @FindBy(id = "Nickname")
    WebElement nickName;

    @FindBy(id = "MiddleName")
    WebElement midName;

    @FindBy(id = "stdPhone")
    WebElement stuPhone;

    public GeneralInfoSection() {
        PageFactory.initElements(driver,this);
    }

    public PlacementTestingSection fillingTheForm(String fName, String lName,
                               String nName, String mName) {
       Status_dropdown.click();
       sDropdown.click();

       Reason_dropdown.click();
       rDropdown.click();

       // Active_checkbox.click();
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        nickName.sendKeys(nName);
        midName.sendKeys(mName);

        return new PlacementTestingSection();

    }
}
