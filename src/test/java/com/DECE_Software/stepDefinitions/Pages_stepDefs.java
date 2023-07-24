package com.DECE_Software.stepDefinitions;

import com.DECE_Software.pages.BasePage;
import com.DECE_Software.utilities.ConfigurationReader;
import com.DECE_Software.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Pages_stepDefs {


    BasePage basePage=new BasePage();

    @Given("The user go to homepage succesfully")
    public void the_user_go_to_homepage_succesfully() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @Then("The user should be able to see sloganbar phrase {string}")
    public void the_user_should_be_able_to_see_sloganbar_phrase(String expectedText) {
        basePage.sloganCheck_mtd(expectedText);
    }
    @When("The user click {string} button")
    public void the_user_click_button(String button) {
        basePage.clickOnButton_mtd(button);

    }
}
