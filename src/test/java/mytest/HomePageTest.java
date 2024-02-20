package mytest;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void UserIsLoggedTest(){

        driver.findElement(By.id("input-email")).sendKeys("prashikha.ravindra@spironet.com");
        driver.findElement(By.id("input-password")).sendKeys("Prashika@1234");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


}
