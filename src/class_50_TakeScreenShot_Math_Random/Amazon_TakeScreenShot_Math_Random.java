package class_50_TakeScreenShot_Math_Random;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Amazon_TakeScreenShot_Math_Random {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("I phone 16 pro max");
		search.sendKeys(Keys.ENTER);
		TakesScreenshot tss = (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		// File destination = new
		// File("C:\\Users\\mukul\\eclipse-workspace\\Chandan_Selenium_Project\\Screenshots\\Two"+Math.random()
		// +".jpeg");
		File destination = new File("C:\\Users\\mukul\\eclipse-workspace\\Chandan_Selenium_Project\\Screenshots\\Two"
				+ new Amazon_TakeScreenShot_Math_Random().getClass() + ".jpeg");
		FileHandler.copy(source, destination);
	}

}
