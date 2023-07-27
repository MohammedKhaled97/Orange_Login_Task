import Orange_Login.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Logout extends BaseClass {

    Login_Page LoginPage = new Login_Page();;
    Home_Page HomePage = new Home_Page();
    Helper_Func HelpFunc = new Helper_Func();



    @Test
    public  void logout() throws Exception {
        //ScreenRecord Start
        MyScreenRecorder.startRecording("Logout");
        Thread.sleep(2000);
        //Enter at Drop Down
        HomePage.LogoutDrop(getDriver()).click();
        Thread.sleep(2000);
        //Enter at Logout Text
        HomePage.Logout(getDriver()).click();
        //ScreenShoot End
        Thread.sleep(2000);
        MyScreenRecorder.stopRecording();
        //ScreenShoot
        String path = "ScreenShots/Login/Logout"+"_"+browsersc+" Driver.png";
        HelpFunc.screenshoot(path);
        Allure.addAttachment("LogoutScreenShoot",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        //Assertion
        Assert.assertEquals(getDriver().getCurrentUrl(),LoginPage.LoginPageURL);
        Assert.assertTrue(LoginPage.CredintioalSection(getDriver()).isDisplayed());
    }



}
