package com.rackspace.example.stack.step_definitions;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static junit.framework.Assert.assertEquals;

@Component
public class StringStackExampleSteps {

    @Autowired
    private NinjaContext context;
    
    @Autowired
    private StackStepDefs stackStepDefs;
    
    @Then("^my string is \"([^\"]*)\"$")
    public void my_string_is_(String arg1) {
        assertEquals(arg1, context.getMyString());
    }

    @Then("^the stack contains one Item$")
    public void the_stack_contains_one_Item() {
        //Reusing a step definition from another file
        stackStepDefs.the_stack_contains_one_item();
    }

    @When("^I pop the string from the stack$")
    public void I_pop_the_string_from_the_stack() {

        //Reusing a step def from another file!
        stackStepDefs.I_pop_from_the_stack();
        context.setMyString(context.getPopped().toString());
    }

    @When("^I push a string \"([^\"]*)\" into the stack$")
    public void I_push_a_string_into_the_stack(String arg1) {
        context.getMyStack().push(arg1);
    }

}
