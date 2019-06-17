package stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

//data table with maps: for parameterization testcases

public class DealStepWithMapDefinition 
{
	WebDriver driver;
	@Given("^User is already on Login Page$")
	public void user_is_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
	}
	
	@When("^title of login page is  CRM PRO$")
	public void title_of_login_page_is_CRM_PRO()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
		//Assert.assertEquals();
		
	}
	
	@Given("^enter username and  password$")
	public void enter_username_and_password(DataTable credentials)
	{
		for(Map<String,String> data : credentials.asMaps(String.class, String.class))
		
		{
			driver.findElement(By.name("username")).sendKeys(data.get("username"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
			
			
		}
		
	}
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
		WebElement loginBtn= driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}
	
	@Then("^user is on home page$")
	public void user_is_on_home_page()
	{
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRMPRO", title);
	}
	
	@Then("^user move to new deal page$")
	public void user_move_to_new_deal_page()
	{
		driver.switchTo().frame("mainpanel");
		Actions action= new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")).click();
	}
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable credentials)
	{
		for(Map<String,String> data : credentials.asMaps(String.class, String.class))
		{
			driver.findElement(By.id("title")).sendKeys(data.get("title"));
			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
			driver.findElement(By.id("probability")).sendKeys(data.get("probility"));
			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
			
			WebElement loginBtn= driver.findElement(By.xpath("//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]"));
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", loginBtn);
			
			//move to new deal page
			Actions action= new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/a"))).build().perform();
			driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")).click();
			
		}
		
		
		
	}
	
	@Then("^close browser$")
	public void close_browser()
	{
		driver.quit();
	}


}
