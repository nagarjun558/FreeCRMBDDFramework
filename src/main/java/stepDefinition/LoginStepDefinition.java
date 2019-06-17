//package stepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.JavascriptExecutor;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//
//public class LoginStepDefinition
//{
//	WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_login_page()
//	{
//		System.setProperty("webdriver.chrome.driver", "E:\\selenium jars\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://classic.crmpro.com/index.html");
//	}
//	
//	@When("^title of login page is  CRM PRO$")
//	public void title_of_login_page_is_CRM_PRO()
//	{
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.", title);
//		//Assert.assertEquals();
//		
//	}
//	
//	@Then("^enter \"([^\"]*)\" and  \"([^\"]*)\"$")
//	public void enter_username_and_password(String username,String password)
//	{
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button()
//	{
//		WebElement loginBtn= driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input"));
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()
//	{
//		String title=driver.getTitle();
//		System.out.println(title);
//		Assert.assertEquals("CRMPRO", title);
//	}
//	
//	@Then("^user move to new contact page$")
//	public void user_move_to_new_contact_page()
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions action= new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a"))).build().perform();
//		driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")).click();
//	}
//	
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and_and(String firstname, String lastname, String position)
//	{
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		driver.findElement(By.xpath("//*[@id='contactForm']/table/tbody/tr[1]/td/input[2]")).click();
//		
//	}
//	
//	
//	
//	@Then("^close browser$")
//	public void close_browser()
//	{
//		driver.quit();
//	}
//
//}
