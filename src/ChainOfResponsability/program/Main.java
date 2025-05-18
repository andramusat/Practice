package ChainOfResponsability.program;

import ChainOfResponsability.clase.AHandler;
import ChainOfResponsability.clase.Bucatar;
import ChainOfResponsability.clase.Comanda;
import ChainOfResponsability.clase.Ospatar;

public class Main {
    public static void main(String[] args) {
        AHandler ospatar = new Ospatar();
        AHandler bucatar = new Bucatar();

        //setare lant de responsabili
        ospatar.setNextHandler(bucatar);

        Comanda comanda1 = new Comanda("Pizza", 2, 15);
        Comanda comanda2 = new Comanda("Bautura", 1, 3);
        Comanda comanda3 = new Comanda("Cafea", 1, 4);

        System.out.println("COMANDA 1");
        ospatar.procesareComanda(comanda1);

        System.out.println("COMANDA 2");
        ospatar.procesareComanda(comanda2);

        System.out.println("COMANDA 3");
        bucatar.procesareComanda(comanda3);
    }
}
