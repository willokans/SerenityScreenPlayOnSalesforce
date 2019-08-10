package com.salesforce.root.task;

import com.salesforce.root.abilities.Authenticate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.core.SkipNested;

import javax.sql.RowSet;

import static com.salesforce.root.pageObject.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {


    public static Login withCredentials() {
        return instrumented(Login.class);
    }

    @Override
    @Step("{0} Logs into Salesfroce")
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Open.browserOn().thePageNamed("home.page"),
                Enter.theValue(authenticated(user).getUsername()).into(USERNAME_FIELD),
                Enter.theValue(authenticated(user).getPassword()).into(PASSWORD_FIELD),
                Click.on(LOGIN_BUTTON)
        );

    }

    private Authenticate authenticated(Actor actor) {
        return Authenticate.as(actor);
    }
}
