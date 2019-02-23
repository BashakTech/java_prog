import java.util.Scanner;
public class Nested {
	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 10 to 100");
		a = in.nextInt();
		if(a>9) {
			if(a<100){
				System.out.println("This is a two digit number");
			}
			else
			System.out.println("The number is bigger than 100");
		}
		else
		System.out.println("The number is less than 10");
	}
}