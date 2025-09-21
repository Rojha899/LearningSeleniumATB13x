package com.ruchi.ex10_Actions_Class;


import com.ruchi.ex07_WaitHelper.WaitHelpers;
import com.ruchi.utils.CommomToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Lab34_ActionClass_MakeMyTRIP_Example extends CommomToAll {

    @Test
    public void test_action_p4(){
        WebDriver driver = new ChromeDriver();
        String URl = "https://www.makemytrip.com/";
        driver.get(URl);
        driver.manage().window().maximize();

        //        // We need to for the modal and close it
//        WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
//

        new WaitHelpers().waitJVM(5000);

        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();

        new WaitHelpers().waitJVM(3000);

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));


        try {
            for (WebElement e : list_auto_complete) {

                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }


            }
        } catch (Exception e) {
            System.out.println("oK");
        }
    }

}
