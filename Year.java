import java.util.Scanner;
public class Year {
	public static void main(String[] args) {
		int year;
		Scanner m = new Scanner(System.in);
		System.out.println("Enter a year: ");
		year = m.nextInt();
		if(year%4==0) {
			System.out.println(+year+ " is leap year");
		}
		else{
			System.out.println(+year+ " is not leap year");
		}
	}
}