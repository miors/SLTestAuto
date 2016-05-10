package bdd.cucumber;

import bdd.serenity.NavigateToLinkSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

/**
 * Created by mior on 01/04/16.
 */
public class NavigateToLinkStepDefs {
    @Steps
    NavigateToLinkSteps navigateToLinkSteps;

    @Given("I am on the main page")
    public void userNavigatesToTheWebsite(){navigateToLinkSteps.navigatesToTheWebsite();}

    @When("^I navigate to the '(.*)' page$")
    public void userNavigatesToPage(String buttonName){ navigateToLinkSteps.navigatesToPage(buttonName);}

    @Then("^I am able to view title '(.*)'$")
    public void userIsAbleToViewCorrectTitle(String pageTitle){
        navigateToLinkSteps.isAbleToViewCorrectTitle(pageTitle);}

}