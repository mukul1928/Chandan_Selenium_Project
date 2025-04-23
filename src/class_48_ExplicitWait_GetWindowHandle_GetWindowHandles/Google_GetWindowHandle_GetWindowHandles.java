package class_48_ExplicitWait_GetWindowHandle_GetWindowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_GetWindowHandle_GetWindowHandles {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Indian");
		search.sendKeys(Keys.ENTER);
		String s1 = driver.getWindowHandle();
		System.out.println("This is the result of GWH-> " + s1);
		Set<String> s2 = driver.getWindowHandles();
		System.out.println("This is the result of GWHs-> " + s2);
	}
}
