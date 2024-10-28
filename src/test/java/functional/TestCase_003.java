package functional;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.FileUtility.PropertiesFile;
import com.crm.Pom.VTigerLoginPomPage;

public class TestCase_003 {

	@Test
	public void testCase3() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String url = PropertiesFile.property("url");
		String password = PropertiesFile.property("password");
		driver.get(url);
		VTigerLoginPomPage obj = new VTigerLoginPomPage(driver);
		obj.password(password);
		obj.loginButton();
		driver.quit();
	}
}
