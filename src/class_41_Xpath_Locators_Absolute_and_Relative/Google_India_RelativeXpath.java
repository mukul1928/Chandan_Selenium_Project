package class_41_Xpath_Locators_Absolute_and_Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_India_RelativeXpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("India");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();

	}

}
