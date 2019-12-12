package test_scripts;

import org.openqa.selenium.By;

import global.Global;
import general.General;

public class TC_04  {

	public static void main(String[] args) throws InterruptedException {
		General general = new General();
		
		general.startUP();
		general.navigateToURL();
		//general.driver.findElement(By.className("")).sendKeys("");
		general.driver.findElement(By.className("Form_c-search-btn_1EEhL")).click();
		Thread.sleep(8000);
		general.exitApplication();

	}

}
