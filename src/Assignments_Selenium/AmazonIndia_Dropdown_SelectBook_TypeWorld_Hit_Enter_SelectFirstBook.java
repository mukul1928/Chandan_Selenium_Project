package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonIndia_Dropdown_SelectBook_TypeWorld_Hit_Enter_SelectFirstBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement search_tf = driver.findElement(By.xpath("(//select)[1]"));
		Select s1 = new Select(search_tf);
		s1.selectByValue("search-alias=stripbooks");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("world");
		WebElement click_search = driver.findElement(By.id("nav-search-submit-button"));
		click_search.sendKeys(Keys.ENTER);
		WebElement clickonfirstresult = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
		clickonfirstresult.click();

	}

}
