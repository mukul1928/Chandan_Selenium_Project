package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_Click_MobileUsing_Xpath_When_Tag_A_Available {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement mobile = driver.findElement(By.xpath("(//a[.='Mobiles'])"));
		mobile.click();

	}
}
