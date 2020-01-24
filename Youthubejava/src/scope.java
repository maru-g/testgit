import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Documents\\chromedriver.exe");

		WebDriver driverr = new ChromeDriver();
		driverr.manage().window().maximize();
		driverr.get("http://www.qaclickacademy.com/practice.php");
		
		System.out.println(driverr.findElements(By.tagName("a")).size());
		WebElement add =driverr.findElement(By.id("gf-BIG"));
		System.out.println(add.findElements(By.tagName("a")).size());

	}

}
