package proje;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import proje2.ParabankPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResuableMethods;

public class murat {
   ParabankPage parabankPage=new ParabankPage();
   private ResuableMethods resuableMethods;

   @Test
   public void servicesMethod() {




      //1 - https://parabank.parasoft.com/parabank/index.htm sitesine gidin
      Driver.getDriver().get(ConfigReader.getProperty("url"));

      //2 -register butonuna basin
      parabankPage.registerButon.click();
      //3 - registern doldurma
      Actions actions=new Actions(Driver.getDriver());
      actions.sendKeys(parabankPage.firstNameButon).
              sendKeys("Murat").
              sendKeys(Keys.TAB).
              sendKeys("Kaan").
              sendKeys(Keys.TAB).
              sendKeys("Bismarcstr. 5").
              sendKeys(Keys.TAB)
              .sendKeys("Stutgart")
              .sendKeys(Keys.TAB)
              .sendKeys("Germany")
              .sendKeys(Keys.TAB)
              .sendKeys("12345")
              .sendKeys(Keys.TAB)
              .sendKeys("0123456789")
              .sendKeys(Keys.TAB)
              .sendKeys("123")
              .sendKeys(Keys.TAB)
              .sendKeys("Murat07")
              .sendKeys(Keys.TAB)
              .sendKeys("123456")
              .sendKeys(Keys.TAB)
              .sendKeys("123456")
              .sendKeys(Keys.END).perform();
      parabankPage.registerOnay.click();

      //4 - Transfer Funds click yapin
      parabankPage.transferFundsButon.click();
      //5 - Amaount kutusuna 1000 $ yazin ve transfer butununa tiklayin
      actions.sendKeys(parabankPage.amaountButonu).sendKeys("1000").perform();
      parabankPage.transferButonu.click();
      //6 - paranin tarnsfer edilduguni dogrulayin
      String expectedIcerik="Transfer Complete!";
      String actualIcerik=Driver.getDriver().findElement(By.xpath("//h1[@class='title']")).getText();
      Assert.assertTrue(actualIcerik.contains(expectedIcerik));
      //7 -Request Loana click yapin
      //8 -Loan amount kutusuna 500 $ yazin
      //9 - Down Payment kutusuna 250 $ yazin
      //10 - From account kutusundan 14121 secin
      //11 - Apply now butonuna click yapin
      //12 - islemin gerceklestigini test edin
      //13- logout butonundan cikis yapin






    /*
    Actions actions= new Actions(driver);
        actions.click(aramaKutusu)
                .keyDown(Keys.SHIFT)
                .sendKeys("s")
                .keyUp(Keys.SHIFT)
                .sendKeys("amsung ")
                .keyDown(Keys.SHIFT)
                .sendKeys("a")
                .keyUp(Keys.SHIFT)
                .sendKeys("71")
                .sendKeys(Keys.ENTER)
                .perform();
     */
   }


}
