package Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X232294\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		//Absolute path
		driver.findElement(By.xpath("//html/body/div[1]/div[3]/form/div/div[1]/div[1]/div")).click();
		
		//Relative path and name
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("facebook",Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Using AND
		driver.findElement(By.xpath("//div[@aria-level=\"3\" and @role=\"heading\"]/span")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//using id
		driver.findElement(By.xpath("//input[@id='u_0_d_QE']")).sendKeys("Aish");
		
		//using contains
		driver.findElement(By.xpath("//*[contains(@aria-label, 'Mobile')]")).sendKeys("1234567890");

		//starts with
		driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("abc");
		
		// using or
		driver.findElement(By.xpath("//button[@name='websubmit' or @text()='Sign Up']")).click();
		
		driver.quit();

	}

}