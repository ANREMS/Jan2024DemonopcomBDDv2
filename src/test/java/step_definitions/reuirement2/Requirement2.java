package step_definitions.reuirement2;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Requirement2 {

    @When("I navigated to the requirement2 page")
    public void navigateToRequirement2() {
        System.out.println("Navigate to requirement2 page is executed");

    }
    @Then("I should see the requirement2 features")
    public void userShouldSeeRequirement2page() {
        System.out.println("I have navigated and able to see the requirement2 features");

    }


}
