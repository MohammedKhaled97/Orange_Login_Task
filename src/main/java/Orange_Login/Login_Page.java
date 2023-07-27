package Orange_Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Login_Page {
    //Login URL
        public static String LoginPageURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    public String paramsvalid = "C:\\Users\\mabdelbaky\\eclipse-workspace\\Orange_Login\\Data\\Login.xlsx";
    public static String SheetValid = "Sheet1";
    public static String sheetInvalid= "Sheet2";
    public static String sheetInvalid3= "Sheet3";



    public static void LoginSteps(WebDriver driver,String UserName, String Password) throws InterruptedException {
        //Clear Username Field is there is default values or old values
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        Thread.sleep(1000);
        UserName(driver).clear();
        //Enter valid UserName
        UserName(driver).sendKeys(UserName);
        //Using Implicit
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //Clear Password Field is there is default values or old values
        Password(driver).clear();
        //Enter valid password
        Password(driver).sendKeys(Password);
        Thread.sleep(1000);
        //Using Implicit
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        SignIn(driver).click();
        Thread.sleep(1000);
    }

    public static WebElement UserName(WebDriver driver)
    {
        By userName = By.name("username");
        WebElement userNameELe = driver.findElement(userName);
        return  userNameELe;

    }
    public static WebElement Password(WebDriver driver)
    {
        By password = By.name("password");
        WebElement passwordEle = driver.findElement(password);
        return  passwordEle;

    }


    public static  WebElement SignIn(WebDriver driver)
    {
        By Signin = By.xpath("//button[normalize-space()='Login']");
        WebElement SigninELE = driver.findElement(Signin);
        return SigninELE;
    }


    public static  WebElement FailMassage(WebDriver driver)
    {
        By Fail = By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
        WebElement failELE = driver.findElement(Fail);
        return failELE;
    }

    public  static  WebElement RequiredPass (WebDriver driver){

        By Required = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/span");
        WebElement RequiredPas = driver.findElement(Required);
        return  RequiredPas;
    }

    public  static  WebElement RequiredUser (WebDriver driver){

        By Required = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/span");
        WebElement Requireduse = driver.findElement(Required);
        return  Requireduse;


    }

    public  static WebElement CredintioalSection (WebDriver driver)
    {
        By Section = By.xpath("//div[@class='oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials']");
        WebElement credintionSection = driver.findElement(Section);
        return  credintionSection;
    }








}
