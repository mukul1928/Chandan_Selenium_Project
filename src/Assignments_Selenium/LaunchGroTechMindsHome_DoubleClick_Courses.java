package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchGroTechMindsHome_DoubleClick_Courses {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/");
		WebElement doubleclick = driver.findElement(By.xpath("(//a[.='Courses'])[1]"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(doubleclick).perform();
	}

}
