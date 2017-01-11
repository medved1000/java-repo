package praktikum1;

import lib.TextIO;

public class PaarisPaaritu {
	public static void main(String[] args) {
		System.out.println("Seisesta arv");
		int arv = TextIO.getlnInt();
		if (0 == arv % 2) {
			System.out.println("paaris");
		}
		else {
		System.out.println("paaritu.");	
		}
		System.out.println(".");
	}

}
