package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchFlipkart_HoverOver_Login_ClickOnSignUp_EnterMobile {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement login = driver.findElement(By.xpath("(//span[.='Login'])"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement signup = driver.findElement(By.xpath("(//span[.='Sign Up'])"));
		signup.click();
		WebElement mobile = driver.findElement(By.xpath("(//input[@class='r4vIwl BV+Dqf'])"));
		mobile.sendKeys("8808058000");
		WebElement continuebutton = driver.findElement(By.xpath("(//span[.='CONTINUE'])"));
		continuebutton.click();
	}

}
