package PaqeObj;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends  HomePage {

    WebDriver driver;
    public SearchPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"home_root\"]/div[1]/nav/div[1]/div[2]/div[2]/div/div/div[2]/input")
    WebElement searchbar;
    @FindBy(xpath = "//*[@id=\"home_root\"]/div[1]/nav/div[1]/div[1]/div[2]/div/div/div/div[1]/div[1]/input")
    WebElement seachdata;

    public void clicksearchbar(){searchbar.click();}
    public void searchbardata(){seachdata.sendKeys("Samsung");}


}
