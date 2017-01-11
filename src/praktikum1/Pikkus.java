package praktikum1;

import lib.TextIO;

public class Pikkus {

	public static void main(String[] args) {
		System.out.println("insert name");
		String name = TextIO.getlnString();
		int lenght = "name".length();
		System.out.format("Sinu nimes (%s) o %d tahemarki.", name.trim() name.replaceAll("\\W",  " ").length());
		
		System.out.println(lenght);
	}
}
