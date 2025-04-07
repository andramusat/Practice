package EagerInitialization.clase;

import java.util.ArrayList;
import java.util.List;

public class Cuptor {
    private static Cuptor intance = new Cuptor();
    private List<Preparat> listaAsteptare;
    private int nrMaximGrade;

    private Cuptor() {
        this.nrMaximGrade = 270;
        this.listaAsteptare = new ArrayList<>();
    }

    public static Cuptor getInstance(){
        return intance;
    }

    public void addPreparat(Preparat p){
        if(p != null){
            if(p.getNrGradeGatire() > this.nrMaximGrade){
                System.out.println("Nu se poate prepara fiindca nu suporta atatea grade");
            } else {
                this.listaAsteptare.add(p);
            }
        } else {
            System.out.println("Adaugati un preparat valid");
        }
    }

    public void afisarePreparate(){
        for (Preparat p: listaAsteptare){
            System.out.println(p);
        }
    }
}
