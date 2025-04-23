package class_46_RightClick_UsingActionsClass_CSS_Selector_Using_TagName_ClassName_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_TF_UsingClassNameLocator {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.className("gLFyf"));
		ele.sendKeys("Indian Economy");
		ele.sendKeys(Keys.ENTER);
	}

}
