package class_40_LaunchGoogleandClickGmailUsingLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchAmazonIndiaClickOnMobileUsingLinkText {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Mobiles")).click();
	}

}
