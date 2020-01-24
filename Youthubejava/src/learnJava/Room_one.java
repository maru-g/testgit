package learnJava;

public class Room_one {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

String  sr = "love";
		//String sr = new String("love");
		System.out.println(sr.charAt(3));
		//sr.indexOf(4)
		System.out.println(sr.indexOf('3'));
		System.out.println("hello");
		
		
		
		String s = "kebede";
		String d = " ";
		for( int  i=s.length()-1; i>=0 ; i--) 
		{
			System.out.println(s.charAt(i));
			//d = d+ s.charAt(i);
		}
		System.out.println(d);
		
	}

}
