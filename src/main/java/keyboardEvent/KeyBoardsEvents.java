package keyboardEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class KeyBoardsEvents {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("username")).sendKeys(Keys.ENTER);
		
		/*Like THis way we can use keyboard keys
		 * There are lot more key available in Keys
		 * ScreenShot Attached
		 */
	}

}
