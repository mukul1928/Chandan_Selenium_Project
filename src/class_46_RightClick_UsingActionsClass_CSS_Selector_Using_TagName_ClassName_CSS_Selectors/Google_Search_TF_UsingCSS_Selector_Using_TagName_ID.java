package class_46_RightClick_UsingActionsClass_CSS_Selector_Using_TagName_ClassName_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_TF_UsingCSS_Selector_Using_TagName_ID {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement ele = driver.findElement(By.cssSelector("textarea#APjFqb"));
		ele.sendKeys("Motivational Thoughts");
		ele.sendKeys(Keys.ENTER);
	}

}
