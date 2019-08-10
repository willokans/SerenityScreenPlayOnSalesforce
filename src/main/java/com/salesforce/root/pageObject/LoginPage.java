package com.salesforce.root.pageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("Username field").located(By.name("username"));
    public static final Target PASSWORD_FIELD = Target.the("Password Field").located(By.name("pw"));
    public static final Target LOGIN_BUTTON = Target.the("Login Button").located(By.name("Login"));
}
