package com.ruchi.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium13_NOHTTPP {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        //        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.
        driver.quit();

        // This code will not work as we have not provided Https in url. HTTPs is very very important

    }
}
