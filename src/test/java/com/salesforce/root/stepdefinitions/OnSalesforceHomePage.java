package com.salesforce.root.stepdefinitions;

import com.salesforce.root.actors.SalesforceUsers;
import com.salesforce.root.task.Login;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class OnSalesforceHomePage {

    @Given("^\"([^\"]*)\" is on Home page$")
    public void isOnHomePage(String actorName){
        Actor actor = theActorCalled(SalesforceUsers.getUserBasedOnProfile(actorName));
        actor.wasAbleTo(Login.withCredentials());
    }
}
