package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.PropertiesFile;
import com.crm.Pom.VTigerLoginPomPage;
import com.crm.Pom.VTigerSignoutPomPage;

public class VTigerBaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void precondition() throws IOException {
		String browser = PropertiesFile.property("browser");
		String url = PropertiesFile.property("url");
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String username = PropertiesFile.property("username");
		String password = PropertiesFile.property("password");
		VTigerLoginPomPage obj = new VTigerLoginPomPage(driver);
		obj.login(username, password);
	}
	
	@AfterMethod
	public void signout() {
		VTigerSignoutPomPage obj = new VTigerSignoutPomPage(driver);
		obj.signOut();
	}
	
	@AfterClass
	public void postcondition() {
		driver.quit();
	}
}
