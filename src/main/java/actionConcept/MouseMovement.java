package actionConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovement {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		//here need to stop loading every time
		//https://www.makemytrip.com/
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		
		/*
		 * .build method will return action class object
		 * .perform : perform this action
		 * In Actions Class at the end build and perform methods are there
		 */
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[text()='Articles']")).click();
		
		System.out.println("Done");
		
		//driver.close();
	}

}
