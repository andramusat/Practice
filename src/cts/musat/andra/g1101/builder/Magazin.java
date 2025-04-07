package cts.musat.andra.g1101.builder;

import java.util.List;

public class Magazin {
    private String denumire;
    private int suprafata;
    private int nrIntrari;
    private Podea podea;
    private List<Decoratiune> decoratiuni;

    public Magazin(String denumire, int suprafata, int nrIntrari, Podea podea, List<Decoratiune> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podea = podea;
        this.decoratiuni = decoratiuni;
    }

    public void afisareInfo(){
        System.out.println("Magazin: " + denumire + ", Suprafata: " + suprafata + "mp, Intrari: " +nrIntrari);
        if(podea != null){
            System.out.println("Podea personalizata " + podea.getTip() + " (duritate: " + podea.getDuritate() +")");
        } else {
            System.out.println("Podea standard.");
        }
        if(decoratiuni != null && !decoratiuni.isEmpty()){
            System.out.println("Decoratiuni: ");
            for(Decoratiune d: decoratiuni){
                System.out.println("- " + d.getTip() + " din " + d.getMaterial());
            }
        } else {
            System.out.println("Fara decoratiuni.");
        }
        System.out.println("Grad incendiu estimat: " + calculGradIncendiu());
        System.out.println("---------------------------------------------");
    }

//calculGradIncediu() returneaza o valoare după o regulă de calcul astfel încât să se țină cont
//de duritatea podelei personalizate adăugată și de materialele decorațiunilor;

    public double calculGradIncendiu(){
        double grad = (podea != null ? podea.getDuritate() : 5.0);
        for (Decoratiune d: decoratiuni){
            switch (d.getMaterial().toLowerCase()){
                case "lemn" -> grad +=2;
                case "plastic" -> grad +=1;
                case "sticla" -> grad +=0.5;
            }
        }
        return grad;
    }
}
