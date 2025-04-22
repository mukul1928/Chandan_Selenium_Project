package class_46_RightClick_UsingActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchGoogle_RightClick {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.contextClick(search).perform();

	}

}
