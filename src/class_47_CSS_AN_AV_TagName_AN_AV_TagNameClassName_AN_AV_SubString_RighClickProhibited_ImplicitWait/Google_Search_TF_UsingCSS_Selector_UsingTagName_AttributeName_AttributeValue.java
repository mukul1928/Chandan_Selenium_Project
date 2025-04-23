package class_47_CSS_AN_AV_TagName_AN_AV_TagNameClassName_AN_AV_SubString_RighClickProhibited_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search_TF_UsingCSS_Selector_UsingTagName_AttributeName_AttributeValue {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		WebElement search = driver.findElement(By.cssSelector("textarea[name='q']"));
		search.sendKeys("Automation Testing Scope in India");
		search.sendKeys(Keys.ENTER);

	}

}
