public class Mathmetical {
	public static void main(String[] args) {
		double x = 4.5;
		double y = 4.6;
		double z = 4.2;

		Integer a = 3;

		double m =30;


		System.out.println(Math.rint(x));
		System.out.println(Math.rint(y));
		System.out.println(Math.rint(z));
		System.out.println();
		System.out.println(Math.abs(x));
		System.out.println(Math.abs(y));
		System.out.println(Math.abs(z));
		System.out.println();
		System.out.println(Math.ceil(x));
		System.out.println(Math.ceil(y));
		System.out.println(Math.ceil(z));
		System.out.println();
		System.out.println(Math.floor(x));
		System.out.println(Math.floor(y));
		System.out.println(Math.floor(z));

		System.out.println(Math.sqrt(a));
		System.out.println(Math.pow(a,2));
		System.out.println(Math.round(z));

		//minumum max

		System.out.println(Math.min(x,y));
		System.out.println(Math.min(x,z));
		System.out.println(Math.max(x,y));

		System.out.println();
		
		//logarithm
		System.out.println(Math.exp(x));
		System.out.println(Math.log(x));
		System.out.println(Math.exp(a));
		System.out.println(Math.log(a));

		//degree
		System.out.println(Math.toDegrees(m));

		//random
		System.out.println(Math.random());
	}
}