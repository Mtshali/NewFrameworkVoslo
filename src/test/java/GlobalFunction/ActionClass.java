package GlobalFunction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utils.BaseClass;

public class ActionClass extends BaseClass {

    static BaseClass gbFunctions;

    private static Actions builder;

    public static void openUrl(String url){
        webDriver.get(url);
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.navigate().refresh();
    }

    public static void clickElement(WebElement element, String fieldName) throws Exception{
        try{
            element.clear();
            element.click();
            Thread.sleep(2000);
        }catch (Exception e){
            throw e;
        }
    }

    public static void sendKeys(WebElement element, String inputField, String fieldname) throws Exception{
        try{
            element.clear();
            element.sendKeys(inputField);

        }catch(Exception ex){
            throw ex;
        }
    }
}
