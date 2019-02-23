public class Example5 {
	void checkAge(int age){
		if(age< 18){
			throw new ArithmeticException("Not Eligible for voting");
		}
		else{
			System.out.println("Eligible for voting");
		}
	}
	public static void main(String[] args) {
		Example5 obj = new Example5();
		obj.checkAge(13);
		System.out.println("End of Program");
	}
}