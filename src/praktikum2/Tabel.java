package praktikum2;

public class Tabel {
	public static void main(String[] args) {
		int size = 10;
		int base = 10;

		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < size; col++) {
				int number = (col + row) % base;
				System.out.format("%2d", number);
			}

			System.out.println();

		}

	}
}
