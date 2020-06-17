package co.pragra.ISP_framework.pages;

import co.pragra.ISP_framework.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralInfoSection extends TestBase {

    @FindBy(xpath = "//input[@id = 'StdStatusField-selectized']")
    WebElement Status_dropdown;

    @FindBy(xpath = "//i[@id = 'Reason']")
    WebElement Reason_dropdown;

    @FindBy(xpath = "//input[@class = 'form-control ng-pristine ng-valid' and @placeholder = 'ESIS_ID']")
    WebElement ESIS_ID;

    @FindBy(xpath = "//input[@id = 'checkIfStudentIsActiveField']")
    WebElement Active_checkbox;

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
}
