package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week2.day3.Webelement;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']//span)[12]"));
		element.click();
		boolean selected = element.isSelected();
		System.out.println("The boolean value is : " +selected);
		
		WebElement city=driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']//span)[17]"));
		city.click();
		boolean cityselect= city.isSelected();
		System.out.println(cityselect);
		
		if(cityselect == false) {
			city.click();
			boolean cityselectfinal=city.isSelected();
			System.out.println(cityselectfinal);
		}
		
		
		WebElement defaultbrowser = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']//span)[21]"));
		boolean value= defaultbrowser.isSelected();
		if( value==false) {
			System.out.println("The  deafult browser is selected");
		}
		else {
			System.out.println("Select some other browser");
		}
		
		WebElement agegroup = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget']//span)[24]"));
		boolean age= agegroup.isSelected();
		if(age==false) {
			driver.close();
		}
		else {
			agegroup.click();
		}
	}
	

}
