package protrainingtech.Framework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class plicit {
	  WebDriver driver;
  @Test
  public void f() {
	  // how to add implicit 
	  driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
	  driver.findElement(By.id("nav-search-submit-text22")).click();
	  
	  // how to add explicit and syntex and create the object
	  //WebDriverWait wait =new WebDriverWait(WebDriverRefrence,TimeOut);
	  WebDriverWait usersd =new WebDriverWait(driver ,60L);
	  usersd.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("nav-search-submit-text22"))));
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\snow_\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  

		 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
