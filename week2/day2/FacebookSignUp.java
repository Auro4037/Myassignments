package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Auro");
		driver.findElement(By.name("lastname")).sendKeys("Mohapatra");
		
		driver.findElement(By.name("reg_email__")).sendKeys("testleaf123@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("avcdsd");
		
		WebElement element1 = driver.findElement(By.id("day"));
		
		Select day= new Select(element1);
		day.selectByVisibleText("10");
		
		WebElement element2 = driver.findElement(By.id("month"));
		Select month= new Select(element2);
		month.selectByIndex(0);
		
		WebElement element3= driver.findElement(By.id("year"));
		Select year = new Select(element3);
		year.selectByValue("1994");
		
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		
		
		
		
		
		
	}

}
