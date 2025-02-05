package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[@class='card'])[1]/button")).click();
		String titleofpage= driver.getTitle();
		System.out.println("the title of the page is " + titleofpage);
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).isEnabled();
		System.out.println(enabled);
		
		WebElement element = driver.findElement(By.xpath("(//span[text()='Submit'])[1]"));
		Point location = element.getLocation();
		System.out.println("The position of the button :" + location);
		
		String cssVal=driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("The background color of Save button is " + cssVal);
		
		String text=driver.findElement(By.xpath("//h5[text()='Find the Save button color']")).getText();
		System.out.println("The text is :" +text);
		
		Dimension size = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
		System.out.println("the height and width of the button is " + size);
		
		driver.close();
		
		
	}

}
