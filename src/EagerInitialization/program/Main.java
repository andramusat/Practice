package EagerInitialization.program;

import EagerInitialization.clase.Cuptor;
import EagerInitialization.clase.Preparat;

public class Main {
    public static void main(String[] args) {
        Cuptor cuptor = Cuptor.getInstance();

        cuptor.addPreparat(new Preparat("Paste", 170, 20));
        cuptor.addPreparat(new Preparat("Friptura", 220, 10));
        cuptor.addPreparat(new Preparat("Pizza", 280, 8));

        cuptor.afisarePreparate();
    }
}
