package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1258936988");
		driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		String LeadId= driver.findElement(By.xpath("(//a[contains(text(),'10253')])[1]")).getText();
		System.out.println(LeadId);
		driver.findElement(By.xpath("(//a[contains(text(),'10252')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadId);
		driver.findElement(By.linkText("Find Leads")).click();
		
		boolean msg=driver.findElement(By.xpath("//div[contains(text(),'No records')]")).isDisplayed();
		System.out.println("Is message visible?" +msg);
		
		driver.close();
		
		
	}

}
