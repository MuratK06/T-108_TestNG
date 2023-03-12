package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {

    private Driver(){
        // Singleton Patern konsepti ile Driver class'indan obje olusturmayi engellemek icin bu contructor i olusturduk
    }
    static WebDriver driver;

    public static WebDriver getDriver(){

        if(driver==null) {
            switch (ConfigReader.getProperty("browser")) {


                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome":

                default:
                    System.setProperty("webdriver.http.factory", "jdk-http-client");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();


            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver(){
        if (driver!=null){
            driver.close();
            driver=null;
        }
    }
}
