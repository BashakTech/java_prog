import java.util.Scanner;
public class WhileLoop {
	public static void main(String[] args) {

		boolean crossingroad = false;
		boolean goingtosleep = false;

		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();

		switch(i) {
			case 1: crossingroad=true;
			break;

			case 2: goingtosleep=true;
			break;

			default: 
			System.out.println("Invalid Input");
		}

		while(crossingroad==true) {
			System.out.println("Be conscious");
			break;
		}
		
		do{
			System.out.println("Turn off the light and shut the door");
			break;
		}
		while(goingtosleep==true);
	}
}