package actionConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		WebElement Link = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		act.doubleClick(Link).build().perform();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		
		driver.close();
		
	}

}
