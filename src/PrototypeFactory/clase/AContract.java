package PrototypeFactory.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract class AContract implements Cloneable{
    private String id;
    protected String tip;
    protected ArrayList<String> listaClauze;

    public void modificaClauze(int i, String clauzaNoua){
        listaClauze.set(i, clauzaNoua);
    }

    abstract void printare();

    public void setId(String id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public ArrayList<String> getListaClauze() {
        return listaClauze;
    }

    @Override
    public String toString() {
        return "AContract{" +
                "id='" + id + '\'' +
                ", tip='" + tip + '\'' +
                ", listaClauze=" + listaClauze +
                '}';
    }

    public AContract clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return (AContract) clone;
    }

}
