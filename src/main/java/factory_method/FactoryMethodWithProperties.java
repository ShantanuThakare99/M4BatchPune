package factory_method;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FactoryMethodWithProperties {
	
	public static String properties(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("../com.crm.vtigerM4/ConfigureFile/vtigerProperty.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
	}
}
