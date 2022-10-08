package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
public class taskOne {
	public WebDriver driver;
	private String actualUrl;
	public taskOne (WebDriver driver) {
		this.driver=driver;
		
	}
	By name=By.cssSelector("input[name='full_name']");
	By storeName=By.cssSelector("input[name='store_name']");
	By checkRegisteredBusiness= By.cssSelector("span.transform-checkbox-icon");
	By phoneNumber= By.xpath("//input[@placeholder='Enter phone number']");
	By email = By.cssSelector("input[type='email']");
	By createPassword =By.cssSelector("input[placeholder='Create password']");
	By retypePassword =By.cssSelector("input[placeholder='Re-type password']");
	By signUpButton  = By.cssSelector("button#register-submit-btn");
	public WebElement getName() {
		return driver.findElement(name);
	}
	public WebElement getStoreName() {
		return driver.findElement(storeName);
	}
	public WebElement getCheckRegisteredBusiness() {
		return driver.findElement(checkRegisteredBusiness);
	}
	public WebElement getPhoneNumber() {
		return driver.findElement(phoneNumber);
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getCreatePassword() {
		return driver.findElement(createPassword);
	}
	public WebElement getRetypePassword() {
		return driver.findElement(retypePassword);
	}
	public WebElement getSignUpButton() {
		return driver.findElement(signUpButton);
	}
	
	
	public void setName(String n) {
		driver.findElement(name).sendKeys(n);
	}
	public void setStoreName(String sn) {
		driver.findElement(storeName).sendKeys(sn);
	}
	public void clickCheckRegisteredBusiness() {
		driver.findElement(checkRegisteredBusiness).click();
	}
	public void setPhoneNumber(String pn) {
		driver.findElement(phoneNumber).sendKeys(pn);
	}
	public void setEmail(String em) {
		driver.findElement(email).sendKeys(em);
	}
	/*public void setCreatePassword(String pass) {
		driver.findElement(createPassword).sendKeys(pass);
	}
	public void setRetypePassword(String passs) {
		driver.findElement(retypePassword).sendKeys(passs);
	}*/
	public void setSignUpButton() {
		driver.findElement(signUpButton).click();
	}
	public void setPassword(String newPassword,String repeatNewPassword) {
		driver.findElement(createPassword).sendKeys(newPassword);
		driver.findElement(retypePassword).sendKeys(repeatNewPassword);
	}
	}
