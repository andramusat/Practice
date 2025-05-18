package Facade.clase;

public class Facade {
    public static boolean verificaDisponibilitateBucatari(int nrBucatari, String data){
        GestiuneBucatari bucatari = new GestiuneBucatari();
        int ct=0;
        for (int i = 0; i < bucatari.getNrBucatari(); i++) {
            if(bucatari.getBucatar(i).verificaDisponibilitate(data)){
                ct++;
            }
        }
        if(ct>=nrBucatari){
            return true;
        }
        return false;
    }

    public static boolean verificaDisponibilitateSala(String data){
        GestiuneSali sali = new GestiuneSali();
        sali.addSala(new Sala("Sala A", 10, 100));
        sali.addSala(new Sala("Sala B", 5, 50));
        sali.addSala(new Sala("Sala C", 20, 200));

        for (int i = 0; i < sali.getNrSali(); i++) {
            if (sali.getSala(i).verificaDisponibilitate(data)) {
                return true;
            }
        }
        return false;
    }
}
