package class_49_GetOptions_of_SelectClass_CountTotalNoOfLinksUsingWebDriver_TakeScreenShots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Find_Out_The_Individual_Link_From_All_The_Links {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countoflinks = links.size();
		System.out.println(countoflinks);
		for (int i = 0; i < countoflinks; i++) {
			WebElement single_link = links.get(i);
			String message = single_link.getAttribute("herf");
			System.out.println(message);
		}
	}

}
