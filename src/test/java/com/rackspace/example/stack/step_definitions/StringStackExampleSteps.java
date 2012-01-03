package com.rackspace.example.stack.step_definitions;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class StringStackExampleSteps {

    @Then("^my string is \"([^\"]*)\"$")
    public void my_string_is_(String arg1) {
        //Express the Regexp above with the code you wish you had
    }

    @Then("^the stack contains one Item$")
    public void the_stack_contains_one_Item() {
        //Express the Regexp above with the code you wish you had
    }

    @When("^I pop the string from the stack$")
    public void I_pop_the_string_from_the_stack() {
        //Express the Regexp above with the code you wish you had
    }

    @When("^I push a string \"([^\"]*)\" into the stack$")
    public void I_push_a_string_into_the_stack(String arg1) {
        //Express the Regexp above with the code you wish you had
    }

}
