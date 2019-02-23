import java.util.Scanner;
public class Decision2 {
	public static void main(String[] args) {
		double x;
		Scanner df = new Scanner(System.in);
		System.out.println("Input a number: ");
		x = df.nextDouble();
		if(x>0) {
			System.out.println("number is positive");
			System.out.println("negative value is: "+(x*(-1)));
		}
		else{
			System.out.println("Number is negative");
			System.out.println("The positive value is:"+(x*(-1)));
		}
	}
}