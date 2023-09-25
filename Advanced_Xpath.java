package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Advanced_Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\X232294\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9062082%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI6d_92eS8_AIVygRyCh3sbgCdEAAYASAAEgLgrPD_BwE");
		
		//using preceding-sibling for first name
		driver.findElement(By.xpath("//div[@id='password_field']//preceding-sibling::div//input[@name='firstname']")).sendKeys("Aishwarya");
		
		//using parent for surname
		driver.findElement(By.xpath("//div[@id='password_field']//parent::div[1]//input[@name='lastname']")).sendKeys("Gowda");
		
		//using child for password
//		driver.findElement(By.xpath("//div[@id='password_field']//child::div//input[@id='password_step_input']")).sendKeys("aish");
		
		driver.findElement(By.xpath("//div[@id='password_field']//self::div//input[@id='password_step_input']")).sendKeys("aish");
		
		//for password using descendant
		//div[@id='password_field']//descendant::div//input
		
		//using preceding for mobile number
		driver.findElement(By.xpath("//div[@id='password_field']//preceding::div[9]//input")).sendKeys("9876543210");
		
		//using follow for date of birthday
		Select date = new Select(driver.findElement(By.xpath("//div[@id='password_field']//following::div[1]//select[@name='birthday_day']")));
		date.selectByVisibleText("29");
		
		//using following-sibling for month of birthday
		Select month = new Select(driver.findElement(By.xpath("//div[@id='password_field']//following-sibling::div[1]//select[@name='birthday_month']")));
		month.selectByVisibleText("Apr");
		
		Select year = new Select(driver.findElement(By.xpath("//div[@id='password_field']//following-sibling::div[1]//select[@name='birthday_year']")));
		year.selectByVisibleText("1998");
		
		//using ancestor for gender
		driver.findElement(By.xpath("//div[@id='password_field']//ancestor::div//span[@data-name='gender_wrapper']//input[@value='1']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit' or @text()='Sign Up']"));
		
		driver.quit();
		
		

	}

}