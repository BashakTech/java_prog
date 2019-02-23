import java.util.Scanner;
public class OpCalc {
	public static void main(String[] args) {
		double a, b, result;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter First Number: ");
		a = in.nextDouble();

		System.out.println("Enter Second Number: ");
		b = in.nextDouble();

		System.out.println("Enter an Operator(+,-,*,/)");
		char op=in.next().charAt(0);
		in.close();

		switch(op){
			case '+':
				result= a+b;
				break;

			case '-':
				result = a-b;
				break;

			case '*':
				result = a*b;
				break;

			case '/':
				result = a/b;
				break;

			default:
				System.out.println("You have entered a wrong Operator");
				return;
		}
		System.out.println("Number 1 " +op+ " Number 2 = " +result);
	}
}