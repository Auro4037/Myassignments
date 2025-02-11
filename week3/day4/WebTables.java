package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

 public static void main(String[] args) throws InterruptedException {
  ChromeDriver driver = new ChromeDriver();
  driver.get ("https://erail.in/");
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  
  Thread.sleep(3000);
  //enter "MAS" as the from station
  driver.findElement(By.id("txtStationFrom")).clear();
  driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
  //Enter "MDU" as the "To" station.
  driver.findElement(By.id("txtStationTo")).clear();
  driver.findElement(By.id("txtStationTo")).sendKeys("MDU",Keys.ENTER);
  //Uncheck the "Sort on Date" checkbox.
  driver.findElement(By.xpath("//table[@id='tableTopMenu']/tbody/tr[1]/td[6]")).click();
  //Retrieve the train names from the web table.
  //--->//div[@id='divTrainsList']/table/tbody/tr/td[2]--->list of train names
  List<WebElement> trainNames = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody/tr/td[2]"));
  //System.out.println(trainNamesElements.get(0).getText());
  List<String> listOfTrainNames = new ArrayList<String>();
  for(int i=0;i<trainNames.size();i++) {
   System.out.println(trainNames.get(i).getText());
   listOfTrainNames.add(trainNames.get(i).getText());
  }
  //System.out.println(listOfTrainNames);
  //Verify if there are any duplicate train names in the web table.
  int dup=0;
  List<String> dupTrainNames=new ArrayList<String>();
  for(int j=0;j<listOfTrainNames.size()-1;j++) {
   
   if((listOfTrainNames.get(j)).equals(listOfTrainNames.get(j+1))) {
	   dupTrainNames.add(listOfTrainNames.get(j));
    dup++;
   }
  }
  System.out.println("The number of duplicates train names are : " +dup);
  System.out.println("List of duplicate train names are : " + dupTrainNames);
  driver.close();
  
  
  
  //---->//div[@id='divTrainsList']/table/tbody/tr/th[2]---->title of column
  //---->//div[@id='divTrainsList']/table/tbody/tr---->row count
  //---->//div[@id='divTrainsList']/table/tbody/tr/th------>col count
  

 }

}