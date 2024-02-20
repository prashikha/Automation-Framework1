package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

    protected WebDriver driver;

    @Parameters({"browsers"})
    @BeforeTest
    public void setup(String browserName){

        switch(browserName){

            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("plz pass the right browser....");
                break;

        }


        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://34.196.25.45:3000/");




    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
