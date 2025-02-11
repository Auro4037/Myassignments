package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ChromeDriver driver=new ChromeDriver();
		   driver.get("https://jqueryui.com/droppable/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		   Actions dnd = new Actions(driver);
		   driver.switchTo().frame(0);
		   WebElement dragelement = driver.findElement(By.id("draggable"));
		   WebElement dropelement = driver.findElement(By.id("droppable"));
		   
		   dnd.dragAndDrop(dragelement, dropelement).perform();
		 

	}

}
