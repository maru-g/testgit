package iamita_udaym;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String a = "hello";
//		
//		a.substring(2, 5);
//		
//		System.out.println(a.substring(2, 5));
//		System.out.println(a.length());
		
		String ser= "my name is marron: cat " + "faverit andimal marron: dog and i still marron: sheep";
		geting(ser);
		
	}

	
	public static void geting(String ser) {
		int i =0;
		while(true) {
			int be =ser.indexOf("marron:", i);
			if(be==-1)break;
			int star = be +8;
			int me = ser.indexOf(" ", star);
			//ser.substring(star, me);
			System.out.println(ser.substring(star, me));
			i = me+1;
			
		}
	
		
		
		
		
	}
	
	
	
	
}
