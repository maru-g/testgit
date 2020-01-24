import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\kebed\\Documents\\chromedriver.exe");
		
		WebDriver driverr= new ChromeDriver();
	driverr.get("http://www.makemytrip.com/");
	Thread.sleep(2000);
	
	/*WebElement source=driverr.findElement(by);
	source.click();
	source.sendKeys("MUM");
	Thread.sleep(2000);
	source.sendKeys(Keys.ENTER);
	
	
	
	
	
	WebElement destination=driverr.findElement(By.id("hp-widget__sTo"));
	destination.clear();
	destination.sendKeys("DEL");
	Thread.sleep(2000);
	
	for(int i=1;i<5;i++)
	
		
	{
	destination.sendKeys(Keys.ARROW_DOWN);
	}
		
	
	destination.sendKeys(Keys.ENTER);*/
	
	
	driverr.findElement(By.id("fromCity")).click();
	Thread.sleep(3000);
	
	
	//react-autosuggest__input react-autosuggest__input--open
	//react-autosuggest__input react-autosuggest__input--open
	
	
	WebElement ww = driverr.findElement(By.id("fromCity"));
	
	
	System.out.print("hi");
	System.out.print(ww.getText());
			
		//	ww.sendKeys("mum");
	
	
	String s = "";
	
	
	
	
	
	
	
}
	
	
	
}
	
