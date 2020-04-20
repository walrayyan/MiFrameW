package protrainingtech.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Try_prime {
	
	WebDriver driver;	
	@FindBy(linkText = "Try Prime")
	//(xpath= "(//*[text()='Try Prime'] )[2]")
	WebElement tryprimeinpot;
	
	
	public Try_prime(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void tryprimeclick() {
		tryprimeinpot.click();
	}
	
	

}
