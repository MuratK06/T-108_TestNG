package proje;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class proje_Products {

ProductttPage productttPage=new ProductttPage();
    private ResuableMethods resuableMethods;

    @Test
    public void productttMethod() {


        //1 - https://parabank.parasoft.com/parabank/index.htm sitesine gidin

        Driver.getDriver().get(ConfigReader.getProperty("url"));


        //2- Cookies olarak cikan bar da decline'i  butonunu tiklayin

        //3- Products linkine click yapin
        productttPage.productButon.click();
        //4- Indistries linkinin icinden Industrial Automation a click yapin
        productttPage.industriesButon.click();

        // cookies e decline yapin
        productttPage.cookiesButon.click();

        //Indistries linkinin icinden Industrial Automation a click yapin
        productttPage.industrialAutamationButon.click();

        //5- Industrial Automation tiklandigini test edin
        String expectedIcerik="Industrial Automation Software Solutions";
        String actualIcerik=Driver.getDriver().findElement(By.xpath("//*[text()='Industrial Automation Software Solutions']")).getText();
        //6- Contact Us butonuna tiklayin
        productttPage.contactUsButon.click();
        //7- EMail Kutusuna 'muratyildiz@gmail.com' yazin
        //8- FirstName kutusuna 'Murat' yazin
        //9- Last Name kutusuna 'Yildiz'yazin
        //10- Company kutusuna'Team7' yazin
        //11- Job Tittle 'Tester' yazin
        //12- Phone Number kutusuna '+4915525223636' yazin
        //13- Select Country kutusundan 'Gernany' secin
        //14- Comments ktusuna 'Hallo' yazin

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(productttPage.emailButon)
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
                //.sendKeys("Germany")
               // .sendKeys(Keys.TAB)
                .sendKeys("Hallo").perform();

        //15- Contact Aus tusuna click yapin
        //16- mesajin gonderildigini test edin


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
