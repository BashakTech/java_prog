import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n = in.nextInt();

		if(n%2==0) {
			System.out.println("The Number " +n+ " is Even");
		}
		else{
			System.out.println("The Number " +n+ " is Odd");
		}
	}
}
