package Assignments_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkartTypeShoes_Pick3rd_FromAutoSuggestions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
		WebElement search = driver.findElement(By.xpath("(//input[@name='q'])"));
		search.sendKeys("mobile");
		List<WebElement> auto = driver.findElements(By.xpath("(//div[@class='_3ZqtNW'])//ul//li"));
		int count = auto.size();
		System.out.println(count);
		Thread.sleep(2000);
		auto.get(count - 2).click();
	}

}
