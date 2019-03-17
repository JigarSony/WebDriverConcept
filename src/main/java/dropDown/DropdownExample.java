package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownExample {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver chrome = new ChromeDriver();
		
		System.out.println("Initialize Driver");
		
		chrome.manage().window().maximize();
		
		System.out.println("Maximize Webbrowser");
		
		chrome.get("http://demo.guru99.com/test/newtours/register.php");
		
		System.out.println("Getting URL");
		
		chrome.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//chrome.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		
		WebElement country = chrome.findElement(By.xpath("//*[@name='country']"));
		
		Select se = new Select(country);
		
		//se.selectByVisibleText("INDIA");
		//se.selectByValue("ITALY");
		se.selectByIndex(6);
		Thread.sleep(5000);
		
		System.out.println(chrome.getCurrentUrl());
		
		System.out.println(chrome.getTitle());
		
		chrome.close();
		
		chrome.quit();

	}

}
