package class_44_AutoSuggestions_NavigateMethodsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("mobile");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])/div/div"));
		int count = auto.size();
		System.out.println(count);
		Thread.sleep(4000);
		auto.get(count-7).click();
				
	}

}
