package org.samlpe;

import java.util.concurrent.TimeUnit;

import org.Base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition extends Baseclass {
	@Given("user is an Agros page")
	public void user_is_an_Agros_page() {
		 browserConfig("http://www.agros.co.uk");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	}

	@When("user mouseover the shop")
	public void user_mouseover_the_shop() {
	   WebElement findElement = driver.findElement(By.xpath("//span[text()='Shop']"));
	   
	   Actions A=new Actions(driver);
	   A.moveToElement(findElement).perform();
	}

	@And("user mouseover Applicanes")
	public void user_mouseover_Applicanes() {
		WebElement findElement2 = driver.findElement(By.xpath("//a[text()='Appliances']"));
		
		 Actions b=new Actions(driver);
		  b.moveToElement(findElement2).perform();
	  
	}

	@And("user click the product of fridges")
	public void user_click_the_product_of_fridges() {
	    driver.findElement(By.xpath("//a[text()='Fridges']")).click();
	}

	@And("userclick this brand an heisen")
	public void userclick_this_brand_an_heisen() {
	   driver.findElement(By.xpath("(//*[@d='M3.53 12.22a.75.75 0 0 0-1.06 1.06l6 6a.75.75 0 0 0 1.06 0L22.28 6.53a.75.75 0 0 0-1.06-1.06L9 17.69l-5.47-5.47z']) [14]")).click();
	}

	@And("User click this reviews")
	public void user_click_this_reviews() {
	   driver.findElement(By.xpath("//a[text()='Hisense RL423N4AC11 Frost Free Tall Fridge - Stainless Steel']")).click();
	   
	   driver.findElement(By.xpath("(//*[text()='Reviews'])[2]")).click();
	}

	@And("user click add to trolley")
	public void user_click_add_to_trolley() {
	   driver.findElement(By.xpath("//*[@data-test='component-att-button']")).click();
	}

	@Then("Error page is displayed")
	public void error_page_is_displayed() {
	    System.out.println("error page is displayed");
	}




}
