package protrainingtech.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign {
	WebDriver driver;
	
	@FindBy(id="ap_email")
	WebElement email;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	public Sign(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emialfieldinput(String store) {
		email.sendKeys("store");
	}
	public void passwordfiledkey(String password6) {
		password.sendKeys("password6");
	}
	public void signinclik() {
		signin.click();
		
	}

}
