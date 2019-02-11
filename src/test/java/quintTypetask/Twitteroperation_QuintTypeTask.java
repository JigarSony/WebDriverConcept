package quintTypetask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Twitteroperation_QuintTypeTask {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://twitter.com/login?lang=en");
		
		System.out.println("Twitter Opened");
		
		driver.findElement(By.xpath("//div[@class='signin-wrapper']//input[@name='session[username_or_email]']")).sendKeys("XXXXX@gmail.com");
		driver.findElement(By.xpath("//div[@class='signin-wrapper']//input[@name='session[password]']")).sendKeys("XXXXX");
		
		driver.findElement(By.xpath("//*[@id=\"page-container\"]/div/div[1]/form/div[2]/button")).click();
		
		driver.findElement(By.xpath("//*[@id='search-query']")).sendKeys("POTUS");
	
		WebDriverWait wait=new WebDriverWait(driver, 360);
		WebElement potus;
		potus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='typeahead-item-4']/span[1]/span[1]")));
		potus.click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 50);
		WebElement follow;
		follow = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'page-container\']/div[1]/div/div[2]/div/div/div[2]/div/div/ul/li[6]/div/div/span[2]/button[1]")));
		follow.click();
		
		driver.findElement(By.xpath("//*[@id=\"user-dropdown-toggle\"]")).click();
		
		WebDriverWait wait2=new WebDriverWait(driver, 50);
		WebElement logout;
		logout = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signout-button\"]/button")));
		logout.click();
				
		driver.close();
		driver.quit();

	}

}
