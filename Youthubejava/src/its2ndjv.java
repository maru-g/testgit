import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class its2ndjv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

System.setProperty("webdriver.chrome.driver" , "C:\\Users\\kebed\\Downloads\\chromedriver.exe");
	
	WebDriver driverr= new ChromeDriver();
	driverr.get("http://facebook.com");
  System.out.println(driverr.getTitle());
  
 // Metodeone fireshed = new Metodeone();
    
  //System.out.println(fireshed.ValidatHeader());
  driverr.findElement(By.id("email")).sendKeys("sarron@gmail.com");
  
  
  
  


	}

}
