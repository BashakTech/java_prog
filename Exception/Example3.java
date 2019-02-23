public class Example3 {
	public static void main(String[] args) {
		try{
			int num = Integer.parseInt("XYZ");
		System.out.println("Result: "+num);
		}catch(NumberFormatException obj)
		{
			System.out.println("NumberFormatException occured");
		}
	}
}