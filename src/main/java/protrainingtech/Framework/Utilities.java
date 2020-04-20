package protrainingtech.Framework;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;


public class Utilities {
	
	WebDriver driver;
	@Parameter({"browser,URL"})
	@BeforeTest
	public void browsers(String browser, String URL){
	if(browser.equalsIgnoreCase("chrom")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\snow_\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  

			 driver=new ChromeDriver();
			 driver.get(browser);
			 driver.manage().window().maximize();
	}else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","src/main/java/com/test/WebDrivers/geckodriver.exe");
		driver =new FirefoxDriver();
		driver.get(browser);
		driver.manage().window().maximize();
		
	}else {
	}
}
	public void screenshot() throws IOException {
		Calendar stu=new GregorianCalendar();
		int year=stu.get(Calendar.YEAR);
		int month=stu.get(Calendar.MONTH);
		int day=stu.get(Calendar.DAY_OF_MONTH);
		int hours=stu.get(Calendar.HOUR);
		int mins=stu.get(Calendar.MINUTE);
		int sece=stu.get(Calendar.SECOND);
		int misec=stu.get(Calendar.MILLISECOND);
		//TakesScreenshot ts= (TakesScreenshot)driver;
		//File source = ts.getScreenshotAs(OutputType.FILE);
		
		//after execution, you could see a folder "FailedTestsScreenshots" under screen folder
		File windowsid=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  FileHandler.copy(windowsid, new File("C:\\workspace\\Framework\\Screen\\"+month+"_"+day+"_"+year+"_"+hours+"_"+mins+"_"+sece+"_"+misec+"scren.jpg"));
		  
		  
		
	}
}

