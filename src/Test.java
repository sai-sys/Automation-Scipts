import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Programming\\Automation Testing\\Selenium\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","F:\\Programming\\Automation Testing\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.just-eat.co.uk/");
		driver.findElement(By.className("Form_c-search-btn_1EEhL")).submit();
		
		Thread.sleep(4000);
		driver.close();

	}

}
