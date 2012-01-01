package com.rackspace.example.stack;


import cucumber.annotation.Pending;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static junit.framework.Assert.assertEquals;

public class StackStepDefs {
    
    private RackStack myStack;
    private Object pushed;
    private Object popped;

    @When("^I pop from the stack$")
    public void I_pop_from_the_stack() {
        Object out = myStack.pop();
        popped = out;
    }

    @When("^I push another item into the stack$")
    @Pending
    public void I_push_another_item_into_the_stack() {
        // Express the Regexp above with the code you wish you had
    }

    @Given("^an empty stack$")
    public void an_empty_stack() {
        myStack = new RackStack();
    }

    @Then("^I get the same item back$")
    public void I_get_the_same_item_back() {
        assertEquals(pushed, popped);
    }

    @Then("^the stack contains one item$")
    public void the_stack_contains_one_item() {
        assertEquals(1, myStack.size());
    }

    @Then("^the stack contains two items$")
    @Pending
    public void the_stack_contains_two_items() {
        // Express the Regexp above with the code you wish you had
    }

    @When("^I push an item into the stack$")
    public void I_push_an_item_into_the_stack() {
        pushed = new Object();
        myStack.push(pushed);
    }

}
