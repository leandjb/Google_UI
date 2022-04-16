package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^i am Google Search Page$")
    public void iAmGoogleSearchPage() {
        google.navigateToGoogle();
    }

    @When("^i enter search criteria$")
    public void iEnterSearchCriteria() {
        google.enterSearchCriteria("ASUS");
    }

    @And("^click on search button$")
    public void clickOnSearchButton() {
        google.clickGoogleSearch();
    }

    @Then("^the results match with criteria$")
    public void theResultsMatchWithCriteria() {
    }
}
