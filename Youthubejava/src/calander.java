
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class calander {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Documents\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");	
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS );
		driver.findElement(By.id("travel_date")).click();
		
		driver.switchTo().alert().accept();
	



		

		
		
	
	}
}
