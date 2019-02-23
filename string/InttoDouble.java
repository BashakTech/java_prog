public class InttoDouble {
	public static void main(String[] args) {
		String str = "123";
		double dnum = Double.parseDouble(str);
		double dnum1 = Double.valueOf(str);
		double dnum2 = new Double(str);

		System.out.println(dnum);
		System.out.println(dnum1);
		System.out.println(dnum2);
	}
}