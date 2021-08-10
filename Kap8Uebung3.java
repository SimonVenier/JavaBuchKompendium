package JavaBuch;

import java.util.HashMap;
import java.util.Map;

public class Kap8Uebung3 {

    public static void main(String[] args) {

        /*
         * Erstellen Sie eine Map, die das Alter Ihrer Freunde enthält. Der
         * Schlüsselbegriff soll dabei jeweils der Name sein. Geben Sie diese daraufhin
         * mit einer enhanced for-loop aus. Wenn wir diese Art von Schleife auf eine Map
         * anwenden, müssen wir als Datentyp für die entsprechende Variable
         * Map.Entry<Typ1, Typ2> verwenden – wobei Typ1 und Typ2 den Datentypen der Map
         * entsprechen. Die Map selbst können wir nicht direkt einfügen. Hierfür müssen
         * wir die entrySet()-Methode auf sie anwenden. Wenn wir die Map freunde nennen,
         * muss daher die Klammer für die forSchleife so aussehen: (Map.Entry<String,
         * Integer> name: freunde.entrySet()).
         */

        HashMap<String, Integer> freunde = new HashMap<>();

        freunde.put("Simon", 25);
        freunde.put("Florian", 23);

        for (Map.Entry<String, Integer> name : freunde.entrySet()) {
            System.out.println(name);
        }

    }

}
