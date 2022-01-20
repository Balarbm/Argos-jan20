package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	 
	public static WebDriver browserConfig(String url) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get(url);
	    driver.manage().window().maximize();
	    return driver;
	}

	public static void  SendKeys(WebElement element,String data) {
		element.sendKeys(data);
		
		}
	    public  static void click(WebElement element) {
	         element.click();
		}
	    public static void closeBrowser() {
			driver.close();
	    }
			 public static void select(WebElement element,int data1) {
					Select s=new Select(element);
					s.selectByIndex(data1);

	    

	}
	

}
