package learnJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helloworld {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kebed\\Downloads\\selenium-java-3.141.59\\libs\\chromedriver.exe");
		
WebDriver driver= new ChromeDriver();
driver.get("http://facebook.com");
//input[@id='email']
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("marron");

driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("1234");
 WebElement me =  driver.findElement(By.xpath("//label[@for='email']"));
 System.out.println(me.getText());

//td[@class='html7magic']
	}

}
