package class_47_CSS_AN_AV_TagName_AN_AV_TagNameClassName_AN_AV_SubString_RighClickProhibited_ImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search_TF_UsingCSS_Selector_UsingSubString {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement search = driver.findElement(By.cssSelector("input[id^='twotab']"));
		search.sendKeys("I phone 16 pro max");
		search.sendKeys(Keys.ENTER);

	}
}
