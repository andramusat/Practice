package s9.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class NodStructura implements INod{
    private String label;
    private List<INod> listaFii = new ArrayList<>();

    public NodStructura(String label) {
        this.label = label;
        this.listaFii = new ArrayList<>();
    }

    @Override
    public float getNumarCalorii() {
        int totalClorii = 0;
        for(INod nod:listaFii){
            totalClorii += nod.getNumarCalorii();
        }
        return totalClorii;
    }

    @Override
    public boolean isVegan() {
        for(INod nod: listaFii){
            if(!nod.isVegan()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void addNod(INod nod) {
        listaFii.add(nod);
    }

    @Override
    public INod getNod(int index) {
        return listaFii.get(index);
    }

    @Override
    public void removeNod(INod nod) {
        listaFii.remove(nod);
    }
}
