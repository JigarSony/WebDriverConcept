package browserConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new SafariDriver();
		/*
		 * Safari > preference > Advance > Click/Check on Show Develop Menu
		 * IN Develop Menu Click/Select to Allow Remote Automation
		 */
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
