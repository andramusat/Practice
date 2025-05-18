package Adapter.program;

import Adapter.clase.*;

public class Main {
    public static void main(String[] args) {
        //COMPANIA A
        IEvaluareClientFirmaA evaluareA = new EvaluareClientFirmaA();
        evaluareA.analizaClientFirmaA(2500);

        //COMPANIA B
        IEvaluareClientFirmaB evaluareB = new EvaluareClientFrmaB();
        int[] costEvenimente = new int[]{1000, 2000, 20000, 1000, 5000};
        Client client = new Client("XYZ", 5, costEvenimente);
        evaluareB.analizaClientFirmaB(client);

        //COMPANIA B DUPA ADAPTER, ADICA DUPA FUZIONARE
        IEvaluareClientFirmaB evaluareB2 = new AdaptorEvaluareClient();
        int[] costEvenimente2 = new int[]{1000,2000,20000,1000,5000};
        Client client2 = new Client("XYZ", 5, costEvenimente2);
        evaluareB2.analizaClientFirmaB(client2);
    }
}
