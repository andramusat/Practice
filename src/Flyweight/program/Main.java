package Flyweight.program;

import Flyweight.clase.Bon;
import Flyweight.clase.ETipPrintare;
import Flyweight.clase.MesajPrintareFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ETipPrintare[] tipuri = ETipPrintare.values();
        Random random = new Random();

        for (int i = 0; i < 25; i++) {
            Bon bon = new Bon(10+i, 410+i);
            ETipPrintare tip = tipuri[random.nextInt(tipuri.length)];
            MesajPrintareFactory.getMesajPrintare(tip).printareBon(bon);
        }
        System.out.println(MesajPrintareFactory.getNrBonuriPrintate() + " bonuri printate");
        System.out.println(MesajPrintareFactory.getNrMatriteBonuri() + " matrite bonuri folosite");
    }
}
