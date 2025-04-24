package class_49_GetOptions_of_SelectClass_CountTotalNoOfLinksUsingWebDriver_TakeScreenShots;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_CountTheNoOFLinksOnAPage_Using_WebDriver {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);
		for (int i = 0; i < countoflinks; i++) {
			WebElement single_link = links.get(i);
			String message = single_link.getText();
			System.out.println(message);

		}

	}

}
