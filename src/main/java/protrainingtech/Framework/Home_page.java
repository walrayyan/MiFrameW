package protrainingtech.Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	WebDriver driver;
	@FindBy(linkText = "Best Sellers") // driver.findelement(by.linktext(""));
	WebElement bestslink;
	@FindBy(linkText="Customer Service")
	WebElement customer;
	@FindBy(linkText="New Releases")
	WebElement newreleases;
	@FindBy(xpath="//*[@class='nav-input']")
	WebElement search;
	@FindBy(id="twotabsearchtextbox")
	WebElement searchfieldproduct;
	@FindBy(xpath ="Try Prime ")
	WebElement tryprimeftr;
	@FindBy(id="Try Prime1")
	WebElement tryprime1;
	
	
	public Home_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void bestlinkclick() {
		bestslink.click();
	}
	public void customerofclick() {
		customer.click();
	}
    public void newreleasesclick() {
    	newreleases.click();
    }
    public void searchtoclick() {
    	search.click();
    }
    public void tryprimeftr() {
    	tryprimeftr.click();
    }
    public void searchfieldsendkyes(String search) {
    //searchfieldproduct.sendKeys("Adaptor");
    	searchfieldproduct.clear();
    	searchfieldproduct.sendKeys("computer");
    	
    }
}
