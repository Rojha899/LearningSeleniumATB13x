package com.ruchi.ex04_Selenium_XPATH;

import com.ruchi.utils.CommomToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium20_MiniProject extends CommomToAll {

    @Test
    public void test_OHRM_login() {

        //```
        ////input[@name="username"]
        ////input[@placeholder="Username"]
        //```
        //```
        ////input[@placeholder="Password"]
        //```
        //
        //
        //```
        ////button[normalize-space()="Login"]
        //``
        WebElement input_username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement input_password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()=\"Login\"]"));


        input_username.sendKeys("admin");
        input_password.sendKeys("Hacker@4321");
        button.click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement h6 = driver.findElement(By.xpath("//h6[text()=\"PIM\"]"));
        Assert.assertEquals(h6.getText(),"PIM");

        closeBrowser(driver);




    }
}
