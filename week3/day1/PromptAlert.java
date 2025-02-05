package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert prompt= driver.switchTo().alert();
		prompt.sendKeys("Auro");
		String prompttext= prompt.getText();
		System.out.println("Text inside alert box :" +prompttext);
		prompt.dismiss();
		
		String text =driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println("Text after dismiss" +text);
		
		
	}

}
