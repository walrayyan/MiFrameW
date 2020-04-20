package protrainingtech.Framework;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parameterization extends Utilities{
	//WebDriver driver;
  
  @Parameters({"amazon,amazon6,amazon0"})
  @Test
  public void f(String com,String pho, String amz) throws InterruptedException, IOException  {
	  Home_page Home= new Home_page(driver);
	  Home.searchfieldsendkyes("com");
	  screenshot();
	  Thread.sleep(5000);
	  Home.searchtoclick();
	  Home.searchfieldsendkyes("pho");
	  Thread.sleep(5000);
	  Home.searchtoclick();
	  screenshot();
	  Home.searchfieldsendkyes("city");
	  Thread.sleep(5000);
	  Home.searchtoclick();
	  screenshot();
  }
  @BeforeClass
  public void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\snow_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  String url="http://www.amazon.com";
		 driver=new ChromeDriver();
		 driver.get(url);
		 driver.manage().window().maximize();

}


 @AfterClass
  public void afterClass() {
  }

 }
