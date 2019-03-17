package actionConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		/*
		 * In some of the application there are 3 layers
		 * 1. Browser
		 * 2. Page
		 * 3. Frame
		 * 
		 * WebElement can be available in Page as well or in frame also 
		 * In Browser We have back,forward,refresh button
		 * 
		 * According w3c using frames is not upto the mark
		 * In this case we have to move/switch into the frame
		 */
		
		
		driver.switchTo().frame(0);
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.
		clickAndHold(source).
		moveToElement(target).
		build().
		perform();
		
		System.out.println("Done");
		
		driver.close();
	}
	

}
