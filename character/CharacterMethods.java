public class CharacterMethods {
	public static void main(String[] args) {
		System.out.println("is letter method");
		System.out.println(Character.isLetter('Z'));
		System.out.println(Character.isLetter('4'));
		System.out.println(Character.isLetter('@'));

		System.out.println("is digit method");
		
		System.out.println(Character.isDigit('Z'));
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('#'));

		System.out.println("is whitespace method");
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\t'));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('a'));

		System.out.println("is uppercase");
		System.out.println(Character.isUpperCase('A'));
		System.out.println(Character.isUpperCase('a'));

		System.out.println("is LowerCase");
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('C'));

		System.out.println("toLowerCase");
		
		System.out.println(Character.toLowerCase('Z'));
		System.out.println(Character.toLowerCase('\t'));
		System.out.println(Character.toLowerCase('z'));

		System.out.println("toUpperCase");
		System.out.println(Character.toUpperCase('s'));
		System.out.println(Character.toUpperCase('\n'));
		System.out.println(Character.toUpperCase('2'));

		System.out.println();
		System.out.println("toString");
		System.out.println(Character.toString('a'));
	}
}