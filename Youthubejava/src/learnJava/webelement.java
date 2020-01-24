package learnJava;

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

public class webelement {

	WebDriver driver;
	String baseurl;
	
	@Before
	public void setUp() throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Downloads\\selenium-java-3.141.59\\libs\\chromedriver.exe");
	
	driver = new ChromeDriver();
	baseurl = "https://learn.letskodeit.com/p/practice";
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		String title = driver.getTitle();
		System.out.println(title);
		String curnturl = driver.getCurrentUrl();
		System.out.println(curnturl);
		String urtologin = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urtologin);
		Thread.sleep(2000);
		
		driver.navigate().back();
		String curnew = driver.getCurrentUrl();
		System.out.println("newbackurl" + curnew);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
