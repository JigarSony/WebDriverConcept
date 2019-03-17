package navigationConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigation {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		System.out.println("Refreshed");
		
		driver.close();
	}

}
