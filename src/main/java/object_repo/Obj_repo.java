package object_repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_utility.ExcelFile_utility;

public class Obj_repo extends ExcelFile_utility {
WebDriver driver;

public Obj_repo(WebDriver driver)


//Initialization

{
	PageFactory.initElements( driver,this);
}


//locating Elements

@FindBy(xpath="//input[@id='search']")
private WebElement searchbar;


/**
 * 
 * Getters
 */

public WebDriver getDriver() {
	return driver;
}


public WebElement getSearchbar() {
	return searchbar;
}


/**
 * Business Logic
 */

public void text(String txt)
{
	searchbar.sendKeys(txt);
}

}
