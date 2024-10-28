package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPomPage {

	public ContactsPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private@FindBy(linkText = "Contacts")
	WebElement con_tab;
	private@FindBy(css = "img[title='Create Contact...']")
	WebElement create_con;
	private@FindBy(css = "input[name='lastname']")
	WebElement con_ltnm;
	private@FindBy(css = "input[value='U']")
	WebElement con_radio;
	
	
//	private@FindBy(id = "jscal_trigger_support_start_date")
//	WebElement start_date;
//	private@FindBy(xpath = "(//td[text()='28'])[4]")
//	WebElement startdate;
	private@FindBy(css = "input[name='support_start_date']")
	WebElement start_date;
	
//	private@FindBy(id = "jscal_trigger_support_end_date")
//	WebElement end_date;
//	private@FindBy(xpath = "(//td[text()='29'])[9]")
//	WebElement enddate;
	private@FindBy(css = "input[name='support_end_date']")
	WebElement end_date;
	
	
	private@FindBy(css = "input[class='crmButton small save']")
	WebElement con_save;
	
	public void conTab() {
		con_tab.click();
	}
	public void createCon() {
		create_con.click();
	}
	public void conLastName(String data) {
		con_ltnm.sendKeys(data);
	}
	public void conRadio() {
		con_radio.click();
	}
	public void startDate(String data) {
		start_date.sendKeys(data);
	}
//	public void startDateInput() {
//		startdate.click();
//	}
	public void endDate(String data) {
		end_date.sendKeys(data);
	}
//	public void endDateInput() {
//		enddate.click();
//	}
	public void conSave() {
		con_save.click();
	}
	
	public void contacts(String lastname, String startdate, String enddate) {
		conTab();
		createCon();
		conLastName(lastname);
		conRadio();
		startDate(startdate);
//		startDateInput();
		endDate(enddate);
//		endDateInput();
		conSave();
	}
		
}
