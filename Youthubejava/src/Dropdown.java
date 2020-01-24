import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Documents\\chromedriver.exe");

		WebDriver driverr = new ChromeDriver();
		driverr.get("http://spicejet.com");
		/*
		 * Select s= new
		 * Select(driverr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		 * s.selectByValue("AED"); //driverr.close();
		 */

		driverr.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);

		System.out.print(driverr.findElement(By.id("divpaxinfo")).getText());
		driverr.findElement(By.id("hrefIncAdt")).click();

		for (int i = 1; i < 5; i++) {
			driverr.findElement(By.id("hrefIncAdt")).click();

		}

		System.out.print(driverr.findElement(By.id("divpaxinfo")).getText());

		driverr.findElement(By.id("btnclosepaxoption")).click();

	}

}
