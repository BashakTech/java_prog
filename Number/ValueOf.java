public class ValueOf {
	public static void main(String[] args) {
		Integer x = Integer.valueOf(12);
		Double y = Double.valueOf(45);
		Float z = Float.valueOf(23);

		Integer a = Integer.valueOf("476", 12);

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		System.out.println(a);
	}
}