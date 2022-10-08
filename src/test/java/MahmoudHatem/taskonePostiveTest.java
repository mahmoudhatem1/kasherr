package MahmoudHatem;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.base;
import pageObjects.taskOne;
import org.openqa.*;

public class taskonePostiveTest extends base {
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		// driver.get(base.actualurl);

	}
	@Test(dataProvider="getData")
	public void testTaskOnePostive (String x,String y) throws InterruptedException {
		
		 driver.get(base.actualurl);
	
		taskOne tPostive=new taskOne(driver);
		tPostive.setName("mahmoud");
		tPostive.setStoreName("wassal");
		tPostive.clickCheckRegisteredBusiness();
		tPostive.setPhoneNumber("01111405127");
		tPostive.setEmail("mahmoudhatem811@gmail.com");
		tPostive.setPassword(x,y);
		tPostive.setSignUpButton();
		
		
	
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="Mahmoud@1";
		data[0][1]="Mahmoud@1";
		data[1][0]="Mahmoud@1";
		data[1][1]="Mahmoud@";
		data[2][0]="Mahmoud@1";
		data[2][1]="Mahmoud@";
		
		
		
		return data;
		
	}
	
	
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	
		
	}
}
