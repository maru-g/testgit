import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ETOE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Documents\\chromedriver.exe");

		WebDriver driverr = new ChromeDriver();
		driverr.get("http://spicejet.com");

		driverr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driverr.findElement(By.className("select_CTXT")).click();
		// driverr.findElement(By.className("select_CTXT")).s
		driverr.findElement(By.xpath("//a[@value='BLR']")).click();

		driverr.findElement(By.xpath("//a[@value='MAA']")).click();

		Thread.sleep(2000);

		// driverr.findElement(By.className("ui-state-default.ui-state-highlight.ui-state-active")).click();

		// driverr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		if (driverr.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))

		{

			System.out.println("its disabled");

			// Assert.assertTrue(true);

		}

		else

		{

			// Assert.assertTrue(false);

		}

		driverr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		driverr.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++)

		{

			driverr.findElement(By.id("hrefIncAdt")).click();

		}

		driverr.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driverr.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driverr.findElement(By.id("divpaxinfo")).getText());

		// driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

		driverr.findElement(By.cssSelector("input[value='Search']")).click();

//		driver.findElement(By.xpath("//input[@value='Search']")).click();

		// driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();

	}

}
