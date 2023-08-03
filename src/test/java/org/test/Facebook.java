package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
WebDriver dr;
    @Test
    public void LaunchFacebook(){

        WebDriver dr=new ChromeDriver();

        dr.get("www.facebook.com");


    }


}
