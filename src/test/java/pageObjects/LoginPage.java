package pageObjects;
import org.testng.Assert;
import utilities.ElementActions;
public class LoginPage {

    private static String txtEmail="//input[@id='input-email']";
    private static String txtPass="//input[@id='input-password']";
    private static String btnLogin="//input[@value='Login']";
    private static String linkForgottenPassword="//div[@class='form-group']//a[normalize-space()='Forgotten Password']";
    private static String alertLoginError="//div[@class='alert alert-danger alert-dismissible']";
    public static void enterUsername(String username)
    {
        ElementActions.enterText(txtEmail,username);
    }
    public static void enterPassword(String password)
    {
        ElementActions.enterText(txtPass,password);
    }
    public static void clickLogin()
    {
        ElementActions.clickElement(btnLogin);
    }
    public static void clickForgottenPassword()
    {
        ElementActions.clickElement(linkForgottenPassword);
    }
    public static void validateInvalidLogin(String Expected_Error_message)
    {
        String LoginErrorMsg=ElementActions.getText(alertLoginError);
        Assert.assertEquals(Expected_Error_message,LoginErrorMsg);
    }
}
