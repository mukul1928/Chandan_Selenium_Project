package Assignments_Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Search_GetWindowHandles {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.flipkart.com");
		WebElement search = driver.findElement(By.xpath("(//input[@name='q'])"));
		search.sendKeys("I phone 16 pro max");
		search.sendKeys(Keys.ENTER);
		WebElement clickfirst = driver.findElement(By.xpath("(//div[@class='_4WELSP'])[1]"));
		clickfirst.click();
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();
		String s2 = g2.next();
		driver.switchTo().window(s2);
	//	driver.close();
		
		
	}

}
