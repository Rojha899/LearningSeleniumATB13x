package com.ruchi.ex06_Input_Select_Alerts_Radio_Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium26_Input_Checkbox_Radio {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        // Input
        WebElement firstname = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        firstname.sendKeys("Ruchi");

        // Click Radio button
        WebElement input_gender = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
        input_gender.click();

        WebElement radio_button_exp = driver.findElement(By.id("exp-1"));
        radio_button_exp.click();

        // Select/click on checkbox
        WebElement input_profession = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
        input_profession.click();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        //driver.quit();

    }
}
