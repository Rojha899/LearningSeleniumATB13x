package com.ruchi.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class TestSelenium03 {
    public void test_Seleniium01(){
        // Start and Stop itself
        //If it was a selenium 3, then we have to do this

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://google.com");

        //System.getProperty("webdriver.gecko.driver", "/path/geckdriver");
    }

}
