package com.tia.cucumber.step_definitions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import com.tia.cucumber.pages.OrderProductPage;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestOrderProduct {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
    private OrderProductPage orderProductPage = new OrderProductPage();

    public TestOrderProduct() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    @When("User go to Website Shop")
    public void user_go_to_website_shop() {
        driver.get(Constants.baseUrl+Constants.pathShop);
        Hooks.delay(Constants.DETIK);
        extentTest.log(LogStatus.PASS, "User go to Website Shop");
     
    }

    @And("User select the product")
    public void user_select_the_product() {
    	orderProductPage.selectProduct();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "ser select the product");
    }
    
    @And("User select the color and size")
    public void user_select_the_color_and_size() {
    	orderProductPage.selectProductDetail();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User select the color and size");
    }
    
    @And ("User add quantity")
    public void user_add_quantity() {
    	orderProductPage.clickAddQuantity();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User add quantity");
    }
    @And ("User click ADD TO CART button")
    public void user_click_ADD_TO_CART_button() {
    	orderProductPage.clickAddToCart();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User click ADD TO CART button");
    }
    @And ("User click VIEW CART button")
    public void user_click_VIEW_CART_button() {
    	orderProductPage.clickViewCart();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User click VIEW CART button");
    }
    @And ("User click PROCCED TO CHECKOUT button")
    public void user_click_PROCCED_TO_CHECKOUT_button() {
    	orderProductPage.clickProccedToCheckout();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User click PROCCED TO CHECKOUT button");
    }
    @And ("User input name")
    public void user_input_name() {
    	orderProductPage.inputName();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User input name");
    }
    @And ("User input address")
    public void user_input_address() {
    	orderProductPage.inputAddress();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User input address");
    }
    @And ("User input contact")
    public void user_input_contact() {
    	orderProductPage.inputContanct();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User input contact");
    	
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
    	js7.executeScript("window.scrollBy(0,-1000)");

    }
    @And ("User click TnC checkbox")
    public void user_click_TnC_checkbox() {
    	orderProductPage.clickcheckTnC();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User click TnC checkbox");
    }
    @And ("User click PLACE ORDER")
    public void user_click_PLACE_ORDER() {
    	orderProductPage.clickplaceOrder();
    	Hooks.delay(Constants.DETIK);
    	extentTest.log(LogStatus.PASS, "User click PLACE ORDER");
    }
    @Then ("The order is succeed")
    public void the_order_is_succeed() {
        Assert.assertEquals(orderProductPage.getTextValidationOrderDone(),Constants.expectedOrderDone);
        extentTest.log(LogStatus.PASS, "The order is succeed");
    }
    
}
