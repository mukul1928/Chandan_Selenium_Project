package class_41_Xpath_Locators_Absolute_and_Relative;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMinds_HTML_PasswordUsing_AbsoluteXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/AT_39_Batch/learningHTML1.html");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("mukulpandey1928282828282");
	}

}
