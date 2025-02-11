package week3.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.bigbasket.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		   driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		   driver.findElement(By.linkText("Foodgrains, Oil & Masala")).click();
		   Thread.sleep(2000);
		   
     	 driver.findElement(By.xpath("(//button[text()='Show more +'])[1]")).click();
		  Actions a = new Actions(driver);
		  WebElement product = driver.findElement(By.linkText("Rice & Rice Products"));
		  a.moveToElement(product).click().perform();
		  driver.findElement(By.linkText("Boiled & Steam Rice")).click();
		  
		  Thread.sleep(2000);
		  WebElement ricebrand= driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		  a.scrollToElement(ricebrand).moveToElement(ricebrand).click().perform();
		  
		  Thread.sleep(2000);
		  WebElement typeofRice = driver.findElement(By.xpath("(//div[@class='break-words h-10 w-full'])[5]//h3[text()='Tamil Ponni Boiled - Rice']"));
		  a.scrollToElement(typeofRice).moveToElement(typeofRice).click().perform();
		  
		  Set<String> allWindows = driver.getWindowHandles();
		  List<String> ricedetail= new ArrayList<String>(allWindows);
		  
		  driver.switchTo().window(ricedetail.get(1));
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//div[@class='flex flex-col items-end relative flex-1 h-full'])[2]")).click();
		  String costofRice = driver.findElement(By.xpath("//div[@class='flex justify-start w-full h-full']//div[2]//span[text()='328']")).getText();
		  System.out.println("The cost of the selected rice brand is : " +costofRice);
		  
		  driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();
		  driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).click();
		  
		  File source = driver.getScreenshotAs(OutputType.FILE);
		  File destination = new File("./screenhsot/ricebrand.png");
		  FileUtils.copyFile(source, destination);
		  driver.close();
		  
		  driver.switchTo().window(ricedetail.get(0));
		  driver.close();
		  
	}

}
