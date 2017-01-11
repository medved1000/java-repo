package praktikum2;

import java.util.ArrayList;

import lib.TextIO;

public class Massiiv {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Insert some numbers (zero to end):");
		for (int i = 0; i < 10; i++) {
			int number = TextIO.getlnInt();
			if (number < 1) {
				break;
			}
			numbers.add(0, number);
		}
		System.out.println("you inserted:");
		for (int i = numbers.size()-1; i >= numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
	}

}
