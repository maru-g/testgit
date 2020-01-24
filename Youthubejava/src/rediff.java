import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\kebed\\Documents\\chromedriver.exe");
		
		WebDriver driverr= new ChromeDriver();
	driverr.get("http://rediff.com");
	driverr.findElement(By.cssSelector("a[title*='Already']")).click();
	driverr.findElement(By.cssSelector("input#login1")).sendKeys("marron");
	driverr.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("1234");
	driverr.findElement(By.xpath("//input[@name='proceed']")).click();
	driverr.close();
	
	

	}

}
