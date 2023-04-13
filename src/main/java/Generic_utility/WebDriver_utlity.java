package Generic_utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_utlity {

	/**
	 * 
	 * This method will wait for the page load 20 seconds
	 */
	public void implicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * This method will maximize the window
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	 /**
     * This method is used for mouse over actions
     * 
     */
    public void mouseover(WebDriver driver,WebElement element)
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(element).perform();
    	
    }
    
    
    
    /**
     *  This method will switch to frame wrt to index
     */
    public void SwithtoFrame(WebDriver driver,int index)
    {
    	driver.switchTo().frame(index);
    	
    }
    
    
    /**
     *  This method will switch to frame wrt to id
     */
    public void SwithtoFrame(WebDriver driver,String frameid)
    {
    	driver.switchTo().frame(frameid);
    	
    }
    
    /**
     * This method will switch to frame wrt to element
     */
    public void switchtoframe(WebDriver driver,WebElement frameElement)
    {
    	driver.switchTo().frame(frameElement);
    }
    
    
    /**
    * wait for element to visible
    * 
    */
  public void waitforelementtovisible(WebDriver driver,WebElement element)
  {
	   WebDriverWait wait=new WebDriverWait(driver,20);
	   wait.until(ExpectedConditions.visibilityOf(element));
  }

	public void waitforpageload(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	
}
