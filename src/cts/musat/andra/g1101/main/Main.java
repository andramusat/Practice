package cts.musat.andra.g1101.main;

import cts.musat.andra.g1101.builder.*;

public class Main {
    public static void main(String[] args) {
//Să se testeze soluția prin înregistrarea unui număr de minim trei magazine în cadrul mall-ului din
//care cel puțin unul are o podea personalizată și un set de decorațiuni la alegere.
        try {
            IMagazinBuilder builder1 = new MagazinBuilder("FashionX", 300);
            Magazin magazin1 = builder1
                    .setNrIntrari(3)
                    .adaugaDecoratiune(new Decoratiune("Vitrina", "Sticla"))
                    .build();
            magazin1.afisareInfo();
        } catch (ExceptieValidare e) {
            System.out.println("Eroare la magazinul FashionX: " + e.getMessage());
        }

        try {
            IMagazinBuilder builder2 = new MagazinBuilder("TechZone", 250);
            Magazin magazin2 = builder2
                    .setNrIntrari(3)
                    .setPodea(new Podea("Parchet", 3.5))
                    .adaugaDecoratiune(new Decoratiune("Stand telefoane", "Plastic"))
                    .adaugaDecoratiune(new Decoratiune("Corp iluminat", "Metal"))
                    .build();
            magazin2.afisareInfo();
        } catch (ExceptieValidare e) {
            System.out.println("Eroare la magazinul TechZone: " + e.getMessage());
        }

        try {
            IMagazinBuilder builder3 = new MagazinBuilder("FlowerLand", 120);
            Magazin magazin3 = builder3
                    .setPodea(new Podea("Mocheta", 1.5))
                    .adaugaDecoratiune(new Decoratiune("Ghivece", "Ceramica"))
                    .setNrIntrari(2)
                    .build();
            magazin3.afisareInfo();
        } catch (ExceptieValidare e) {
            System.out.println("Eroare la magazinul FlowerLand: " + e.getMessage());
        }
    }
}
