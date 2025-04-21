package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroTechMinds_DragAndDrop_Reverse {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/drag-and-drop/");
		WebElement source = driver.findElement(By.id("drag7"));
		WebElement destination = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(source, destination).perform();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}

}
