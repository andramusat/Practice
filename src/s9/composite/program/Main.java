package s9.composite.program;

import s9.composite.clase.INod;
import s9.composite.clase.Item;
import s9.composite.clase.NodStructura;

public class Main {
    public static void main(String[] args) {
        INod meniu = new NodStructura("Meniu nr 2");
        INod nod1 = new NodStructura("aperitiv");
        INod nod2 = new NodStructura("desert");

        INod nod3 = new Item("rulou cascaval", 150, false);
        INod nod4 = new Item("friptura", 340, true);
        INod nod5 = new Item("piure", 530, true);
        INod nod6 = new Item("tort", 520, true);

        meniu.addNod(nod1);
        meniu.addNod(nod2);
        nod1.addNod(nod3);
        nod1.addNod(nod4);
        nod1.addNod(nod5);
        nod2.addNod(nod6);

        System.out.println(meniu.getNumarCalorii());
        System.out.println(meniu.isVegan());

    }
}
