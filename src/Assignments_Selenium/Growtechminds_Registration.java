package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Growtechminds_Registration {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registeration-form/");
		driver.findElement(By.name("your-name")).sendKeys("Chandan Pandey");
		driver.findElement(By.name("your-email")).sendKeys("chandanpandey@gmail.com");
		driver.findElement(By.name("telephone")).sendKeys("8808080808");
		//driver.findElement(By.name("fax")).sendKeys("43434352332");

	}

}
