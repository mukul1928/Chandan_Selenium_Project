package class_46_RightClick_UsingActionsClass_CSS_Selector_Using_TagName_ClassName_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrotechTecMinds_TagNameLocator_A_FindElement {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("file:///E:/AT_39_Batch/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.tagName("a"));
		ele.click();
	}

}
