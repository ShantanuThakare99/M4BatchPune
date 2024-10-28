package functional;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.FileUtility.ExcelFile;
import com.crm.JavaUtility.RandomNumber;
import com.crm.Pom.ContactsPomPage;

public class TC_3 extends VTigerBaseClass{

	@Test
	public void test3() throws EncryptedDocumentException, IOException, InterruptedException {
		ContactsPomPage obj = new ContactsPomPage(driver);
		String lastname = ExcelFile.excel("Contact", 0, 1);
		String startdate = ExcelFile.excel("Contact", 1, 1);
		String enddate = ExcelFile.excel("Contact", 2, 1);
		RandomNumber obj1 = new RandomNumber();
		int num = obj1.randomNumber();
		obj.contacts(lastname+num, startdate, enddate);
		Thread.sleep(1000);
		WebElement actlstartdate = driver.findElement(By.xpath("//input[@name='support_start_date']"));
		WebElement actlenddate = driver.findElement(By.xpath("//input[@name='support_end_date']"));
		String actl_startdate = actlstartdate.getText();
		String actl_enddate = actlenddate.getText();
		if((startdate.equals(actl_startdate))&&(enddate.equals(actl_enddate))) {
			System.out.println("Verification for Support Start Date & End Date Successful");
		}
		else {
			System.out.println("Verification for Support Start Date & End Date Failed");
		}
		
	}
}
