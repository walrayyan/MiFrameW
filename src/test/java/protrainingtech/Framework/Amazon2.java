package protrainingtech.Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Amazon2 {
	WebDriver driver;
  //@Test(dataProvider = "dp")
  public void f() throws InterruptedException {
	  // Go to amazon.com and form home page clicks on the links to verify pages are opning or not 
	  Home_page Home= new Home_page(driver);
      Home.bestlinkclick();
      Thread.sleep(5000);
      Home.customerofclick();
      Thread.sleep(5000);
      Home.newreleasesclick();
      Thread.sleep(5000);
      //Home.searchfieldsendkyes();
	  
	  // Enter the product name in the sreach field and click to search
  }
  @Test(dataProvider = "search_amazon")
  public void search(String product) throws InterruptedException {
  
  Home_page Home= new Home_page(driver);
  Home.searchfieldsendkyes("product");
 // Home.searchfieldsendkyes("computer");
 // Home.searchfieldsendkyes("adaptor");
 // Thread.sleep(5000);
 // Home.searchfieldsendkyes("phons");
  Thread.sleep(5000);
  Home.searchtoclick();
  
  }
  
  // assignment create saparete class for amazon prim and locate the nedded elements then call these elements inoto testng class or senarioes
  
  
  //@Test(priority = 3)
  
  public void Try_prime() throws InterruptedException {//
	  // go to amazo home page then clik to try prime and click to try prime poutton
	  //and enter email and passowrd then click signin
	  
	  Home_page Home=new Home_page(driver);
	  Thread.sleep(5000);
      Try_prime pri=new Try_prime(driver);
	  Thread.sleep(5000);
	  Sign sign=new Sign(driver);
	  Thread.sleep(5000);
	  Home.tryprimeftr();
	  Thread.sleep(5000);
	  pri.tryprimeclick();
	  Thread.sleep(5000);
	  sign.emialfieldinput("subair@gmail.com");
	  Thread.sleep(5000);
	  sign.passwordfiledkey("123456");
	  Thread.sleep(5000);
	  sign.signinclik();
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
 @DataProvider
 public Object[][] dp() {
 return new Object[][] {
 new Object[] { "Computer" },
 new Object[] { "phones" },
 new Object[] {"fans"},
 new Object[] {"clothes"},
 new Object[] {"house"},
 new Object[] {"66666"}
		 }; 

 }
}