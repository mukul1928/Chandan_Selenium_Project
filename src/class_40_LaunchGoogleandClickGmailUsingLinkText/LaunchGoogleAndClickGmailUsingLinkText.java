package class_40_LaunchGoogleandClickGmailUsingLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogleAndClickGmailUsingLinkText {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.linkText("Gmail")).click();

	}

}
