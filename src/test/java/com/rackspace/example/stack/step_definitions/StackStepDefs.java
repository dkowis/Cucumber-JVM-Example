package com.rackspace.example.stack.step_definitions;


import com.rackspace.example.stack.RackStack;
import cucumber.annotation.Pending;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static junit.framework.Assert.assertEquals;

@Component
@StepDefAnnotation
public class StackStepDefs {
    
    @Autowired
    private NinjaContext context;
    
    @When("^I pop from the stack$")
    public void I_pop_from_the_stack() {
        Object out = context.getMyStack().pop();
        context.setPopped(out);
    }

    @When("^I push another item into the stack$")
    public void I_push_another_item_into_the_stack() {
        I_push_an_item_into_the_stack();
    }

    @Given("^an empty stack$")
    public void an_empty_stack() {

        context.setMyStack(new RackStack());
    }

    @Then("^I get the same item back$")
    public void I_get_the_same_item_back() {
        assertEquals(context.getPushed(), context.getPopped());
    }

    @Then("^the stack contains one item$")
    public void the_stack_contains_one_item() {
        assertEquals(1, context.getMyStack().size());
    }

    @Then("^the stack contains two items$")
    public void the_stack_contains_two_items() {
        assertEquals(2, context.getMyStack().size());
    }

    @When("^I push an item into the stack$")
    public void I_push_an_item_into_the_stack() {
        context.setPushed(new Object());
        context.getMyStack().push(context.getPushed());
    }

}
