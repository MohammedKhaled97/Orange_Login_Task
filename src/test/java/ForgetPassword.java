import Orange_Login.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ForgetPassword  extends BaseClass {

    Helper_Func HelpFunc = new Helper_Func();
    Forget forgetpass = new Forget();

    @Test
    public  void Forget_Pass() throws Exception {
        //ScreenRecord Start
        MyScreenRecorder.startRecording("ForgetPassword");
        Thread.sleep(3000);
        forgetpass.forgotpass(getDriver()).click();
        Thread.sleep(2000);
        //ScreenShoot***************************************************************************************************
        String path = "ScreenShots/ForgetPassword/ForgetPassword"+"_"+browsersc+" Driver.png";
        HelpFunc.screenshoot(path);
        Allure.addAttachment("ForgetPass",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        //Assertion*****************************************************************************************************
        Assert.assertEquals(getDriver().getCurrentUrl(),forgetpass.ForgetpassURL);
        Assert.assertTrue(forgetpass.ResetSection(getDriver()).isDisplayed());
        //Cancel Button
        forgetpass.Cancelbutton(getDriver()).click();
        Thread.sleep(2000);
        //ScreenRecord Stop
        MyScreenRecorder.stopRecording();

    }

}
