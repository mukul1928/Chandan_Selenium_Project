package class_43_ArrowDown_FileUploadPopUp_JSPopUpHandles_and_CopyPaste;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_TypeIndia_ArrowDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search_tf = driver.findElement(By.name("q"));
		search_tf.sendKeys("India");
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		search_tf.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		search_tf.sendKeys(Keys.ENTER);
	}

}
