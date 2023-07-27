import Orange_Login.*;
import io.qameta.allure.Allure;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Login_Valid extends BaseClass {

Login_Page LoginPage = new Login_Page();
Home_Page HomePage = new Home_Page();
Helper_Func HelpFunc = new Helper_Func();




   @Test (dataProvider = "ValidData")
    public void valid_Login (String Username, String Password) throws Exception {
        //ScreenRecord Start
        MyScreenRecorder.startRecording("LoginValid");
        Thread.sleep(2000);
        //LoginSteps
        LoginPage.LoginSteps( getDriver(),Username,Password);
        Thread.sleep(2000);
        // Howver
       // action.moveToElement(HomePage.LogoutDrop(driver)).click().build().perform();
        Thread.sleep(2000);
//************************************************************************************
        //ScreenRecord Stop
        MyScreenRecorder.stopRecording();
        //ScreenShot For Login ************************************************************************************
        String path = "ScreenShots/Login/ValidLogin"+browsersc+" Driver.png";
        HelpFunc.screenshoot(path);
        Allure.addAttachment("LoginScreenShoot",new ByteArrayInputStream(((TakesScreenshot)  getDriver()).getScreenshotAs(OutputType.BYTES)));
        //******************************************Assertion******************************************************
      //  Assert.assertEquals( getDriver().getCurrentUrl(),HomePage.HomePageURL);
       // Assert.assertTrue(HomePage.LogoutSection( getDriver()).isDisplayed(),"Logout Section");
     //   Assert.assertTrue(HomePage.EmpInfo( getDriver()).isDisplayed());

    }

    @DataProvider
    public Object[][] ValidData() throws IOException {
        return HelpFunc.readDatavalid(LoginPage.paramsvalid,LoginPage.SheetValid);
    }

}
