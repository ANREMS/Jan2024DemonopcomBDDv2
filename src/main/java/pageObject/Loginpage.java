package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

    private WebDriver driver5;

    public Loginpage(WebDriver driver4) {
        driver5 = driver4;
        PageFactory.initElements(driver5, this);
    }


    @FindBy(linkText = "Log in")
    private WebElement loginlink;

    @FindBy(id = "Email")
    private WebElement email;

    @FindBy(id = "Password")
    private WebElement password;

    @FindBy(id = "RememberMe")
    private WebElement rememberme;

    @FindBy(css = "button.button-1.login-button")
    private WebElement loginbutton;


    public void clickLoginlink() {
        loginlink.click();
    }

    public void enterEmail(String emailid) {
        email.sendKeys(emailid);
    }

    public void enterPassword(String passwordid) {
        password.sendKeys(passwordid);
    }

    public void clickRememberme() {
        rememberme.click();
    }

    public void clickLoginbutton() {
        loginbutton.click();
    }



}
