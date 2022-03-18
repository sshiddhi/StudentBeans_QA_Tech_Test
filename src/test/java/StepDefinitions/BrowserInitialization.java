package StepDefinitions;

import PaqeObj.HomePage;
import PaqeObj.LoginPage;
import PaqeObj.SearchPage;
import PaqeObj.Top20Page;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BrowserInitialization {

    public static WebDriver driver;
    public static HomePage home;
    public static SearchPage search;
    public static Top20Page top;
    public static LoginPage login;


    public void BrowserInitialization() throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream("src\\test\\java\\Resources\\config.properties");
        prop.load(input);
        String browser = prop.getProperty("Browser");


        switch (browser) {
            case "Chrome":

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "Edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case "Firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }

        driver.get(prop.getProperty("URL"));
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);
        Assert.assertEquals(pagetitle,"Free Student Discounts | Valid 2022 Codes | Student Beans");
        home = new HomePage(driver);
        search = new SearchPage(driver);
        top = new Top20Page(driver);
        login = new LoginPage(driver);
        driver.manage().window().maximize();

    }

}
