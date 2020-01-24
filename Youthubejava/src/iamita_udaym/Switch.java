package iamita_udaym;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int day= 3;
		String  month ;
		
		switch(day) {
		case 1: month="jan";
		
		break;
		case 2: month= "feb";
		break;
		case 3: month=  "mar";
		break;
		default:month = "we dont know";
	
		}
		System.out.println(month);
	}

}
