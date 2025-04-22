package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazonIndia_FindElementUsingTagName_A_andClick {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
	}

}
