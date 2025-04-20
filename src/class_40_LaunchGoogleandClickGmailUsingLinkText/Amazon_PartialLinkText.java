package class_40_LaunchGoogleandClickGmailUsingLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_PartialLinkText {
	public static void main(String[] args) {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Service")).click();
	}
}
 