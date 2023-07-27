package Orange_Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Forget {
    public static String ForgetpassURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
    public static WebElement forgotpass(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By forget = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
        WebElement forgetpassw = driver.findElement(forget);
        return  forgetpassw;
    }

    public  static  WebElement Cancelbutton(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By cancel = By.xpath("//button[normalize-space()='Cancel']");
        WebElement cancelele= driver.findElement(cancel);
        return cancelele;
    }

    public  static WebElement ResetSection(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By Reset = By.xpath("//button[normalize-space()='Cancel']");
        WebElement ResetPass = driver.findElement(Reset);
        return  ResetPass;

    }


}
