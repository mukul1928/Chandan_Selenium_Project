package class_44_AutoSuggestions_NavigateMethodsInSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleTypeBangalore_NeedToChoose3rd_AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement search_tf = driver.findElement(By.name("q"));
		search_tf.sendKeys("Bangalore");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("(//div[@class='OBMEnb'])/ul/li"));
		int count = auto.size();//it will give you the no of auto suggestions (size method) is only available in the list of WebElement
		System.out.println(count);
		Thread.sleep(4000);
		//auto.get(3).click();
		auto.get(count-7).click();
		
	}

}
