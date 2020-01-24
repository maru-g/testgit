package iamita_udaym;

public class Human {
	
	
	
	String name;
	int age;
	int pound;
	
	public Human(String name, int age, int pound, String nationality) {
		super();
		this.name = name;
		this.age = age;
		this.pound = pound;
		this.nationality = nationality;
	}
	String nationality;
	
	
	
	
	public void spick() {
		System.out.println("my name is " + name);
		
		System.out.println("my age is " + age);
		System.out.println("my country " + nationality);
		
		}
	public void eat() {
		System.out.println("i eat ,,");
	}

}
