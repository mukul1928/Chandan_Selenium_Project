package class_46_RightClick_UsingActionsClass_TagName_ClassName_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_TF_UsingCSS_Selector_Using_TagName_ClassNameValue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement ele = driver.findElement(By.cssSelector("textarea.gLFyf"));
		ele.sendKeys("I Phone 16 pro max price in Dubai");
		ele.sendKeys(Keys.ENTER);

	}

}
