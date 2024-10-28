package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VTigerSignoutPomPage {

	public VTigerSignoutPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private@FindBy(css = "img[style='padding: 0px;padding-left:5px']")
	WebElement admin_img;
	
	private@FindBy(linkText = "Sign Out")
	WebElement signout_button;
	
	public void administrator() {
		admin_img.click();
	}
	public void signoutButton() {
		signout_button.click();
	}
	
	public void signOut() {
		administrator();
		signoutButton();
	}
}
