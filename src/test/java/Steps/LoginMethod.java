package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import Utils.BaseClass;
import GlobalFunction.ActionClass;

public class LoginMethod extends BaseClass{

    @FindBy(xpath = "//input[@id=\"email\"]")
    public static WebElement username;

    @FindBy(xpath = "//input[@id=\"pass\"]")
    public static WebElement password;

    @FindBy(xpath = "//button[@name=\"login\"]")
    public static WebElement loginButton;

    public void User_logs_in_to_facebook_with_the_username() throws Exception{

        ActionClass.openUrl(getProperties().getProperty("facebookUrl"));
        ActionClass.sendKeys(username, "skhumba.nku@", "Username Field");
        ActionClass.sendKeys(password, "skjshhhs", "Password");

        ActionClass.clickElement(loginButton, "button field");
    }




}
