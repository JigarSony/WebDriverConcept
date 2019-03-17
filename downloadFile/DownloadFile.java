package downloadFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void setUp() {
		folder = new File(UUID.randomUUID().toString());
		String projectpath = System.getProperty("user.dir");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting.popups", 0);
		prefs.put("download.default_directory", folder.getAbsoluteFile());
		options.setExperimentalOption("prefs", prefs);
		
		//DesiredCapabilities cap = DesiredCapabilities.chrome();
		//cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.setCapability(ChromeOptions.CAPABILITY, options);
		
		driver = new ChromeDriver(options);
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	
	}
}
