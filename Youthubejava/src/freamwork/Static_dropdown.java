package freamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver" , "C:\\Users\\kebed\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		
		WebDriver driverr= new ChromeDriver();
		driverr.manage().window().maximize();
		driverr.get("https://www.spicejet.com/");	
		Select s = new Select(driverr.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
	}

}
