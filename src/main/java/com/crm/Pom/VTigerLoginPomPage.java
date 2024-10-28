package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerLoginPomPage {

	public VTigerLoginPomPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	private@FindBy(name = "user_name")
	WebElement username;
	
	private@FindBy(name = "user_password")
	WebElement password;
	
	private@FindBy(id = "submitButton")
	WebElement login_button;
	
	public void userName(String data) {
		username.sendKeys(data);
	}
	public void password(String data) {
		password.sendKeys(data);
	}
	public void loginButton() {
		login_button.click();
	}
	
	public void login(String username, String password) {
		userName(username);
		password(password);
		loginButton();
	}
}
