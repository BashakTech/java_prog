import java.util.Scanner;
public class Decision {
	public static void main(String[] args) {
		int a, b;
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		a = obj.nextInt();
		System.out.println("Enter Second Number: ");
		b = obj.nextInt();

		if(a>b) {
			System.out.println("First Number is Bigger");
		}
		else{
			System.out.println("Second Number is Bigger");
		}
	}
}