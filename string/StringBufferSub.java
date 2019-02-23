public class StringBufferSub {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This is a String");
		String sbstr = sb.substring(6);
		String sbstr2 = sb.substring(5,16);

		System.out.println(sbstr);
		System.out.println(sbstr2);
	}
}