package PrototypeFactory.clase;

import java.util.ArrayList;

public class ContractCorporate extends AContract{
    public ContractCorporate() {
        System.out.println("Incarcare contract corporate din BD");
        listaClauze = new ArrayList<>();
        listaClauze.add("clauza 1 corporate");
        listaClauze.add("clauza 2 corporate");
        this.tip = "corporate";
    }


    @Override
    void printare() {
        System.out.println("Contract de tip " + this.tip);
    }
}
