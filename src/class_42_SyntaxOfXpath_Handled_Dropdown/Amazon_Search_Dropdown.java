package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Search_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement dd = driver.findElement(By.xpath("(//select)[1]"));
		//Thread.sleep(3000);
		Select s1 = new Select(dd);
		//s1.selectByIndex(10);
		//s1.selectByVisibleText("Garden & Outdoors");
		s1.selectByValue("search-alias=digital-music");
		

	}

}
