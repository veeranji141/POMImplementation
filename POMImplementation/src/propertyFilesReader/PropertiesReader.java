package propertyFilesReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	public static String elementLocatorReader(String key ) throws IOException {
		Properties prop = new Properties();
		File f= new File("./Configuration/PropertiesFile.properties");
		FileReader fr = new FileReader(f);
		prop.load(fr);
		return prop.get(key).toString();	
		
		
	}

}
