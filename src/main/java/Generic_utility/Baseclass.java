package Generic_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	public ExcelFile_utility elib=new ExcelFile_utility();
	public WebDriver_utlity wlib=new WebDriver_utlity();
	public JsonFile_Utility jslib=new JsonFile_Utility();
	public static WebDriver driver;
	public static WebDriver staticDriver;
	
	
	@BeforeClass
	public void LaunchBrowser() throws Throwable 
	{
		System.out.print("<--Launch Browser-->");
		String browser = jslib.readdatafromjson("browser");
		jslib.readdatafromjson("url");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			 driver = new ChromeDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser");
			wlib.waitforpageload(driver);
			wlib.maximize(driver);
			driver.get("url");
			staticDriver=driver;
		}
		
		@BeforeMethod
		public void loginapp()
		{
		System.out.println("---logintoapp---");	
		String username = jslib.readdatafromjson("username");
		jslib.readdatafromjson("password");
		
		
		}
		
		
	}



}
