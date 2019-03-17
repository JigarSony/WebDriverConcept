package webDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		/*
		 * WebDriver is Interface
		 * ChromeDriver is Class
		 */
		
		//WebDriver driver = new ChromeDriver();
		
		//new ChromeDriver(); :: one object will be created
		//WebDriver is Interface :: is parent interface
		//driver :: is object reference name representing chrome driver object
		//dynamic polymorphism: child class object can be referred by 
		//parent interface reference variable
		
		/*
		ChromeDriver dr1 = new ChromeDriver();
		FirefoxDriver ff =  new FirefoxDriver();
		//also we can
		
		
		WebDriver driver1 = new FirefoxDriver();
		
		WebDriver driver2 = new InternetExplorerDriver();
		
		WebDriver driver3 = new SafariDriver();
		*/
		
		/*
		 * Here we create the all four instance for browsers
		 * if you want to chrome driver comment all others
		 * if you want to ff driver comment all others
		 * This is wrong practice that's why we never create
		 * FirefoxDriver ff =  new FirefoxDriver();
		 * Every time you have to change
		 * Every time you're changing your webdriver
		 * Every time you're commenting your script it self - not good practice
		 * that's why we write like :: WebDriver driver = new ChromeDriver();
		 * Tomorrow you want to change browser then simply change 
		 * WebDriver driver = new FirefoxDriver(); only or if-else condition
		 * but we never write ChromeDriver dr1 = new ChromeDriver();
		 * means that you're script only related to chrome
		 */
		
		//System.setProperty("webdriver.chrome.driver", "‎⁨⁩/⁨Users⁩/⁨jigarsony⁩/⁨Downloads/chromedriver⁩");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(); 
		//1. launch chrome browser
		
		//if you write only this line :: will give you 
		// java.lang.IllegalStateException: The path to the driver executable must be set by 
		//the webdriver.chrome.driver system property; for more information, 
		//see https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver.
		//The latest version can be downloaded from http://chromedriver.storage.googleapis.com/index.html
		
		driver.get("http://www.google.com"); //2. enter url
		//http is compulsory
		
		String title = driver.getTitle(); //3. get title
		
		System.out.println("Page Title: "+ title);
		
		//validation
		if(title.equals("Google")) {
			System.out.println("Title is Correct");
		}else {
			System.out.println("Title is not Correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit(); //close the browser
	}

}
