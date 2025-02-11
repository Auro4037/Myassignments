package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.pvrcinemas.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   Actions actionHover = new Actions(driver);
		   WebElement hoverelement = driver.findElement(By.xpath("(//span[text()='More'])[1]"));
		   actionHover.moveToElement(hoverelement).perform();
		   

	}

}
