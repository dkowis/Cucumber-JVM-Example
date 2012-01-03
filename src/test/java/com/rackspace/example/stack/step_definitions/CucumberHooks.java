package com.rackspace.example.stack.step_definitions;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.runtime.ScenarioResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CucumberHooks {

    @Autowired
    private NinjaContext context;

    @After
    public void after(ScenarioResult scenarioResult) {
        System.out.println("This is run after our scenario is completed!");
        System.out.println("Our last scenario result was: " + scenarioResult.getStatus());
        if (scenarioResult.isFailed()) {
            System.out.println("Our scenario failed, I could fail fast now or something, or log, or whatever!");
        } else {
            System.out.println("everything passed, nothing to see here");
        }
    }

    @Before
    public void before() {
        System.out.println("here I'm running before the scenario starts!");
    }
}
