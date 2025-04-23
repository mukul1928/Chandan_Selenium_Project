package class_48_ExplicitWait_GetWindowHandle_GetWindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_GetWindowHandle_GetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/registration/createAccount");
		WebElement google = driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		Set<String> g1 = driver.getWindowHandles();
		System.out.println(g1);
		Thread.sleep(2000);
		Iterator<String> g2 = g1.iterator();
		String s1 = g2.next();// 1st time it will give you the parent ID
		String s2 = g2.next();// 2nd time it will give you the child ID
		driver.switchTo().window(s2);
		driver.close();

	}

}
