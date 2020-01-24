import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver" , "C:\\Users\\kebed\\Downloads\\chromedriver.exe");
	
	WebDriver driverr= new ChromeDriver();
	driverr.get("http://spicejet.");
	
	//Assert.assertFalse(condition);
		
		
		
		
	}

}
