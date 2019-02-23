public class AssignmentOperator {
	static int a = 10;
	public static void main(String[] args) {
		 int a, b, c, d;

		a = 10;
		b = 5;

		c = 15;
		d = 20;
		
		System.out.println("c++:" +(c++));
		System.out.println(c);
		System.out.println(d--);
		System.out.println(d);
		//System.out.println("++c:" +(++c));
		System.out.println("a-=b:" +(a-=b));
		System.out.println("a*=b:" +(a*=b));
		System.out.println("a/=b:" +(a/=b));
		System.out.println("a%=b:" +(a%=b));


	}
}