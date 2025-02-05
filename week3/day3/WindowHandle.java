package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> allwindow = new ArrayList<String>(windowHandles);
		driver.switchTo().window(allwindow.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String childwindowTitle= driver.getTitle();
		System.out.println(childwindowTitle);
		
		driver.switchTo().window(allwindow.get(0));
		driver.close();

	}

}
