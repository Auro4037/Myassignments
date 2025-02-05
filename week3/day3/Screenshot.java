package week3.day3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/logout");
		driver.findElement(By.id("username")).sendKeys("Auro is taking screenshot",Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("dddff");
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File destination= new File("./screenhsot/userpage.png");
		
		FileUtils.copyFile(source, destination);
		

	}

}
