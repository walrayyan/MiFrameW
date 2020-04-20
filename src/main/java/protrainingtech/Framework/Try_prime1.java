package protrainingtech.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Try_prime1 {
	WebDriver driver;	
	
	@FindBy(id = "prime-header-CTA-announce")
	WebElement tryprime1inpot;

	public Try_prime1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	public void Try_prime1click() {
		tryprime1inpot.click();
	}
	public void primitiveclick() {
		primitiveclick();
		// TODO Auto-generated method stub
		
	}
}
