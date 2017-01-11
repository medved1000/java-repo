package praktikum2;

public class RandomNumber {

	public static int random(int min, int max) {
		int diff = max - min;
		return min + (int) (Math.random() * diff);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (0 == i % 50) {
				System.out.println();
			}
			System.out.format("%3d", random(1, 3));
		}
	}

}
