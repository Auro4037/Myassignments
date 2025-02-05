package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[1]")).click();
		
		Set<String> allwindow = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(allwindow);
		
		driver.switchTo().window(windows.get(1));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//table[@id='widget_ComboBox_partyIdFrom']/following::a)[2]")).click();
		
		Set<String> allwindow1 = driver.getWindowHandles();
		List<String> windows1 = new ArrayList<String>(allwindow1);
		driver.switchTo().window(windows1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(windows1.get(0));
		
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		
		
		driver.switchTo().alert().accept();
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
