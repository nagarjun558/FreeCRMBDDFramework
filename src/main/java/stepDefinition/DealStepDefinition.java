//package stepDefinition;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class DealStepDefinition 
//
//{
////	WebDriver driver;
////	@Given("^User is already on Login Page$")
////	public void user_is_already_on_login_page()
////	{
////		System.setProperty("webdriver.chrome.driver", "E:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
////		driver = new ChromeDriver();
////		driver.get("https://classic.crmpro.com/index.html");
////	}
////	
////	@When("^title of login page is  CRM PRO$")
////	public void title_of_login_page_is_CRM_PRO()
////	{
////		String title=driver.getTitle();
////		System.out.println(title);
////		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
////		//Assert.assertEquals();
////		
////	}
////	
////	@Given("^enter username and  password$")
////	public void enter_username_and_password(DataTable credentials)
////	{
////		List<List<String>> data=credentials.raw();
////		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
////		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
////		
////	}
////	@Then("^user clicks on login button$")
////	public void user_clicks_on_login_button()
////	{
////		WebElement loginBtn= driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
////		JavascriptExecutor js= (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].click();", loginBtn);
////	}
////	
////	@Then("^user is on home page$")
////	public void user_is_on_home_page()
////	{
////		String title=driver.getTitle();
////		System.out.println(title);
////		Assert.assertEquals("CRMPRO", title);
////	}
////	
////	@Then("^user move to new deal page$")
////	public void user_move_to_new_deal_page()
////	{
////		driver.switchTo().frame("mainpanel");
////		Actions action= new Actions(driver);
////		action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/a"))).build().perform();
////		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[5]/ul/li[1]/a")).click();
////	}
////	
////	@Then("^user enters deal details$")
////	public void user_enters_deal_details(DataTable credentials)
////	{
////		List<List<String>> data= credentials.raw();
////		driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
////		driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
////		driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
////		driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));
////		
////		WebElement loginBtn= driver.findElement(By.xpath("//*[@id='prospectForm']/table/tbody/tr[1]/td/input[1]"));
////		JavascriptExecutor js= (JavascriptExecutor) driver;
////		js.executeScript("arguments[0].click();", loginBtn);
////		
////		//*[@id="prospectForm"]/table/tbody/tr[1]/td/input[1]
////	}
////	
////	@Then("^close browser$")
////	public void close_browser()
////	{
////		driver.quit();
////	}
//
//}
