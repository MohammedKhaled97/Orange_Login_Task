import Orange_Login.BaseClass;
import Orange_Login.Helper_Func;
import Orange_Login.Login_Page;
import Orange_Login.MyScreenRecorder;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;



public class Login_Invalid extends BaseClass {

    Login_Page LoginPage = new Login_Page();
    Helper_Func HelpFunc = new Helper_Func();

    @Test(dataProvider = "InValidData",priority = 0 )
    public void Invalid_Login (String Username, String Password) throws Exception {
        //ScreenRecord Start
        MyScreenRecorder.startRecording("LoginInValid");
        Thread.sleep(1000);
        //Login Steps
        LoginPage.LoginSteps(getDriver(),Username,Password);
        Thread.sleep(1000);
        //ScreenRecord Stop
        MyScreenRecorder.stopRecording();
        //**********************************************ScreenShoot***********************************************
        String path = "ScreenShots/Login/InvalidLogin/";
        HelpFunc.screenshoot(path+"Invalidlogin_"+"UserName is "+Username+"_"+"Password is "+Password+"_"+browsersc+" Driver.png");
        Allure.addAttachment("InvalidLogin",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        //******************************************Assertion*****************************************************
        String FailedLogin = LoginPage.FailMassage(getDriver()).getText();
        Assert.assertEquals(getDriver().getCurrentUrl(),LoginPage.LoginPageURL);
        String ActualResult1 = "Invalid credentials";
        Assert.assertTrue(FailedLogin.contains(ActualResult1));
    }

    @Test(priority = 1,dataProvider = "InValidDataE")
    public void Empty_Invalid_Login (String User, String Pass) throws Exception {
        //ScreenRecord Start
        MyScreenRecorder.startRecording("Login_Empty_Credentials");
        Thread.sleep(1000);
        //Login Step***********************************************************************
        LoginPage.LoginSteps(getDriver(),User,Pass);
        Thread.sleep(1000);
        //ScreenRecord Stop
        MyScreenRecorder.stopRecording();
        //ScreenShoot**********************************************************************
        String path = "ScreenShots/Login/InvalidLogin/EmptyLogin/";
        HelpFunc.screenshoot(path+"emptyLogin "+"UserName is "+User+"_"+"Password is "+Pass+"_"+browsersc+" Driver.png");
        Allure.addAttachment("EmptyLogin",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        //Assertion*************************************************************************
         if (!(InValidDataE().length==0))
         {

            Assert.assertEquals(getDriver().getCurrentUrl(),LoginPage.LoginPageURL);
            System.out.println("User is "+ User+"Pass is "+Pass);

        }
    }

    @DataProvider
    public Object[][] InValidData() throws IOException {
        return HelpFunc.readDatavalid(LoginPage.paramsvalid,LoginPage.sheetInvalid);
    }

    @DataProvider
    public Object[][] InValidDataE() throws IOException {
        return HelpFunc.readDatavalid(LoginPage.paramsvalid,LoginPage.sheetInvalid3);
    }





}
