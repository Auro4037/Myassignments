package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for Boys");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		WebElement element =driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
		String text= element.getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Newest Arrivals')]")).click();
		String product= driver.findElement(By.xpath("(//h2[@class='a-size-base-plus a-spacing-none a-color-base a-text-normal'])[1]/span")).getText();
		System.out.println("The Product name is : " +product);
		String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The price of the product is : " +price);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
