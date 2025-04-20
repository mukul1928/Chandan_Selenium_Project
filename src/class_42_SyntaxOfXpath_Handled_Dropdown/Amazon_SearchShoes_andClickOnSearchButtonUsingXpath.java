package class_42_SyntaxOfXpath_Handled_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchShoes_andClickOnSearchButtonUsingXpath {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement search_tf = driver.findElement(By.xpath("(//input[@id='twotabsearchtextbox'])"));
		search_tf.sendKeys("shoes");
		WebElement clickbutton = driver.findElement(By.xpath("(//input[@value='Go'])"));
		clickbutton.click();
	}
}
