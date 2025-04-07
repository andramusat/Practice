package s2.singleton;

import java.util.ArrayList;
import java.util.List;

public class ListaMedicamenteInterzise {
    //eager initialization
    private static ListaMedicamenteInterzise instance = new ListaMedicamenteInterzise();
    private List<String> medicamenteInterzise = new ArrayList<>();

    private ListaMedicamenteInterzise(){

    }

    public static ListaMedicamenteInterzise getInstance(){
        return instance;
    }

    public void adaugaMedicament(String medicament){
        medicamenteInterzise.add(medicament);
        System.out.println("Medicamentul " + medicament + " a fost adaugat la lista de medicamente interzise.");
    }

    public List<String> getMedicamenteInterzise() {
        return medicamenteInterzise;
    }
}
