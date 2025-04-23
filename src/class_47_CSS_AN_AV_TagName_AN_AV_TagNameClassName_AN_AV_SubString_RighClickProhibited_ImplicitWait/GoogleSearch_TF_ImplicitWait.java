package class_47_CSS_AN_AV_TagName_AN_AV_TagNameClassName_AN_AV_SubString_RighClickProhibited_ImplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_TF_ImplicitWait {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//Duration is a final class
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Mobiles under 2 lakhs");
		search.sendKeys(Keys.ENTER);
	}
}
