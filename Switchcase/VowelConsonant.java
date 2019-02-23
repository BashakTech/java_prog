import java.util.Scanner;
public class VowelConsonant {
	public static void main(String[] args) {
		boolean isVowel=false;
		char ch;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter an Alphabet: ");
		ch = obj.next().charAt(0);// character input system
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isVowel=true;

		}
		if(isVowel==true){
			System.out.println("The character "+ch+ " is a vowel");
		}
		else if(ch> 'A'&& ch<'Z'||ch>'a'&&ch<'z'){
			System.out.println("The character "+ch+ " is a consonant");
		}
		else 
			System.out.println(ch+ " This is not an Alphabet");
	}
}