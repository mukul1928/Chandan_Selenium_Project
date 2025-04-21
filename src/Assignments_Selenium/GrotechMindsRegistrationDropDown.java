package Assignments_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMindsRegistrationDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://grotechminds.com/registration/");
		WebElement firstname = driver.findElement(By.xpath("(//input[@placeholder='First Name'])"));
		firstname.sendKeys("Chandan");
		WebElement lastname = driver.findElement(By.xpath("(//input[@placeholder='Last Name'])"));
		lastname.sendKeys("Pandey");
		WebElement address = driver.findElement(By.xpath("(//textarea[@rows='3'])"));
		address.sendKeys("Gorakhpur");
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("chandanpandey@gmail.com");
		WebElement phone = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		phone.sendKeys("8808080808");
		Thread.sleep(3000);
		WebElement gender = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
		gender.click();
		WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		hobbies.click();
		WebElement language = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		language.sendKeys("English");
		WebElement select_skills = driver.findElement(By.xpath("(//span[@id='select2-exrm-container'])"));
		Select s1 = new Select(select_skills);
		s1.selectByIndex(2);
		WebElement select_country = driver.findElement(By.xpath("(//span[@id='select2-e9j5-container'])"));
		Select s2 = new Select(select_country);
		s2.selectByIndex(1);
		WebElement year = driver.findElement(By.xpath("(//span[@id='select2-mejf-container'])"));
		Select s3 = new Select(year);
		s3.selectByIndex(1);
		WebElement month = driver.findElement(By.xpath("(//span[@id='select2-or8z-container'])"));
		Select s4 = new Select(month);
		s4.selectByIndex(10);
		WebElement day = driver.findElement(By.xpath("(//span[@id='select2-gkll-container'])"));
		Select s5 = new Select(day);
		s5.selectByIndex(19);
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("mukul@143");
		WebElement confirmpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		confirmpass.sendKeys("mukul@143");
		WebElement submit = driver.findElement(By.xpath("(//button[.='Submit'])"));
		submit.click();

	}

}
