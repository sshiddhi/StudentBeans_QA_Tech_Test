package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class Top20ListTest extends BrowserInitialization{
    @Given("Open the Homepage")
    public void open_the_homepage() throws IOException, InterruptedException {
        BrowserInitialization();
        Thread.sleep(2000);
        home.clickcookie();


    }
    @When("Link the link of Top20")
    public void link_the_link_of_top20() throws InterruptedException {
        top.clicktop20();
        String pagetitle = driver.getTitle();
        Assert.assertEquals(pagetitle,"Student Beans");
        System.out.println(pagetitle);
        Thread.sleep(2000);
    }
    @Then("click the 6from the top")
    public void click_the_6from_the_top() throws InterruptedException {
        top.clicksixth();
        Thread.sleep(2000);
        //String pagetitle = driver.getTitle();
        //System.out.println(pagetitle);
        boolean confirm_pagetxt= driver.findElement(By.xpath("//*[@class = '_1glzvfh']")).isDisplayed();
        Assert.assertTrue(confirm_pagetxt);
        String confirmpagetxt = driver.findElement(By.xpath("//*[@class = '_1glzvfh']")).getText();
        System.out.println(confirmpagetxt);

    }
}
