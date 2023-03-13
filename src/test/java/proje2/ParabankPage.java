package proje2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ResuableMethods;

public class ParabankPage {

private ResuableMethods resuableMethods;
    public ParabankPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(xpath ="//*[text()='Register']")
    public WebElement registerButon;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement firstNameButon;

    @FindBy(xpath = "(((//input[@type='submit'])[2]")
    public WebElement registerOnay;

    @FindBy(xpath = "//*[text()='Transfer Funds']")
    public WebElement transferFundsButon;

    @FindBy(id = "amount")
    public WebElement amaountButonu;

    @FindBy(xpath = "//input[@class='button']")
    public WebElement transferButonu;

    @FindBy(xpath = "//*[text()='Request Loan']")
    public WebElement requestLoanButon;

    @FindBy(xpath = "//input[@id='amount']")
    public WebElement loanAmaountButon;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement applynowButon;

    @FindBy(xpath = "//*[text()='Log Out']")
    public WebElement logoutButon;




}
