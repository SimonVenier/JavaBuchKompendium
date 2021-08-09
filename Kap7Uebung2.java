package JavaBuch;

import java.util.Scanner;

public class Uebung2Kap7 {

    public static void main(String[] args) {

        /*
         * Da der Anwender etwas bequem ist, gibt er seinen Namen nicht immer mit einem
         * Großbuchstaben ein. Sorgen Sie dafür, dass das Programm auch die Eingabe
         * „paul“ akzeptiert. Außerdem soll es ein Passwort abfragen. Nur wenn beide
         * Werte stimmen, soll das Programm die Begrüßung ausgeben.
         */

        System.out.println("Geben sie bitte Ihren Namen und passwort ein: ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();

        if (name.equals("Paul") || name.equals("paul") && password.equals("123")) {
            System.out.println("Hallo und herzlich wilkommen!");
        } else {
            System.out.println("Zugriff nicht erlaubt!!");
        }

    }

}
