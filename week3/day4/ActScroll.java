package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ChromeDriver driver=new ChromeDriver();
		   
		   driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   Actions actScroll = new Actions(driver);
		   
		   WebElement scrollTo = driver.findElement(By.linkText("Conditions of Use & Sale"));
		   
		   actScroll.scrollToElement(scrollTo).perform();
	}

}
