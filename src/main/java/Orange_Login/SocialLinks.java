package Orange_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SocialLinks {

 public  String LinkedInURL3 = "linkedin";
    public String LinkedinURL = "https://www.linkedin.com/company/orangehrm";
    public String LinkedinURL2 = "https://www.linkedin.com/authwall?trk=gf&trkInfo=AQEV0eHlhJKY_QAAAYN-CISYU72g-0HFBnuN-bTd6u0KIMkTN10A6L5EQuYiuQOq0lsAw28vFHIQ-9hStNdz3i1iXnhKJETJgn0Gs-ATuBkEqzavcYpy8w-55B0rgZALqz_Bznw=&original_referer=https://opensource-demo.orangehrmlive.com/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Forangehrm%2Fmycompany%2F";
    public String FacebookURL= "https://www.facebook.com/OrangeHRM/";
    public String TwitterURL ="https://twitter.com/orangehrm?lang=en";
    public String TwitterURL2 ="twitter";

    public String YoutubeURL ="https://www.youtube.com/c/OrangeHRMInc";
    public static WebElement Linkedin(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By linked = By.xpath("//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']//*[name()='svg']");
        WebElement linkedinbttn = driver.findElement(linked);
        return  linkedinbttn;

    }

    public static WebElement Facebook(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By facebook = By.xpath("//a[@href='https://www.facebook.com/OrangeHRM/']//*[name()='svg']");
        WebElement Facbookbtn = driver.findElement(facebook);
        return  Facbookbtn;

    }
    public static WebElement Twitter(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By twitter = By.xpath("//a[@href='https://twitter.com/orangehrm?lang=en']//*[name()='svg']");
        WebElement twitterbtn = driver.findElement(twitter);
        return  twitterbtn;
    }

    public static WebElement Youtupe(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        By youtube = By.xpath("//a[@href='https://www.youtube.com/c/OrangeHRMInc']//*[name()='svg']");
        WebElement youtubebtn = driver.findElement(youtube);
        return  youtubebtn;
    }

}
