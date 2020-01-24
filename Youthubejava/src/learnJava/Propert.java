package learnJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		 String path = "C:\\Users\\kebed\\eclipse-workspace\\Youthubejava\\src\\learnJava\\test.properties";
			Properties dm = new Properties();
			
			FileInputStream fm = new FileInputStream(path);
			
			
			
		dm.load(fm);
		System.out.println(dm.getProperty("name"));
		System.out.println(dm.getProperty("lastname"));	
			
			
		
		

	}

}
