package com.ruchi.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class TestSelenium09_Assertion_TestNG {

    @Description("Verify the title is visible!")
    @Test
    public void tes_selenium_assertion(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //We can use TestNG Assertion
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com");

        // Also, We can also use Assertj - for this we have to import assertion
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");
        driver.quit();
    }
}
