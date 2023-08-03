package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
    @Test
    public void LaunchFacebook(){

        WebDriver dr=new ChromeDriver();
        dr.get("https://www.facebook.com/");


        String title = dr.getTitle();

        System.out.println(title);

        String currentUrl = dr.getCurrentUrl();
        System.out.println(currentUrl);

        WebElement email = dr.findElement(By.id("email"));
        email.sendKeys("rangu32");
        WebElement pass = dr.findElement(By.id("pass"));
        pass.sendKeys("ranga");


    }


}
