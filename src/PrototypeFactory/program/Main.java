package PrototypeFactory.program;

import PrototypeFactory.clase.AContract;
import PrototypeFactory.clase.PrototypeFactory;

public class Main {
    public static void main(String[] args) {
        AContract contractParty1 = PrototypeFactory.getPrototipuriContract("party");
        if(contractParty1 != null){
            contractParty1.setId("COO1");
            System.out.println(contractParty1);
        }

        contractParty1.modificaClauze(1, "New");
        System.out.println(contractParty1);

        AContract contractParty2 = PrototypeFactory.getPrototipuriContract("party");
        if (contractParty2 != null){
            contractParty2.setId("4");
            System.out.println(contractParty2);
        }

        //testare shallow-copy cu Prototype
        System.out.println("Testare shallow-copy cu Prototype:");
        if(contractParty1.getListaClauze() == contractParty2.getListaClauze()){
            System.out.println("Aceleasi clauze contractuale.");
        } else {
            System.out.println("Referinte la obiecte diferite.");
        }
    }
}
