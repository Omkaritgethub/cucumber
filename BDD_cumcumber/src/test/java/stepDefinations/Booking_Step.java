package stepDefinations;




import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Adduserpage;

public class Booking_Step extends Baseclass
{
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers/chromedriver.exe" );
		 driver = new ChromeDriver();
	}

	@When("User opens URL")
	public void user_opens_url_https_automationteststore_com() 
	{
		driver.get("https://automationteststore.com/");
		
	}

	@When("User click on Login and register button")
	public void user_click_on_login_and_register_button() throws InterruptedException
	{
		Thread.sleep(3000);
			 adduser.clickonregister();
		 
		
	}

	@When("User click on continue button")
	public void user_click_on_continue_button() 
	{
		
		adduser.clickoncontinue();
	}

	@When("User enter customer personal info")
	public void user_enter_customer_personal_info() 
	{
		adduser.setfirstname("pratik");
		adduser.setlastname("patil");
		adduser.setlEmail("pratikpatil@gmail.com");
		adduser.setTelephone("9783454532");
		adduser.setcompany("xyz");
		adduser.setaddress1("pune");
		adduser.setaddress2("mumbai");
		adduser.setcity("pune");
		adduser.setState("Moray");
		adduser.setzone("430123");
		adduser.setcountry("India");
		adduser.setloginName("pratikpatil");
		adduser.setpassword("prati@23");
		adduser.setconfirmPwd("prati@23");
		adduser.SetSubcuribe("Yes");
		adduser.setpolicy();
		adduser.setcntu();
	}

	@Then("User verify confirmation message\"YOUR ACCOUNT HAS BEEN CREATED!\"")
	public void user_verify_confirmation_message_your_account_has_been_created() 
	{
		adduser =new Adduserpage(driver);
		Assert.assertEquals("YOUR ACCOUNT HAS BEEN CREATED!\\",adduser.getpageTitle());
	}

	@Then("User Verify name and surname on landing page")
	public void user_verify_name_and_surname_on_landing_page() 
	{
	
		adduser.verifyname("Welcome back pratik");
		
		
	}

	@Then("User click on home icon")
	public void user_click_on_home_icon() 
	{
	adduser.clickhomepage();
		
	}

	@Then("User open product")
	public void user_open_product()
	{
	   
		adduser.Selectproduct();
	}

	@Then("User click on add a cart button")
	public void user_click_on_add_a_cart_button() 
	{
		adduser.setaddcart();
	}

	@Then("User click on checkout button")
	public void user_click_on_checkout_button()
	{
	   adduser.setcheckout();
	}
	@Then("User validate all the product details")
	public void user_validate_all_the_product_details(String msg) 
	{
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("all details are correct"));
		
	}
	
}
