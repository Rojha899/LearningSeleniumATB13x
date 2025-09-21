package com.ruchi.ex10_Actions_Class;

import com.ruchi.utils.CommomToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab32_ActionClass_SpiceJet extends CommomToAll {

    @Test
    public void test_action() {
        WebDriver driver = new ChromeDriver();
        String URL = "https://www.spicejet.com/";
        driver.get(URL);
        driver.manage().window().maximize();

        WebElement from_input = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));

        Actions actions = new Actions(driver);

        // move to element
        // click
        // sendkeys -BLR

        WebElement destination = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));


        actions.moveToElement(from_input).click().sendKeys("BLR").build().perform();
        actions.moveToElement(destination).click().sendKeys("DEL").build().perform();

        closeBrowser(driver);


    }
}
