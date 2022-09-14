package assignment5;

public class Vowel {

	void VowelOrConsonant(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("character " + ch + " is  Vowel");
		} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
			System.out.println("character " + ch + " is Consonent");
		else
			System.out.println("Not an alphabet");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vowel v = new Vowel();
		v.VowelOrConsonant('B');
		v.VowelOrConsonant('U');
		v.VowelOrConsonant('4');
	}

}
