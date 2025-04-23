package class_46_RightClick_UsingActionsClass_CSS_Selector_Using_TagName_ClassName_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_Tf_UsingCSS_Selector_Using_ClassName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.cssSelector(".gLFyf"));
		ele.sendKeys("Educational Quotes");
		ele.sendKeys(Keys.ENTER);
	}

}
