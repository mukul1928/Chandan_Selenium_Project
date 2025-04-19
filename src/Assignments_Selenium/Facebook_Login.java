package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("chandanpandey1928@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mukul1928@");
		driver.findElement(By.name("login")).click();

	}

}
