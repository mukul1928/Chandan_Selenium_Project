package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonIndia_Dropdown_SelectBook_TypeWorld_Hit_Enter {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in");
		WebElement dd = driver.findElement(By.xpath("(//select)[1]"));
		Select s1 = new Select(dd);
		s1.selectByVisibleText("Books");
		WebElement search_tf = driver.findElement(By.id("twotabsearchtextbox"));
		search_tf.sendKeys("world");
		WebElement enter = driver.findElement(By.id("nav-search-submit-button"));
		enter.sendKeys(Keys.ENTER);
	}

}
