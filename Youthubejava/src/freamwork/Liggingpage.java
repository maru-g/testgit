package freamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Liggingpage {

	WebDriver driver;
	
	//input[@id='email']
	//input[@id='pass']
	
	By User= By.xpath("//input[@id='email']");
	By pass=By.xpath("//input[@id='pass']");
	
	By click=By.xpath("//input[@id='u_0_2']");
	
	
	
	
	public Liggingpage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	
	public void typeuser() {
		
		driver.findElement(User).sendKeys("user");
		
	}

	public void pass() {
		
		driver.findElement(pass).sendKeys("1234");
		
	}

	public void click() {
		
		driver.findElement(click).click();
		
	}
}
