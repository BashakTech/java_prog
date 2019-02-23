import java.util.Scanner;
public class ElseIf {
	public static void main(String[] args) {
		int a, b, c;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter value a is: ");
		a = in.nextInt();

		System.out.println("Enter value b is: ");
		b = in.nextInt();

		System.out.println("Enter value c is: ");
		c = in.nextInt();

		if(a>b && a>c) {
			System.out.println("a is big");
		}

		else if(b>a && b>c) {
			System.out.println("b is big");
		}

		else {
			System.out.println("c is big");
		}
	}
}