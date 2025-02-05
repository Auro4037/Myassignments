package week3.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//Switch to alert
		
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert promptalert = driver.switchTo().alert();
		promptalert.dismiss();
		

	}

}
