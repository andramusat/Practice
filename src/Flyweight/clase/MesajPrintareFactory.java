package Flyweight.clase;

import java.util.HashMap;

public class MesajPrintareFactory {
    private static HashMap<ETipPrintare, MesajPrintare> listaMesaje = new HashMap<>();
    private static int nrBonuriPrintate = 0;

    public static MesajPrintare getMesajPrintare(ETipPrintare tipPrintare){
        nrBonuriPrintate++;
        MesajPrintare mesajPrintare = listaMesaje.get(tipPrintare);
        if(mesajPrintare==null){
            mesajPrintare=new MesajPrintare(tipPrintare);
            listaMesaje.put(tipPrintare, mesajPrintare);
        }
        return mesajPrintare;
    }

    public static int getNrBonuriPrintate() {
        return nrBonuriPrintate;
    }
    public static int getNrMatriteBonuri(){
        return listaMesaje.size();
    }
}
