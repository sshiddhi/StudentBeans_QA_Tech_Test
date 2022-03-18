package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class SearchTest extends  BrowserInitialization{

    @Given("Open the website")
    public void open_the_website() throws IOException, InterruptedException {
        BrowserInitialization();
        Thread.sleep(2000);
        home.clickcookie();

    }

    @When("Input the data in search bar")
    public void inputTheDataInSearchBar() throws InterruptedException {
        search.clicksearchbar();
        search.searchbardata();
        Thread.sleep(2000);
        List<WebElement> objlist = driver.findElements(By.className("_mtchbu"));
        objlist.get(3).click();
        Thread.sleep(2000);
        String pagetitle = driver.getTitle();
        System.out.println(pagetitle);

    }


    @Then("Choose the sixth from the result")
    public void choose_the_sixth_from_the_result() {
       boolean page_text = driver.findElement(By.className("_1glzvfh")).isDisplayed();
        Assert.assertTrue(page_text);
        String pagetxt = driver.findElement(By.className("_1glzvfh")).getText();
        System.out.println(pagetxt);
    }


}

