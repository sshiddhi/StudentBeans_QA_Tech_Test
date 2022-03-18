package PaqeObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Top20Page extends SearchPage {

    WebDriver driver;

    public Top20Page(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"collection_root\"]/div[2]/div[3]/div/div[1]/div/div[6]/article/a[1]")
    WebElement sixth;

    public void clicksixth(){sixth.click();}
}
