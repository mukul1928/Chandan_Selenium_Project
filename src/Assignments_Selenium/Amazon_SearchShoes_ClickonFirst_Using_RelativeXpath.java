package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_SearchShoes_ClickonFirst_Using_RelativeXpath {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search_tf = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])"));
		search_tf.sendKeys("shoes");
		Thread.sleep(3000);
		WebElement clickbutton = driver.findElement(By.xpath("(//input[@id='nav-search-submit-button'])"));
		clickbutton.click();
		WebElement clickonfirst = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		clickonfirst.click();

	}

}
