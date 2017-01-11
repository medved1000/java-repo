package praktikum2;

public class OnePlus {
	public static void main(String[] args) {
		int number = Input.userInput(30);
		for (int i = 0; i <= number; i++) {
			String spaces = Symbols.symbols(' ', (number - i) * 2);
			System.out.format("%s%d\n", spaces, i);
		}
	}

}
