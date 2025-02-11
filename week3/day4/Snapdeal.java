package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.snapdeal.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
		   Actions actionHover =new Actions(driver);
		   WebElement element = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		   actionHover.moveToElement(element).perform();
		   
		   driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		   String countofsportsShoes= driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		   System.out.println("The total count of sport shoes are :" +countofsportsShoes);
		   
		   driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		   driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		   driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
		   Thread.sleep(3000);
		   
		   List<WebElement> items = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		   List<WebElement> newitems = new ArrayList<WebElement>();
		   newitems.addAll(items);
		   
		   for(int i=0;i<items.size();i++) {
			   if(newitems.get(i).getText().equals(items.get(i).getText())) {
				   continue;
			   }
			   else {
				   System.out.println("This is not in the sorted order");
			   }
		   
		   }
		   System.out.println("The items are in sorted order");
		   driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		   driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		   driver.findElement(By.xpath("//input[@name='toVal']")).clear();
		   driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
		   
		   driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		   Thread.sleep(3000);
		   
		  WebElement color=driver.findElement(By.xpath("//div[@class='sdCheckbox filters-list ']//a[text()=' White & Blue']"));
		  Actions scrollTo= new Actions(driver);
		  scrollTo.scrollToElement(color).moveToElement(color).click().perform();
		  
		  Thread.sleep(3000);
		  Actions actionhover2= new Actions(driver);
		  WebElement trainingshoe = driver.findElement(By.xpath("(//picture[@class='picture-elem'])[1]"));
		 
		  actionhover2.moveToElement(trainingshoe).perform();
		  
		  WebElement quickView=driver.findElement(By.xpath("(//div[@class='clearfix row-disc']//div)[1]"));
		  actionhover2.moveToElement(quickView).click().perform();
		 
		  Thread.sleep(3000);
		   String Shoecost= driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']//span)[1]")).getText();
		   String Discount= driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix']/span)[2]")).getText();
		   System.out.println("The cost of the training shoe is :" +Shoecost+ "And the discount percentage on the shoe is : " +Discount);
		   File source = driver.getScreenshotAs(OutputType.FILE);
		   File destination= new File("./screenhsot/trainingshoe.png");
		   FileUtils.copyFile(source, destination);
		   driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		   driver.close();
		   
	}

}
