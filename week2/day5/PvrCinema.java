package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PvrCinema {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='INOX DN Regalia Bhubaneswar']")).click();
		driver.findElement(By.xpath("(//span[contains(text(),'Tomorrow')])[1]")).click();
		driver.findElement(By.xpath("//div[@id='movie']/div[2]/following-sibling::span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='time']/div[2]/following-sibling::span")).click();
		driver.findElement(By.xpath("(//span[text()='Book'])[4]")).click();
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		driver.findElement(By.xpath("//span[@id='RY.ROYAL|C:6']")).click();
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		driver.findElement(By.xpath("/button[@class='sc-dQpIV kXNFEA btn-proceeded']")).click();
		System.out.println(driver.getTitle());;
		
		

	}

}
