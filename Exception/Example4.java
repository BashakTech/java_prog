public class Example4 {
	public static void main(String[] args) {
		try{
			String str = "SciFiSoft";
		System.out.println("String length: "+str.length());
		char c = str.charAt(0);
		c = str.charAt(40);
		System.out.println(c);
		}catch(StringIndexOutOfBoundsException r)
		{
			System.out.println("StringIndexOutOfBoundsException occured");
		}

		
		try{
			String str2 = null;
		System.out.println(str2.length());
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}