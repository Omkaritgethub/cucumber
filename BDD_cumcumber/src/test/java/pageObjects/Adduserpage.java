package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Adduserpage 
{
public WebDriver ldriver;

public Adduserpage(WebDriver rdriver)
{
	ldriver=rdriver;
	PageFactory.initElements(ldriver,this);
	
}
By btnregister =By.xpath("//a[text()='Login or register']");


By btncontinue  =By.xpath("//button[@title='Continue']");

By txtfirstname =By.xpath("//input[@name='firstname']");
By txtlastname = By.xpath("//input[@name='lastname']");
By txtmail = By.xpath("//input[@name='email']");
By txttelephone = By.xpath("//input[@name='telephone']");
By textcompany = By.xpath("//input[@name='company']");
By textaddress1 = By.xpath("//input[@name='address_1']");
By textaddress2 = By.xpath("//input[@name='address_2']");
By tectcity =By.xpath("//input[@name='city']");

By textstate = By.xpath("//select[@name='zone_id']");//select class use

By textpincode = By.xpath("//input[@name='postcode']");
By textcountry = By.xpath("//select[@name='country_id']"); // select class use

By textloginname = By.xpath("//input[@name='loginname']");
By textpwd = By.xpath("//input[@name='password']");
By textconfirm = By.xpath("//input[@name='confirm']");
By buttonrdio1 = By.xpath("//input[@type='radio'])[1]");
By buttonrdio2 = By.xpath("(//input[@type='radio'])[2]");
By buttonpolicy =By.xpath("//input[@id='AccountFrm_agree']");

By buttoncntu = By.xpath("//button[@title='Continue']");

By verifyname = By.xpath("//div[text()='Welcome back abhi']");//using if and else

By btnhome =By.xpath("//a[text()='Home']");
By clkproduct =By.xpath("//div[@class='thumbnail']");

By addcart =By.xpath("//a[@class='cart']");

By btncheckout =By.xpath("//a[@title='Checkout'])[2]");

 //Action Method

public String getpageTitle()
{
	return ldriver.getTitle();
}


public void clickonregister()
{
	ldriver.findElement(btnregister).click();
}

public void clickoncontinue()
{
	ldriver.findElement(btncontinue).click();
}

public void setfirstname(String fname)
{
	ldriver.findElement(txtfirstname).sendKeys(fname);
	
}

public void setlastname(String lname)
{
	ldriver.findElement(txtlastname).sendKeys(lname);
	
}

public void setlEmail(String email)
{
	ldriver.findElement(txtmail).sendKeys(email);
}

public void setTelephone (String tele)
{
	ldriver.findElement(txttelephone).sendKeys(tele);
	
}

public void setcompany (String company)
{
	ldriver.findElement(textcompany).sendKeys(company);
}

public void setaddress1 (String addrs1)
{
	ldriver.findElement(textaddress1).sendKeys(addrs1);
}

public void setaddress2 (String addrs2)
{
	ldriver.findElement(textaddress2).sendKeys(addrs2);

}

public void setcity (String city)
{
	ldriver.findElement(tectcity).sendKeys(city);
}

public void setState (String value)
{
	Select zon =new Select(ldriver.findElement(textstate));
	
	zon.selectByVisibleText(value);
}
	
public void setzone(String pin)
{
	ldriver.findElement(textpincode).sendKeys(pin);
}

public void setcountry (String country)
{
	Select cty = new Select(ldriver.findElement(textcountry));
	cty.selectByVisibleText(country);
}

public void setloginName (String lname)
{
	ldriver.findElement(textloginname).sendKeys(lname);
}

public void setpassword (String Pwd)
{

	ldriver.findElement(textpwd).sendKeys(Pwd);
}

public void setconfirmPwd (String Cpwd)
{

	ldriver.findElement(textconfirm).sendKeys(Cpwd);
}

public void SetSubcuribe (String Rdibutton)
{
	if(Rdibutton.equals("Yes"))
	{
		ldriver.findElement(buttonrdio1).click();
	}
	else  if (Rdibutton.equals("No"))
	{
		
		ldriver.findElement(buttonrdio2).click();
	}
	else
	{
		ldriver.findElement(buttonrdio1).click();
	}
	}
	
	public void setpolicy ()
	{
		
		ldriver.findElement(buttonpolicy).click();
	
	}
	
	public void setcntu()
	{
		ldriver.findElement(buttoncntu).click();
	}
	
	public void verifyname (String username)
	{
		
		boolean name = ldriver.findElement(verifyname).isDisplayed();
		
		Assert.assertTrue("Welcome back pratik", name);
	}
	
	public void clickhomepage()
	{
		ldriver.findElement(btnhome).click();
	}
	
	public void Selectproduct()
	{
		
		ldriver.findElement(clkproduct);
	}
	
	public void setaddcart()
	{
		ldriver.findElement(addcart).click();
	}
	
	public void setcheckout()
	{
		ldriver.findElement(btncheckout).click();
	}
	
	
	
	
	
}

















