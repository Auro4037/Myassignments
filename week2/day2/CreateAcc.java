package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.leaftaps.com/opentaps/control/logout");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Selenium Automation Tester");
		WebElement industry= driver.findElement(By.name("industryEnumId"));
		
		Select dd= new Select(industry);
		dd.selectByValue("IND_SOFTWARE");
		
		WebElement corp= driver.findElement(By.name("ownershipEnumId"));
		Select dd1= new Select(corp);
		dd1.selectByVisibleText("S-Corporation");
		
		WebElement id = driver.findElement(By.id("dataSourceId"));
		Select dd3= new Select(id);
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement marketing= driver.findElement(By.name("marketingCampaignId"));
		Select dd4= new Select(marketing);
		dd4.selectByIndex(6);
		
		WebElement state= driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5= new Select(state);
		dd5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		WebElement element=driver.findElement(By.xpath("//span[@class='tabletext'])[3]"));
		System.out.println(element.getText());
		
		driver.close();
		
		
	}

}
