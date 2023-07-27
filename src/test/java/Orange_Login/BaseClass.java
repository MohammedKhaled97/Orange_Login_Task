package Orange_Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class BaseClass {
    static ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
    public static WebDriver driver;
    public static String browsersc;
   public static Actions action;

    public static WebDriver getDriver() {
        return drivers.get();
    }


    @BeforeMethod
    @Parameters("browser")
    public void open_browser(String browser) throws InterruptedException {
        //browsersc=browser;
        String x = System.getProperty("browser");
        if(x.equals("Chrome")) {


            //Driver Configuration
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            drivers.set(driver);
            action = new Actions(driver);
            //Navigation Into Link
            getDriver().navigate().to(Login_Page.LoginPageURL);
            //Maximize the window
            getDriver().manage().window().maximize();
            Thread.sleep(1000);
        }
        else if (x.equals("Firefox")) {
            //Driver Configuration
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            drivers.set(driver);
            //Navigation Into Link
            getDriver().navigate().to(Login_Page.LoginPageURL);
            //Maximize the window
            getDriver().manage().window().maximize();
            Thread.sleep(1000);
        }
    }
    @AfterMethod
    public void aftertest() throws InterruptedException {
        //Quit Driver will close all tabs
        getDriver().quit();

    }



}
