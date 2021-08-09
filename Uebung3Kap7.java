package JavaBuch;

import java.util.Scanner;

public class Uebung3Kap7 {

    public static void main(String[] args) {

        /*
         * Schreiben Sie ein Programm, das vom Anwender eine Zahl zwischen 1 und 12
         * abfragt. Daraufhin soll es den Namen des Monats ausgeben, der bei einer
         * Datumsangabe für den entsprechenden Wert steht. Sie können für die Umsetzung
         * entweder eine Struktur mit else if oder mit switch auswählen.
         */

        System.out.println("Geben Sie eine Zahlt zwischen 1-12 ein: ");

        Scanner sc = new Scanner(System.in);
        int zahl = sc.nextInt();

        if (zahl == 1) {
            System.out.println("Jannuar");
        } else if (zahl == 2) {
            System.out.println("Februar");
        } else if (zahl == 3) {
            System.out.println("März");
        } else if (zahl == 4) {
            System.out.println("April");
        } else if (zahl == 5) {
            System.out.println("Mai");
        } else if (zahl == 6) {
            System.out.println("Juni");
        } else if (zahl == 7) {
            System.out.println("Juli");
        } else if (zahl == 8) {
            System.out.println("August");
        } else if (zahl == 9) {
            System.out.println("September");
        } else if (zahl == 10) {
            System.out.println("Oktober");
        } else if (zahl == 11) {
            System.out.println("November");
        } else if (zahl == 12) {
            System.out.println("Dezember");
        } else {
            System.out.println("Sie haben leider eine Falsche Zahl eingegeben!");
        }

    }

}
