package class_47_CSS_AN_AV_TagName_AN_AV_TagNameClassName_AN_AV_SubString_RighClickProhibited_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_TF_UsingCSS_Selector_UsingAttributeName_and_AttributeValue {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement search_tf = driver.findElement(By.cssSelector("[name='q']"));
		search_tf.sendKeys("Indian Billionares");
		search_tf.sendKeys(Keys.ENTER);

	}

}
