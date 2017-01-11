package praktikum2;

import lib.TextIO;

public class Input2 {
	public static int userInput(int max) {
		return userInput(1, max);
	}
	
	/**
	 * Asks user for numerical input, and only accepts
	 * input between given minimum and maximum
	 * 
	 * @param min
	 * @param max
	 * @return User inserted number that fulfilled the condition
	 */
	public static int userInput(int min, int max) {
		String question = String.format("Please insert a number from %d to %d: ", min, max);
		return userInput(question, min, max);
	}
	
	
	public static int userInput(String question, int min, int max) {
		while (true) {
			System.out.println(question);
			int input = TextIO.getlnInt();
			
			if (min <= input && input <= max) {
				return input;
			}
			System.out.println("Inserted number is not in range, try again.");
		}
	}
	
	public static void main(String[] args) {
		int input = userInput("Are you sure (1 == yes, 0 == no)", 1, 0);
		System.out.format("Inserted %d", input);
	}
	
}
