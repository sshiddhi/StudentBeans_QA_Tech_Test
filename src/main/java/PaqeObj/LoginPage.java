package PaqeObj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Top20Page{

    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    WebElement email;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(xpath = "//span[contains(text(),'Log in')]")
    WebElement loginbutton;
    @FindBy(id= "recaptcha-anchor")
    WebElement robot;

    public void login_email(String mail){email.sendKeys(mail);} // we can pass the data from here as well instead of scenario outline
    public void login_pswd(String pswd){password.sendKeys(pswd);}// we can pass the data from here as well instead of scenario outline
    public void clickloginbutton(){loginbutton.click();}
    public void clickrobot(){
        driver.switchTo().frame(0);
        robot.click();
    driver.switchTo().defaultContent();}
    }

