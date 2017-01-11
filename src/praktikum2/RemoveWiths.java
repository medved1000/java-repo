package praktikum2;

import org.omg.CORBA.PUBLIC_MEMBER;

import lib.TextIO;

public class RemoveWithS {

	public static String removeWithS(String input) {
		return removeWords(input, word -> word.toLowerCase().contains("s"));
	}
	
	public static String removeWords(String input, Predicate<String> tester) {
		StringBuilder result = new StringBuilder();

		String[] words = input.split(" ");
		for (String word : words) {
			if (!tester.test(word)) {
				result.append(word + " ");
			}
		}
		return result.toString().trim();
	}

	public static void main(String[] args) {

		System.out.println(removeWithS("One two three seven eight"));
		System.out.println(removeWithS("aias sadas saia! tegelt ka!"));
		System.out.println(removeWords(TextIO.getlnString(), word -> word.length() > 5));

	}

}
