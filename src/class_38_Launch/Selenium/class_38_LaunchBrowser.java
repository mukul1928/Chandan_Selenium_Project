package class_38_Launch.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class class_38_LaunchBrowser {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");// get method can help you to take you to any particular Websites
		String title = driver.getTitle();// getTitle method can help to get the title of the page
		System.out.println(title);
		driver.quit();
		//driver.close();
	}
}
