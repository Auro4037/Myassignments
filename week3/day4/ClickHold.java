package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickHold {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			   ChromeDriver driver=new ChromeDriver();
			   driver.get("https://jqueryui.com/selectable/");
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			   Actions ch = new Actions(driver);
			   driver.switchTo().frame(0);
			   
			   WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
			   WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
			   
			   ch.clickAndHold(item1).clickAndHold(item2).perform();
		}

}
