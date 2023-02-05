package com.tia.cucumber.tugas;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.tia.cucumber.pages.LoginTask;
import com.tia.cucumber.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

	private static WebDriver driver;
    private LoginTask loginPage = new LoginTask();

    public TestLogin() {
        driver = Hooks.driver;
    }
    
    // Test Case One
    @When("User go to Web demoqa")
    public void user_go_to_Web_demoqa() {
        driver.get(Constants.URL);
    }

    @And("User enter username password")
    public void user_enter_username_password() {
        loginPage.login("agus_05","12345678Admi@Dmin");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
    }

    @Then("User valid credentials")
    public void user_invalid_credentials() {
       Assert.assertEquals(loginPage.getTxtDashboard(), "MY ACCOUNT");
      //  Assert.assertTrue(loginPage.getTxtDashboard().contains("MY ACCOUNT"));
    }
    
}
