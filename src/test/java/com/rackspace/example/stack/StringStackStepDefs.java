package com.rackspace.example.stack;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.java.picocontainer.PicoFactory;
import org.picocontainer.PicoContainer;
import org.picocontainer.annotations.Inject;

public class StringStackStepDefs {

    @Inject
    private NinjaContext context;


    @When("^I push a string into the stack$")
    public void I_push_a_string_into_the_stack() {
        // Express the Regexp above with the code you wish you had
    }

    @When("^I pop a string from the stack$")
    public void I_pop_a_string_from_the_stack() {
        // Express the Regexp above with the code you wish you had
    }

    @Then("^I get the same string I entered$")
    public void I_get_the_same_string_I_entered() {
        // Express the Regexp above with the code you wish you had
    }

}
