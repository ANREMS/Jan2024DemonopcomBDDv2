package step_definitions.login;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObject.Loginpage;
import pageObject.RegistrationPage;
import step_definitions.Hooks;

public class Login {

    private WebDriver driver4 = Hooks.driver1;
    private Loginpage loginpage = new Loginpage(driver4);

//    @When("I click on the login link")
//    public void clickLoginlink() {
//        loginpage.clickLoginlink();
//    }

    @When("User fills the login form with valid data {string} {string}")
    public void userFillsLoginform(String username, String password) {
        loginpage.enterEmail(username);
        loginpage.enterPassword(password);
    }

    @When("I click on the Login button")
    public void clickLoginbutton() {
        loginpage.clickLoginbutton();
    }

    @When("I click on the login linktext")
    public void iClickOnTheLoginLinktext() {
        loginpage.clickLoginlink();
    }
}
