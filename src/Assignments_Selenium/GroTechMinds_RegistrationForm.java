package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GroTechMinds_RegistrationForm {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registeration-form/");
		WebElement entername = driver.findElement(By.xpath("(//input[@name='your-name'])[1]"));
		entername.sendKeys("Chandan Pandey");
		WebElement enteremail = driver.findElement(By.xpath("(//input[@name='your-email'])[1]"));
		enteremail.sendKeys("chandnapandey@gmail.com");
		WebElement phone = driver.findElement(By.xpath("(//input[@name='telephone'])[1]"));
		phone.sendKeys("898989898989");
		WebElement gender = driver.findElement(By.xpath("(//span[@id='select2-gender-wa-container'])"));
		Select s1 = new Select(gender);
		s1.selectByIndex(1);
		WebElement exp = driver.findElement(By.xpath("(//input[@name='experience'])[6]"));
		exp.click();
		WebElement skills = driver.findElement(By.xpath("(//input[@name='skills'])[2]"));
		skills.click();
		WebElement submit = driver.findElement(By.xpath("(//button[.='Submit'])"));
		submit.click();
	}

}
