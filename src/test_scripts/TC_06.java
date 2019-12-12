package test_scripts;

import org.openqa.selenium.By;

import general.General;

public class TC_06  {

	public static void main(String[] args) throws InterruptedException {
		General general = new General();
		
		general.startUP();
		general.navigateToURL();
		
		try {
			general.driver.findElement(By.xpath("//*[@id=\"skipToMain\"]/form/div/div/label/input")).sendKeys("AR51 1AA");
			general.driver.findElement(By.className("Form_c-search-btn_1EEhL")).click();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			Thread.sleep(5000);
			general.exitApplication();
		}	

	}

}
