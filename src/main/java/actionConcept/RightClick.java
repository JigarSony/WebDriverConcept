package actionConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(btn).build().perform();
		
		WebElement edit = driver.findElement(By.cssSelector("li.context-menu-item.context-menu-icon.context-menu-icon-edit:nth-child(1) > span:nth-child(1)"));
		edit.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		
		driver.close();
	}

}
