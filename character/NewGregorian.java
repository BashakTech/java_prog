import java.util.*;
import java.text.*;
public class NewGregorian {
	public static void main(String[] args) {
		//Date date = new Date();
		//SimpleDateFormat st = new SimpleDateFormat();
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
		GregorianCalendar gcal = new GregorianCalendar();
		int year;
		System.out.print("Date: ");
		//System.out.print(months[gcal.get(Calendar.MONTH)]);
		System.out.print(gcal.get(Calendar.DATE));
		System.out.print("__" +gcal.get(Calendar.MONTH));
		System.out.println("__" +gcal.get(Calendar.YEAR));

		System.out.print("Time: ");
		System.out.print(gcal.get(Calendar.HOUR)+":");
		System.out.print(gcal.get(Calendar.MINUTE)+":");
		System.out.println(gcal.get(Calendar.SECOND));
	}
}