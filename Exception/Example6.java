public class Example6{
	int division(int a, int b) throws ArithmeticException{
		int t = a/b;
		return 0;
	}
	public static void main(String[] args) {
		Example6 obj = new Example6();
		try{
			System.out.println(obj.division(15,0));
		}catch(ArithmeticException e)
		{
			System.out.println("You shouln't devide a number by 0");
		}
	}
}