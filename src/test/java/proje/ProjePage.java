package proje;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ResuableMethods;

public class ProjePage {
    private ResuableMethods resuableMethods;

    public ProjePage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "(//*[text()='Products'])[2]")
    public WebElement productButon;

    @FindBy(xpath = "//*[text()='Industries']")
    public WebElement productButon2;

    @FindBy(xpath = "//*[text()='Industries']")
    public WebElement industriesButon;

    @FindBy(id = "hs-eu-decline-button")
    public WebElement cookiesButon;

    @FindBy(xpath = "(//div[@class='industries-block-bg'])[7]")
    public WebElement industrialAutamationButon;

    @FindBy(className = "btn white-transparant-btn")
    public WebElement contactUsButon;

    @FindBy(xpath = "//input[@id='email-7e18a454-1995-49f5-a907-ddc7be450646']")
    public  WebElement emailButon;


}
