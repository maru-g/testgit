import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Documents\\chromedriver.exe");

		WebDriver driverr = new ChromeDriver();
		driverr.manage().window().maximize();
	driverr.get("https://www.amazon.com/");
	
	driverr.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		Actions a = new Actions(driverr);
		
	a.moveToElement(driverr.findElement(By.id("nav-link-accountList"))).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
