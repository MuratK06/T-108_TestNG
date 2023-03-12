package proje2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class produkRunn {
    TeamProdukPage teamProdukPage=new TeamProdukPage();
    private ResuableMethods resuableMethods;


    @Test
    public void produkMethod(){
//1 - https://parabank.parasoft.com/parabank/index.htm sitesine gidin

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //2- Cookies olarak cikan bar da decline'i  butonunu tiklayin

        //3- Products linkine click yapin

        teamProdukPage.productButon.click();

        //4- Indistries linkinin icinden Industrial Automation a click yapin

        teamProdukPage.industriesButon.click();

        // cookies e decline yapin

        teamProdukPage.cookiesButon.click();

        //Indistries linkinin icinden Industrial Automation a click yapin

        teamProdukPage.industrialAutamationButon.click();

        //5- Industrial Automation tiklandigini test edin

        String expectedIcerik="Industrial Automation Software Solutions";
        String actualIcerik=Driver.getDriver().findElement(By.xpath("//*[text()='Industrial Automation Software Solutions']")).getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        //6- Contact Us butonuna tiklayin

        teamProdukPage.contactUsButon.click();

        //7- EMail Kutusuna 'muratyildiz@gmail.com' yazin
        //8- FirstName kutusuna 'Murat' yazin
        //9- Last Name kutusuna 'Yildiz'yazin
        //10- Company kutusuna'Team7' yazin
        //11- Job Tittle 'Tester' yazin
        //12- Phone Number kutusuna '+4915525223636' yazin
        //13- Select Country kutusundan 'Gernany' secin
        //14- Comments ktusuna 'Hallo' yazin

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(teamProdukPage.emailButon)
                .sendKeys("muratyildiz@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Murat")
                .sendKeys(Keys.TAB)
                .sendKeys("Yildiz")
                .sendKeys(Keys.TAB)
                .sendKeys("Team7")
                .sendKeys(Keys.TAB)
                .sendKeys("Tester")
                .sendKeys(Keys.TAB)
                .sendKeys("+491552523636")
                .sendKeys(Keys.TAB)
                .sendKeys("Germany")
                .sendKeys(Keys.TAB)
                .sendKeys("Hallo").perform();

        //15- Contact Aus tusuna click yapin

        teamProdukPage.contactUsButon2.click();

        //16- mesajin gonderildigini test edin

        expectedIcerik="Thank You!";
        actualIcerik=Driver.getDriver().findElement(By.xpath("//*[text()='Thank You!']")).getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));



    /*
    proje adi
    pages
    utilities
    c.properties


    butonun utunde beklme
    kutucuktan secme
     */
    }












}
