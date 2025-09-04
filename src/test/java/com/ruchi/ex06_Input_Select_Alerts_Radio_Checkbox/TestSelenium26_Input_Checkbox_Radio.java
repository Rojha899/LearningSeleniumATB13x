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

        WebElement input_first_name = driver.findElement(By.xpath("//input[@name='firstname']"));
        input_first_name.sendKeys("Ruchi");

        WebElement input_gender = driver.findElement(By.xpath("//input[@id=\"sex-1\"]"));
        input_gender.click();

        WebElement input_profession = driver.findElement(By.xpath("//input[@id=\"profession-1\"]"));
        input_profession.click();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        driver.close();

    }
}
