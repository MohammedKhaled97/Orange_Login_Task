package Orange_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

    public static String HomePageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";

    public  static WebElement HomePageLogo(WebDriver driver)
    {
        By Logo= By.xpath("//img[@alt='client brand banner']");
        WebElement HomeLogo =driver.findElement(Logo);
        return HomeLogo;
    }

    public  static WebElement EmpInfo(WebDriver driver)
    {

        By Empinfo = By.xpath("//h5[normalize-space()='Employee Information']");
        WebElement EmpInfoSection = driver.findElement(Empinfo);
        return  EmpInfoSection;
    }


    public  static  WebElement LogoutDrop(WebDriver driver)
    {
        By drop = By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
        WebElement Droplist = driver.findElement(drop);
        return  Droplist;
    }

    public  static WebElement Logout(WebDriver driver)
    {
        By logout = By.xpath("//a[normalize-space()='Logout']");
        WebElement Logoutbutton = driver.findElement(logout);
        return Logoutbutton;

    }

    public  static WebElement LogoutSection(WebDriver driver)
    {
        By logout = By.xpath("//li[@class='oxd-userdropdown']");
        WebElement Logoutdrop = driver.findElement(logout);
        return Logoutdrop;

    }





}
