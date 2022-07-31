package steps;

import drivers.AndroidDriverInit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class orderMedicineSteps {
    @Given("^User is on tokopedia homepage$")
    public void userIsOnTokopediaHomepage() {
        AndroidDriverInit.initialize();
    }

    @And("User clicks lihat semua menu")
    public void userClicksLihatSemuaMenu() {
    }

    @And("User selects tokopedia sehat")
    public void userSelectsTokopediaSehat() {
    }

    @And("User selects batuk, flu, demam menu")
    public void userSelectsBatukFluDemamMenu() {
    }

    @And("User selects first product")
    public void userSelectsFirstProduct() {
    }

    @When("User clicks beli button")
    public void userClicksBeliButton() {
    }

    @Then("User is redirected to login page")
    public void userIsRedirectedToLoginPage() {
    }
}
