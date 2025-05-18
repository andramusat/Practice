package Adapter.clase;

public class EvaluareClientFrmaB implements IEvaluareClientFirmaB{
    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Tehnica evaluare firma B");
        System.out.println("S-a oferit discount de 10%");
    }
}
