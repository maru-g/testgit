import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitintro {
	
	
	WebDriver driver ;
	String baseurl;
	

	

	@Before
	public void setUp() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Downloads\\selenium-java-3.141.59\\libs\\chromedriver.exe");
		
		driver = new ChromeDriver();
		baseurl= "https://learn.letskodeit.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}

	
	@Test
	public void test() {
		
		driver.get(baseurl);
		driver.findElement(By.xpath("//a[@class='navbar-link fedora-navbar-link']")).click();
		
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("marronkebede@gmail.com");
		System.out.println("email sending ");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("1234");
		String nek = driver.getTitle();
		System.out.println(nek);
		
		
		
	}
	@After 
	public void tearDown() throws Exception {
		
		
	}

	
	
	
	
	
	
	
	

}
