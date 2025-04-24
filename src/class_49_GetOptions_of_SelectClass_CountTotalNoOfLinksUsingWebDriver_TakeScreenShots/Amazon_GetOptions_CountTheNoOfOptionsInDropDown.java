package class_49_GetOptions_of_SelectClass_CountTotalNoOfLinksUsingWebDriver_TakeScreenShots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_GetOptions_CountTheNoOfOptionsInDropDown {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dd);
		s1.selectByIndex(3);
		List<WebElement> count = s1.getOptions();
		int opt_count = count.size();
		System.out.println(opt_count);
	}

}
