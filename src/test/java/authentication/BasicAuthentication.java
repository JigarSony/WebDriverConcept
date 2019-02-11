package authentication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthentication {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//http://<username>:<password>@<restofurl>
		driver.get("http://admin:admin@the-internet.herouapp.com/basic_auth");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
