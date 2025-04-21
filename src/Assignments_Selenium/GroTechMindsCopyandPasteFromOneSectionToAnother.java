package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMindsCopyandPasteFromOneSectionToAnother {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement copy = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		copy.sendKeys("Chandan");
		copy.sendKeys(Keys.CONTROL+"a");
		copy.sendKeys(Keys.CONTROL+"c");
		WebElement paste = driver.findElement(By.xpath("(//input[@type='text'])[7]"));
		paste.sendKeys(Keys.CONTROL+"v");
	}

}
