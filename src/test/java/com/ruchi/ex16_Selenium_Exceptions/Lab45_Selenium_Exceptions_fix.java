package com.ruchi.ex16_Selenium_Exceptions;

import com.ruchi.utils.CommomToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exceptions_fix extends CommomToAll {

    @Test
    public void test_selenium_exception(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");

        try {
            driver.findElement(By.id("pramod"));
        }
        catch(NoSuchElementException e) {
            System.out.println("Element Not Found!!");
        }

        // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#pramod"}
        //  (Session info: chrome=139.0.7258.139)

    }
}
