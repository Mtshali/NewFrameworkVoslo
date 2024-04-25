package Utils;

import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;


public class BaseClass {

    public static Properties properties;
    protected static WebDriver webDriver;

    public static Properties getProperties(){

        try{
            properties = new Properties();
            InputStream inputStream = new FileInputStream(System.getProperty("user.dir"));
            properties.load(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
        return properties;
    }

    public static void setDriver(WebDriver driver){webDriver = driver;}

    public static WebDriver getWebDriver(){return webDriver;}

}
