package com.rackspace.example.stack;


import cucumber.annotation.Pending;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.picocontainer.annotations.Inject;

import static junit.framework.Assert.assertEquals;

public class StackStepDefs {

    @Inject
    private NinjaContext context;


    @When("^I pop from the stack$")
    public void I_pop_from_the_stack() {
        Object out = context.getRackStack().pop();
        context.setPopped(out);
    }

    @When("^I push another item into the stack$")
    public void I_push_another_item_into_the_stack() {
        I_push_an_item_into_the_stack();
    }

    @Given("^an empty stack$")
    public void an_empty_stack() {
        context.setRackStack(new RackStack());
    }

    @Then("^I get the same item back$")
    public void I_get_the_same_item_back() {
        assertEquals(context.getPushed(), context.getPopped());
    }

    @Then("^the stack contains one item$")
    public void the_stack_contains_one_item() {
        assertEquals(1, context.getRackStack().size());
    }

    @Then("^the stack contains two items$")
    public void the_stack_contains_two_items() {
        assertEquals(2, context.getRackStack().size());
    }

    @When("^I push an item into the stack$")
    public void I_push_an_item_into_the_stack() {
        context.setPushed(new Object());
        context.getRackStack().push(context.getPushed());
    }

}
