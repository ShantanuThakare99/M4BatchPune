package functional;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.crm.BaseClass.VTigerBaseClass;
import com.crm.FileUtility.ExcelFile;
import com.crm.JavaUtility.RandomNumber;
import com.crm.Pom.OrganizationsPomPage;

public class TC_2 extends VTigerBaseClass{

	@Test
	public void test2() throws EncryptedDocumentException, IOException, InterruptedException {
		OrganizationsPomPage obj = new OrganizationsPomPage(driver);
		String orgname = ExcelFile.excel("Organization", 0, 1);
		RandomNumber obj1 = new RandomNumber();
		int num = obj1.randomNumber();
		obj.organization1(orgname+num);
		Thread.sleep(1000);
	}
}
