package dataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordpressLogin_DataDrivenTesting_MukeshOtwani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\Selenium\\chromedriver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys("");
		
		driver.findElement(By.id("user_pass")).sendKeys("");
		
		driver.findElement(By.id("wp-submit")).click();
		
		
	}
	
	public Object[][] passData()
	{
		Object[][] data = new Object[3][2];
		
		data[0][0]="admin1";
		data[0][1]="demo1";
		
		data[1][0]="admin";
		data[1][1]="demo123";
		
		data[2][0]="admin2";
		data[2][1]="demo1234";
		
		return data;

		
	}
}
