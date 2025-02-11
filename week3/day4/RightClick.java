package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
			   
			   driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			   
			   Actions actScroll = new Actions(driver);
			   WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
			   
			   actScroll.contextClick(rightclick).perform();
	}

}
