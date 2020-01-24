package learnJava;

import static org.junit.Assert.*;

import java.util.List;
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
import org.openqa.selenium.support.ui.Select;

public class lists_selects {

	WebDriver driver;
	String baseurl;
	private Object String;

	@Before
	public void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kebed\\Downloads\\selenium-java-3.141.59\\libs\\chromedriver.exe");

		driver = new ChromeDriver();
		baseurl = "https://learn.letskodeit.com/p/practice";
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Test
	public void test() throws InterruptedException {

		driver.get(baseurl);

		WebElement sec = driver.findElement(By.id("carselect"));
		Thread.sleep(2000);
		Select opt = new Select(sec);
		// opt.selectByIndex(2);
		opt.selectByVisibleText("Benz");

		List<WebElement> lis = opt.getOptions();

		int ne = lis.size();

		for (int i = 0; i <= ne; i++) {

			String optin = lis.get(i).getText();

			System.out.println(optin);
		}

		
	
		
		
	}

	@After
	public void tearDown() throws Exception {
		// driver.quit();
	}

}
