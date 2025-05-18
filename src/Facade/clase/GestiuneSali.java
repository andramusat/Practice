package Facade.clase;

import java.util.ArrayList;

public class GestiuneSali {
    private ArrayList<Sala> listaSali;
    public GestiuneSali(){
        this.listaSali=new ArrayList<>();
    }
    public void addSala(Sala s){
        this.listaSali.add(s);
    }
    public Sala getSala(int i){
        return this.listaSali.get(i);
    }
    public int getNrSali(){
        return this.listaSali.size();
    }
}
