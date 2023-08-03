package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;


public class BrowserLaunch {


    public WebDriver driver;

    @BeforeTest
    public void testBrowser() {
        driver = new ChromeDriver();


    }

    @Test(priority = 1)
    public void launchurl() {

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }

    @Test(priority = 2)
    public void searchanygoogle() throws InterruptedException {


        driver.findElement(By.id("APjFqb")).sendKeys("celebratix");
        Thread.sleep(3000);

    }


    @AfterTest
    public void tearDown() {
        driver.quit();

    }


}
