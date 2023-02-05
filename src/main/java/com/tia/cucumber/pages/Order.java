package com.tia.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.tia.cucumber.drivers.DriverSingleton;

public class Order {
	private WebDriver driver;

    public Order() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    //@FindBy(id = "pa_color")
   // WebElement selectColor;
    
    //Select selectColor = new Select (color);
	//selectColor.selectByIndex(2);
	
    
    //@FindBy(xpath = "//input[@id='password']")
    //WebElement inputPassword;
    
	//@FindBy(name = "login")
	//WebElement btnLogin;
	
	//@FindBy(xpath = "/html/body/div[1]/section/div/div/h1")
	//WebElement txtDashboard;
	
	//public void login(String username, String password) {
	//	inputUsername.sendKeys(username);
	//	inputPassword.sendKeys(password);
	//}
	
	//public void itemColor() {
	//	WebElement color = driver.findElement(By.id("pa_color"));
		
	//	Select selectColor = new Select (color);
		//selectColor.selectByIndex(2);
		
	//}
	
	//public void clickBtnLogin() {
	//	btnLogin.click();
	//}
	
	//public String getTxtDashboard() {
	//	return txtDashboard.getText();
	//}
	
}
