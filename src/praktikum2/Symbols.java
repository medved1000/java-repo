package praktikum2;

public class Symbols {
	/**
	 * insert a Strings that
	 * @param c
	 * @param count
	 * @return
	 */
	public static String symbols(char c, int count) {
		String symbols = "";
		
		for (int i = 0; i < count; i++) {
			symbols += c;
		}
		return symbols;
	}

	public static void main(String[] args) {
		System.out.println(symbols('a', 3));
		System.out.println(symbols('b', 8));
		System.out.println(symbols('=', 80));
	}
}
