package praktikum1;

import lib.TextIO;

public class Korrutis {
	public static void main(String[] args) {
        System.out.println("Sisesta arv");
        int arv1 = TextIO.getlnInt();
        int arv2 = TextIO.getlnInt();
        
        int korrutis = arv1 * arv2;
        System.out.println("Arvude " + arv1 + " ja " + arv2 + " korrutis on " + korrutis + ".");
    }
}
