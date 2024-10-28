package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationsPomPage {

	public OrganizationsPomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	private@FindBy(linkText = "Organizations")
	WebElement org_tab;
	private@FindBy(css = "img[title='Create Organization...']")
	WebElement create_org;
	private@FindBy(css = "input[name='accountname']")
	WebElement org_name;
	private@FindBy(css = "input[value='U']")
	WebElement org_radio;
	private@FindBy(css = "input[class='crmbutton small save']")
	WebElement org_save;
	private@FindBy(css = "select[name='industry']")
	WebElement ind_dpdn;
	private@FindBy(css = "option[value='Engineering']")
	WebElement dpdn_option;
	
	
	public void orgTab() {
		org_tab.click();
	}
	public void createOrg() {
		create_org.click();
	}
	public void orgName(String data) {
		org_name.sendKeys(data);
	}
	public void orgRadio() {
		org_radio.click();
	}
	public void orgSave() {
		org_save.click();
	}
	public void indDpdn() {
		ind_dpdn.click();
	}
	public void dpdnOption() {
		dpdn_option.click();
	}
	
	
	public void organization(String orgname) {
		orgTab();
		createOrg();
		orgName(orgname);
		orgRadio();
		orgSave();
	}
	
	public void organization1(String orgname) {
		orgTab();
		createOrg();
		orgName(orgname);
		orgRadio();
		indDpdn();
		dpdnOption();
		orgSave();
	}
	
}
