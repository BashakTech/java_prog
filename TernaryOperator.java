import java.util.Scanner;
public class TernaryOperator {
	public static void main(String [] args) {
		int a , b, c;

		int temp, result;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		a = sc.nextInt();
		System.out.println("Enter your second number: ");
		b = sc.nextInt();
		System.out.println("Enter your third number: ");
		c = sc.nextInt();


		temp = (a>b)? a:b;
		result = (c>temp)? c:temp;

		System.out.println("The max of three number is:"+result);
	}
}