package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ProjectSpecificMethod extends Salesforce{
	
	
	@Test
	public void runEntity() throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//span[text()='All Apps']")).click();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow textarea-container']//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforce");
		
		Thread.sleep(3000);
		
		Actions toScroll = new Actions(driver);
		WebElement status= driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value']"));
		driver.executeScript("arguments[0].click();", status);
		
		driver.findElement(By.xpath("//span[@class='slds-truncate' and text()='Active']")).click();
		//driver.findElement(By.xpath("(//span[text()='Active'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand' and text()='Save']")).click();
		boolean alert = driver.findElement(By.xpath("//div[contains(@class,'toastContent')]")).isDisplayed();
		  String alertmsg = driver.findElement(By.xpath("//span[contains(@class,'toastMessage ')]/a/div")).getText();
		  if (alert) {
		   System.out.println("Success confirmation is succesfully displayed! and the legal name is: " + alertmsg);
		  } else {
		   System.out.println("Success confirmation is not displaying");
		  }
	}

}
