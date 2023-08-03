package org.test;

import org.testng.annotations.Test;

public class Sample {

    @Test
    public void logintest(){
        System.out.println("login sucess");
    }

    @Test
    public void loginFailed(){
        System.out.println("login failed");
    }

}
