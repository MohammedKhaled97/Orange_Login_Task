import Orange_Login.BaseClass;
import Orange_Login.Helper_Func;
import Orange_Login.MyScreenRecorder;
import Orange_Login.SocialLinks;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SocialAccounts extends BaseClass {

    SocialLinks socialLink = new SocialLinks();
    Helper_Func HelpFunc = new Helper_Func();


   // List<String> list = new ArrayList<String>();

    @Test
    public void Navigate2Socail() throws Exception {
        //ScreenRecord Start
        MyScreenRecorder.startRecording("SocialAccounts");

        Thread.sleep(2000);
        //Click on all Links
        socialLink.Linkedin(getDriver()).click();
        socialLink.Facebook(getDriver()).click();
        socialLink.Twitter(getDriver()).click();
        socialLink.Youtupe(getDriver()).click();

        Thread.sleep(4000);
        //Switch Between Links
        String parentID = getDriver().getWindowHandle();
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        if(parentID.equals(tabs.get(0))) {
            getDriver().switchTo().window(tabs.get(1));
            //Youtube
            Thread.sleep(5000);
            //ScreenShoot
            String path = "ScreenShots/SocailMedia/Youtube"+"_"+browsersc+" Driver.png";
            HelpFunc.screenshoot(path);
            Allure.addAttachment("Youtube",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
            //Assertion
            Assert.assertTrue(getDriver().getCurrentUrl().contains(socialLink.YoutubeURL),"Youtube Assertion");
            getDriver().close();
            //*************************************************
            //Twitter
            getDriver().switchTo().window(tabs.get(2));
            Thread.sleep(4000);
            //ScreenShoot
            String path2 = "ScreenShots/SocailMedia/Twitter"+"_"+browsersc+" Driver.png";
            HelpFunc.screenshoot(path2);
            Allure.addAttachment("Twitter",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
            //Assertion
            Assert.assertTrue(getDriver().getCurrentUrl().contains(socialLink.TwitterURL),"Twitter Assertion");
            getDriver().close();
            //*************************************************
            //Facebook
            getDriver().switchTo().window(tabs.get(3));
            Thread.sleep(4000);
            //ScreenShoot
            String path3 = "ScreenShots/SocailMedia/Facebook"+"_"+browsersc+" Driver.png";
            HelpFunc.screenshoot(path3);
            Allure.addAttachment("Facebook",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
            //Assertion
            Assert.assertTrue(getDriver().getCurrentUrl().contains(socialLink.FacebookURL),"Facebook Assertion");
            getDriver().close();
            //*************************************************
            //Linkedin
            getDriver().switchTo().window(tabs.get(4));
            Thread.sleep(4000);
            //***************************************************
            String path4 = "ScreenShots/SocailMedia/Linkedin"+"_"+browsersc+" Driver.png";
            HelpFunc.screenshoot(path4);
            Allure.addAttachment("Linkedin",new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
            //Assertion
            Assert.assertTrue(getDriver().getCurrentUrl().contains(socialLink.LinkedInURL3),"Linkedin Assertion");
            getDriver().close();
            Thread.sleep(2000);
            //ScreenRecord Stop
            MyScreenRecorder.stopRecording();
        }

    }



}
