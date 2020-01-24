package learnJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class scaner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
//		for(int i =0 ; i <=3 ; i++) {
//		Scanner test = new Scanner(System.in);
//		System.out.println("whats you name: ");
//		String added = test.nextLine();
//		System.out.println(added);
	
		
		
		File file = new File("added.txt");
		FileReader kl = new FileReader(file);
		BufferedReader kj = new BufferedReader(kl);
		String ho = kj.readLine();
		
		System.out.println(ho);
		
//		Scanner toFile = new Scanner(file);
//		while(toFile.hasNextLine()) {
//		String to = toFile.nextLine();
//		System.out.println(to);
//		}
//		
//	
//		toFile.close();

}
	}

