
public class Conjugation {
    String[] infinitive = {"Vivir", "Beber", "Comer", "Hablar", "Correr", "Leer"};
    String[] presentYo = {"Vivo", "Bebo", "Como", "Hablo", "Corro", "Leo"};
    String[] presentTu = {"Vives", "Bebes", "Comes", "Hablas", "Corres", "Lees"};
    String[] presentEl = {"Vive", "Bebe", "Come", "Habla", "Corre", "Lee"};
    String[] presentNos = {"Vivimos", "Bebemos", "Comemos", "Hablamos", "Corremos", "Leemos"};
    String[] presentEllos = {"Viven", "Beben", "Comen", "Hablan", "Corren", "Leen"};
    int choosePronoun = 0;
    int chosenPronoun = 0;
    
    public String getVerb() {
        int randomInfinitive = (int)(Math.random()*5)+1; //chooses random infinitive
        choosePronoun = randomInfinitive;
        if (choosePronoun == 1) {
            chosenPronoun = 1;
            return infinitive[choosePronoun] + ": Yo";
        }
        else if (choosePronoun == 2) {
            chosenPronoun = 2;
            return infinitive[randomInfinitive] + ": Tú";
        }
        else if (choosePronoun == 3) {
            chosenPronoun = 3;
            return infinitive[randomInfinitive] + ": Él/ella/usted";
        }
        else if (choosePronoun == 4) {
            chosenPronoun = 4;
            return infinitive[randomInfinitive] + ": Nosotros";
        }
        else {
            chosenPronoun = 5;
            return infinitive[randomInfinitive] + ": Ellos";
        }

        
    }

    public boolean check (String str) {
        if (choosePronoun == 1) {
            if (presentYo[choosePronoun].equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (choosePronoun == 2) {
            if (presentTu[choosePronoun].equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (choosePronoun == 3) {
            if (presentEl[choosePronoun].equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (choosePronoun == 4) {
            if (presentNos[choosePronoun].equalsIgnoreCase(str)) {
                return true;
            }
        }
        if (choosePronoun == 5) {
            if (presentEllos[choosePronoun].equalsIgnoreCase(str)) {
                return true;
            }
        }

        return false;
    }

    public void checkCurrent() {
        System.out.println(choosePronoun);
    }

}

