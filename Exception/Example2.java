public class Example2 {
	public static void main(String[] args) {
		try{
			int a[] = new int[10];
		a[11] = 9;
		System.out.println(a);
		}catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("You have cross the limit of Array");
		}
	}
}