package class_48_ExplicitWait_GetWindowHandle_GetWindowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google_ExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		WebDriverWait w1 = new WebDriverWait(driver,Duration.ofSeconds(10));
	//	w1.until(ExpectedConditions.titleIs("Google"));
		w1.until(ExpectedConditions.titleContains("Goo"));// it will check whether my title contains Goo or not if yes then only it will proceed
	//	w1.until(ExpectedConditions.alertIsPresent());//alerts means the JS Pop Up
		search.sendKeys("Indian Army");
		search.sendKeys(Keys.ENTER);
		
		
	}

}
