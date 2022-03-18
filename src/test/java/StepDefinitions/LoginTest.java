package StepDefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.io.IOException;

public class LoginTest extends  BrowserInitialization {

    @Given("Open the website and click the login link")
    public void open_the_website_and_click_the_login_link() throws IOException, InterruptedException {
        BrowserInitialization();
        Thread.sleep(2000);
        home.clickcookie();
        home.clickloginlink();
    }

    @When("Enter the {string}{string}provided")
    public void enterTheProvided(String mail, String pswd) {
        login.login_email(mail);
        login.login_pswd(pswd);
    }

    @And("Click login button")
    public void clickLoginButton() {

        try {
            login.clickrobot();
            Thread.sleep(3000);
            login.clickloginbutton();
            Thread.sleep(3000);
        } catch (Exception e) {
            login.clickloginbutton();
        }
    }

    // Please note: Login function can be fully automated with following code if reCAPTCHA doesn't ask you to choose the image which does  happening randomly & also the error page
    // once you put the username & password, it does take you different page which i have tried  in try & catch.
    @Then("Confirm the error message")
    public void confirmTheErrorMessage() {
            try {
                String errortxt = driver.findElement(By.xpath("//*[@class ='css-1n7jhhc']")).getText();
                System.out.println(errortxt);
                String exp = "The password you entered is incorrect. Please try again. ";
                Assert.assertEquals(errortxt, exp);
                //we can also user boolean to confirm the error message is displayed.
            }
            catch (Exception e)
            {
                boolean error_txt = driver.findElement(By.className("css-1vmm3cn")).isDisplayed();
                String errortxt = driver.findElement(By.className("css-1vmm3cn")).getText();
                Assert.assertTrue(error_txt);
                System.out.println(errortxt);
            }
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "image");
        }

    }
}








