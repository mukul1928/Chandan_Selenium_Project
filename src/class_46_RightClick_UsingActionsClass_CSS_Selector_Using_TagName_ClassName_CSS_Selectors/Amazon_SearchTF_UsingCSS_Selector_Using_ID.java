package class_46_RightClick_UsingActionsClass_CSS_Selector_Using_TagName_ClassName_CSS_Selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchTF_UsingCSS_Selector_Using_ID {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement search_tf = driver.findElement(By.cssSelector("#twotabsearchtextbox")); //#IDValue
		search_tf.sendKeys("I phones 16 pro max");
		search_tf.sendKeys(Keys.ENTER);
	}

}
