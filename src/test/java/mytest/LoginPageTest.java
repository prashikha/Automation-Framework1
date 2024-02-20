package mytest;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void LoginPageTitleTest() {

        Assert.assertEquals(driver.getTitle(), "Spiro Tracker");
    }

    @Test
    public void LoginPageLogoTest(){
        Assert.assertEquals(driver.findElement(By.xpath("//img[@class=\'login-image\']")).isDisplayed(), true);
    }






}
