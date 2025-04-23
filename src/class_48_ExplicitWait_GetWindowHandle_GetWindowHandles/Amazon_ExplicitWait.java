package class_48_ExplicitWait_GetWindowHandle_GetWindowHandles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_ExplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement sign = driver.findElement(By.xpath("//span[.='Hello, sign in']"));
		WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		//w1.until(ExpectedConditions.titleIs("amazon"));
		//w1.until(ExpectedConditions.alertIsPresent());
		w1.until(ExpectedConditions.titleContains("Online"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(sign).perform();
		WebElement SignIn = driver.findElement(By.xpath("//span[.='Sign in']"));
		SignIn.click();
	}

}
