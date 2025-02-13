package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchBrowser {
	
	ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void preConditions(String Url, String Uname, String Pwd) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable notifications");
		
		driver = new ChromeDriver(options);
		driver.get(Url);
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(Pwd);
		driver.findElement(By.id("Login")).click();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterMethod
	public void postConditions() {
		
		driver.close();
	}

}
