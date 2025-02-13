package week4.day3;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DynamicParameterizations extends LaunchBrowser{
	
	@DataProvider
	public String[][] sendData() {
		
		String [][] data = new String[2][1];
		
		data [0][0] = "Salesforce Automation by Auro";
		data [1][0] = "Salesforce Automation by XYZ";
		
		return data;
		
	}
	
	@Test(dataProvider ="sendData")
	public void runEntity(String entityName) {
		driver.findElement(By.xpath("//button[@class='slds-button slds-context-bar__button slds-icon-waffle_container slds-show']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//span[text()='All Apps']")).click();
		driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		
		driver.findElement(By.xpath("//div[@title='New']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys(entityName);
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
