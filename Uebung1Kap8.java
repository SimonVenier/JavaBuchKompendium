package JavaBuch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Uebung1Kap8 {

    public static void main(String[] args) {

        /*
         * Erstellen Sie ein Programm, das den Anwender in einer Schleife dazu
         * auffordert, einen Namen einzugeben. Fügen Sie diesen in eine Liste ein, die
         * Sie bereits vor dem Beginn der Schleife deklarieren. Fragen Sie den Anwender
         * anschließend, ob er einen weiteren Eintrag vornehmen will. Fordern Sie ihn
         * dabei dazu auf, den Buchstaben j oder n einzugeben. Die Bedingung der
         * Schleife soll diesen Buchstaben verwenden. Überlegen Sie sich, welche Art von
         * Schleife hierfür sinnvoll ist. Geben Sie abschließend die Liste zur
         * Überprüfung aus. Hierfür ist es nicht notwendig, eine weitere Schleife zu
         * verwenden.
         */

        ArrayList<String> Anwender = new ArrayList<>();

        String weiter;

        do {

            System.out.println("Geben sie einen Namen ein: ");
            Scanner sc = new Scanner(System.in);
            String eingabe = sc.nextLine();

            System.out.println("Möchten sie einen weiteren Namen eingeben: j (ja) oder n (nein)");
            weiter = sc.nextLine();

            Anwender.add(eingabe);

        } while (weiter.equals("j"));

        System.out.println("Die Namenliste ausgeben: " + Anwender);

    }

}
