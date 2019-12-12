package general;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import global.Global;


public class General extends Global{
		
		public void startUP() {
			System.setProperty("webdriver.chrome.driver", "F:\\Programming\\Automation Testing\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}		
		
		public void navigateToURL() {
			driver.navigate().to(URL);
		}
		
		public void exitApplication() {
			driver.close();
		}
}
