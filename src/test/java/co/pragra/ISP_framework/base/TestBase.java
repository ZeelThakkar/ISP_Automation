package co.pragra.ISP_framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    //   Reading the values from the properties file..
    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C://Users//Nishant//IdeaProjects//ISP_Database//src//test//java" +
                    "//co//pragra//ISP_framework//config//Config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    Initializing the browser(chrome or firefox)..
    public static void initialization() {

        String browserName = prop.getProperty("browser");

        if(browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver",prop.getProperty("chrome.location"));
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",prop.getProperty("firefox.location"));
            driver = new FirefoxDriver();
        }

        //     Managing the features of driver..
        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        //     Fetching the application url from the properties file..
        driver.get(prop.getProperty("url"));

    }

}
