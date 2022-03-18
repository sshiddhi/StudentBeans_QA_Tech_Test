package PaqeObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='_1whzvnz']//span[contains(text(),'Top 20')]")
    WebElement top20;
    @FindBy(id="onetrust-accept-btn-handler")
    WebElement cookie;
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement login;

    public void clicktop20(){top20.click();}
    public void clickcookie(){cookie.click();}
    public void clickloginlink(){login.click();}
}

