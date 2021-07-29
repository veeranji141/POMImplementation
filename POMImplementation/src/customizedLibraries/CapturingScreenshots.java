package customizedLibraries;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class CapturingScreenshots {

	static String filename="";
	public static void captureScreenshot(WebDriver driver, String name) throws IOException {
	try {
		Calendar cal= Calendar.getInstance();
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File fs = screenshot.getScreenshotAs(OutputType.FILE);
		filename = "./src/screenshots"+name+cal.getTime().toString().replace(":","").replace(" ", "")+".png";
		File fd = new File(filename);
		FileUtils.copyFile(fs, fd);
	}
	catch(Exception e) {
		System.out.println("*********** Exception Occured**************");
		e.printStackTrace();	
		}
	attachScreenshotToReport();
	}
		public static void attachScreenshotToReport() {
			try {
				System.setProperty("org.uncommons.reportng.escape-otput", "false");
				File f = new File(filename);
				Reporter.log("<a title=\"snapshot\"href=\""+f.getAbsolutePath()+"\">"+
				       "<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"titlr\" "
				       + "src=\"../surefire-reports/html/screenshots/"+filename);
			}
			catch(Exception e) {
				System.out.println("*********** Exception Occured**************");
				e.printStackTrace();
				
				}
		}
		
	}
