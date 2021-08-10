package JavaBuch;

import java.util.Scanner;

class Kap7Uebung1 {

	public static void main(String[] args) {

		/*
		 * Schreiben Sie ein Programm, das den Anwender nach seinem Namen fragt. Geben
		 * Sie eine Begrüßung aus, wenn dieser den Namen „Paul“ eingibt. In allen
		 * anderen Fällen soll eine Nachricht erscheinen, dass der Zugriff nicht erlaubt
		 * ist.
		 */

		System.out.println("Bitte geben sie Ihren Namen ein: ");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		if (name.equals("Paul")) {
			System.out.println("Hallo " + name + "!");
		} else {
			System.out.println("Zugriff nicht erlaubt!!");
		}

	}

}