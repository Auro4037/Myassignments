package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).click();
		boolean checkbox = driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[1]")).isSelected();
		System.out.println(checkbox);
		
		WebElement ajax=driver.findElement(By.xpath("//span[text()='Ajax']"));
		ajax.click();
		
	}

}
