import java.util.*;
public class GregorianCalendarDemo {
	public static void main(String[] args) {
		String months[] = {"Jan", "Feb", "mar", "Apr", "may", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int year;
		GregorianCalendar gcal = new GregorianCalendar();
		System.out.print("Date: ");
		System.out.print(months[gcal.get(Calendar.MONTH)]);
		System.out.print(" " +gcal.get(Calendar.DATE) + " ");
		System.out.println(gcal.get(Calendar.YEAR));

		System.out.print("Time: ");
		System.out.print(gcal.get(Calendar.HOUR)+":");
		System.out.print(gcal.get(Calendar.MINUTE)+":");
		System.out.println(gcal.get(Calendar.SECOND));

		if(gcal.isLeapYear(year=gcal.get(Calendar.YEAR))) {
			System.out.println("The current year is a leap year");
		}
		else {
			System.out.println("The current year is not a leap year");
		}
		
	}
}