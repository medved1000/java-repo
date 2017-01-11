package praktikum1;

import lib.TextIO;

public class Ai {
	public static void main(String[] args) {
		System.out.println("Insert two ages");
		int age1 = TextIO.getInt();
		int age2 = TextIO.getInt();
		int diff = Math.abs(age1 - age2);
		
		
		if (diff < 5){
			System.out.println("OK");
		}
		
		else if (diff <= 10) {
			System.out.println("not to bad");
		}
		else {
			System.out.println("not too good");
		}
	}

}
