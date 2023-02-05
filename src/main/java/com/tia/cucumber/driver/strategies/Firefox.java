package com.tia.cucumber.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {

	public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "D:\\TIA\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
	
}
