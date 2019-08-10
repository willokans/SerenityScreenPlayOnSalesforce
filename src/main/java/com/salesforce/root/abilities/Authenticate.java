package com.salesforce.root.abilities;

import net.serenitybdd.screenplay.Ability;
import net.serenitybdd.screenplay.Actor;

public class Authenticate implements Ability {

    public static Authenticate with(String username, String password) {
        return new Authenticate(username, password);
    }

    public static Authenticate as(Actor actor){
        if (actor.abilityTo(Authenticate.class) == null) {
            throw new RuntimeException("Actor '"+actor.getName() + "' does not have a ability to authenticate");
        }
        return actor.abilityTo(Authenticate.class);
    }

    private final String username;
    private final String password;

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    private Authenticate(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
