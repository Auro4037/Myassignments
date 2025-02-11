package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import week2.day3.Webelement;

public class ActionAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		   String productprice= driver.findElement(By.xpath("(//span[@class='a-price'])[1]")).getText();
		   System.out.println(" The price of 1st product is : " +productprice);
		   
		   String totalcustomerratings= driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style'])[1]")).getText();
		   System.out.println(" The total customer ratings are : " +totalcustomerratings);
		   
		   driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")).click();
		   
		   Set<String> windowHandles = driver.getWindowHandles();
		   List<String> allwindow = new ArrayList<String>(windowHandles);
		   
		   driver.switchTo().window(allwindow.get(1));
		   
		   
		   //screenshot
		   Thread.sleep(10000);
		   File source = driver.getScreenshotAs(OutputType.FILE);
		   File destination= new File("./screenhsot/amazonproduct.png");
			
			FileUtils.copyFile(source, destination);
		   
			
			WebElement Addtocart = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));
			Addtocart.click();
			
			String cartValue=driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")).getText();
			System.out.println(" The total cart value is : " +cartValue);
			
			if(cartValue.contains(productprice)) {
				System.out.println(" Right product has been selected for checkout");
				driver.close();
			}
			
			driver.switchTo().window(allwindow.get(0));
			driver.close();
	}
	

}
