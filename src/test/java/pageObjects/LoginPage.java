package pageObjects;

import org.openqa.selenium.By;
import utilities.ElementActions;

public class LoginPage {
    private static By txtEmail = By.xpath("//input[@id='input-email']");
    private static By txtPass = By.xpath("//input[@id='input-password']");
    private static By btnLogin = By.xpath("//input[@value='Login']");

    public static void enterUsername(String username) {
        ElementActions.enterText(txtEmail, username);
    }

    public static void enterPassword(String password) {
        ElementActions.enterText(txtPass, password);
    }

    public static void clickLogin() {
        ElementActions.clickElement(btnLogin);
    }
}
