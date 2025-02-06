package com.base;

import org.openqa.selenium.WebDriver;

public class BaseClass {

    protected static ThreadLocal<WebDriver> driver= new ThreadLocal<>();
    protected static ThreadLocal<Integer> retryCount = ThreadLocal.withInitial(() -> 0);


    public  WebDriver getDriver() {
        return driver.get();
    }
}
