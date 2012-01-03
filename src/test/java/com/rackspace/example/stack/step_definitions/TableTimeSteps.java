package com.rackspace.example.stack.step_definitions;

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import cucumber.table.DataTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static junit.framework.Assert.assertEquals;

@Component
@StepDefAnnotation
public class TableTimeSteps {

    @Autowired
    private NinjaContext context;

    @Then("^the stack contains \"([^\"]*)\" items$")
    public void the_stack_contains_items(int arg2) {
        assertEquals(arg2, context.getMyStack().size());
    }

    @When("^I push many things into the stack:$")
    public void I_push_many_things_into_the_stack(DataTable table) {

        //This is returning a list of nulls right now!
        //List<String> things = table.asList(String.class);

        for (List<String> rows : table.raw()) {
            for (String entry : rows) {
                context.getMyStack().push(entry);
            }
        }

    }

}
