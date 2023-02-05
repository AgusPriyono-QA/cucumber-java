package com.tia.cucumber.order;

import org.openqa.selenium.WebDriver;
import com.tia.cucumber.pages.Order;
import com.tia.cucumber.tugas.Hooks;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TestOrder {
	private static WebDriver driver;
    private Order itempage = new Order();

    public TestOrder() {
        driver = Hooks.driver;
    }
    
 // Test Case One
    @When("User go to Web shop")
    public void user_go_to_Web_shop() {
        driver.get(Constants.URLSHOP);
    }

  
}
