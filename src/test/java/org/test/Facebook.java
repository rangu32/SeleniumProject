package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Facebook {
    public WebDriver dr;

    @Test
    public void LaunchFacebook() throws InterruptedException {

        WebDriver dr = new ChromeDriver();
        dr.get("https://www.facebook.com/");


        String title = dr.getTitle();

        System.out.println(title);

        String currentUrl = dr.getCurrentUrl();
        System.out.println(currentUrl);

        WebElement email = dr.findElement(By.id("email"));
        email.sendKeys("raja");
        WebElement pass = dr.findElement(By.id("pass"));
        pass.sendKeys("raja");

        dr.findElement(By.name("login")).click();

        Thread.sleep(5000);

        // WebElement errortxt = dr.findElement(By.xpath("//a[text()='Create a new Facebook account.']"));
        //System.out.println("String text = errortxt.getText()");

        WebElement txterror = dr.findElement(By.xpath("//div[@class='_9kpn']"));
        String text = txterror.getText();
        System.out.println(text);


    }

    @Test
    public void createNewAccount() throws InterruptedException {

        WebDriver dr = new ChromeDriver();
        dr.get("https://www.facebook.com/");

        dr.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        dr.findElement(By.name("firstname")).sendKeys("ranga");
        dr.findElement(By.name("lastname")).sendKeys("rajan");
        Thread.sleep(2000);

        dr.findElement(By.name("reg_email__")).sendKeys("1234567890");
        Thread.sleep(2000);

        dr.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("welcome123");

        WebElement day = dr.findElement(By.xpath("//select[@id='day']"));

        Select sel = new Select(day);
        sel.selectByIndex(10);

        WebElement month = dr.findElement(By.xpath("//select[@id='month']"));
        Select sel1 = new Select(month);
        sel1.selectByVisibleText("Oct");


        WebElement year = dr.findElement(By.xpath("//select[@id='year']"));
        Select sel2 = new Select(year);
        sel2.selectByValue("2010");

        WebElement radioBtn = dr.findElement(By.xpath("(//input[@name='sex'])[2]"));
        boolean enabledStauts = radioBtn.isEnabled();
        System.out.println(enabledStauts);

        radioBtn.click();

        dr.findElement(By.xpath("//button[text()='Sign Up']")).click();





    }


}
