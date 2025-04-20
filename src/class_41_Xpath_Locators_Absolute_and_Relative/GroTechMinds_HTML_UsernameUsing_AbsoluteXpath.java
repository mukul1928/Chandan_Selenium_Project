package class_41_Xpath_Locators_Absolute_and_Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMinds_HTML_UsernameUsing_AbsoluteXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/AT_39_Batch/learningHTML1.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Chandan_Hunk");
	}

}
