package s2.main;

import s2.factory.FactoryJucator;
import s2.factory.Jucator;
import s2.singleton.ListaMedicamenteInterzise;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Jucator jucator1 = FactoryJucator.creeazaJucator("portar");
        jucator1.setNume("Mihai");

        Jucator jucator2 = FactoryJucator.creeazaJucator("atacant");
        jucator2.setNume("Ionut");

        jucator1.setAntrenamente(Arrays.asList("Antrenament 1", "Antrenamnet 2"));
        jucator2.setAntrenamente(Arrays.asList("Antrenament A", "Antrenamnet B"));

        jucator1.testeazaAntiDoping();
        jucator2.testeazaAntiDoping();

        ListaMedicamenteInterzise.getInstance().adaugaMedicament("Medicament X");

        jucator1.testeazaAntiDoping();
        jucator2.testeazaAntiDoping();

        jucator1.setAntrenamente(Arrays.asList("Antrenament 3", "Antrenament 4"));
    }
}
