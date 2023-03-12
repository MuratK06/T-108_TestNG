package proje2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ResuableMethods;

public class TeamProdukPage {

    private ResuableMethods resuableMethods;
    public TeamProdukPage(){PageFactory.initElements(Driver.getDriver(),this);}

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

    @FindBy(xpath = "(//*[text()='Contact Us'])[2]")
    public WebElement contactUsButon;

    @FindBy(xpath = "//input[@id='email-7e18a454-1995-49f5-a907-ddc7be450646']")
    public  WebElement emailButon;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement contactUsButon2;














}
