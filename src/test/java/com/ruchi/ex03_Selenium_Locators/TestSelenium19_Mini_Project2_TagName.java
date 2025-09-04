package com.ruchi.ex03_Selenium_Locators;

import com.ruchi.utils.CommomToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium19_Mini_Project2_TagName extends CommomToAll {
    @Owner("Ruchi")
    @Description("Verify error comes with invalid email on signup page.")

    @Test
    public void vwo_free_trail_error_verify(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com" );

        // This is also a valid code, if there is no base class or common to all class then make use of this
        // WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        // a_tag_partial_match.click();

        // If there is a common function in common to all class or base class then write it as shown below
        WebElement a_tag_partial_match = findElementByPartialText(driver, "trial");
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox_policy = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox_policy.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }

}
