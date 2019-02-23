public class InttoStr {
	public static void main(String[] args) {
		int inum = 23;
		int inum2 = 73;
		char c = 'H';
		String str = Integer.toString(inum);	//concatenate
		String str1 = String.valueOf(inum2);
		String str2 = String.valueOf(c);

		System.out.println(str);
		System.out.println(str1);

		System.out.println(555 + str);
		System.out.println(555 + str1);
		System.out.println(555 + inum2);

		System.out.println(str2);
	}
}