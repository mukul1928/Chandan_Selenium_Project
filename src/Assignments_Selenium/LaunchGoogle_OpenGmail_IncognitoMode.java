package Assignments_Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchGoogle_OpenGmail_IncognitoMode {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.contextClick(gmail).perform();
		Robot r1 = new Robot();
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		
	}

}
