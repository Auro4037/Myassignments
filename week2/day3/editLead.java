package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editLead {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DF");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("wwwe");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MO");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("weeed");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("DMO");
		driver.findElement(By.name("description")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("awer@gmail.com");
		WebElement e= driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		
		Select province = new Select(e);
		province.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("fdfffff");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
		
		

	}

}
