import java.util.Calendar;
import java.util.Date;

public class datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d =new Date ();
		
		
		System.out.println(d.toString());
		
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}

}
