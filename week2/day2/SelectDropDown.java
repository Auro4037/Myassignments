package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

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
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AMGG");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("MO");
		//handling dropdowns
		
		WebElement element = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		//instantite Select class
		
		Select dropdown = new Select(element);
		
		//select the option by index
		//dropdown.selectByIndex(3);
		
		//select option by value
		//dropdown.selectByValue("LEAD_EXISTCUST");
		
		//select by text
		dropdown.selectByVisibleText("Public Relations");
		
		//select industry
		WebElement element2 = driver.findElement(By.name("industryEnumId"));
		Select industry=new Select(element2);
		industry.selectByValue("IND_HEALTH_CARE");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
	}

}
