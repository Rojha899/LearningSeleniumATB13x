package com.ruchi.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import javax.naming.directory.SearchControls;

public class TestSelenium04 {
    @Test
    public void test_Selenium04(){
        // WebDriver Hierarchy
        // SearchContext(I) - has 2 functions --> findElements() and findElement()
        // WebDriver(Interface) (10 - functions) --> RemoteWebDriver (Class) (15 - functions)
        // ChromiumDriver (Class) (25 - functions)
        // EdgeDriver (Class) (45 - functions)

        // SearchContext - Interface - findElements() and findElement() - GGF (Grand - Grand Father)
        // WebDriver - Interface - Some incomplete functions - GF (Grand Father)
        // RemoteWebDriver - Class - It also has some functions - F (Father)
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver

        // SearchContext driver = new EdgeDriver();
        // SearchContext driver1 = new FirefoxDriver();
        // SearchContext driver2 = new InternetExplorerDriver();

       // WebDriver driver = new ChromeDriver();
        //RemoteWebDriver driver1 = new ChromeDriver();
        //ChromeDriver driver2 = new ChromeDriver();

        // Scenarios

        // 1. Do you want to run on Chrome or Edge? (1-2% People use this)
        ChromeDriver driver = new ChromeDriver();


        // 2. Do you want to run on Chrome and then want tpo change to Edge? (96% people use this)
        WebDriver driver1 = new ChromeDriver();
        driver1 = new EdgeDriver(); // This is how you can change from chrome to edge


        // 3. Do you want to run on multiple browsers, aws machine 2% used?
        // RemoteWebDriver driver (With GRID) - Advance (Last 2 Sessions)





    }

}
