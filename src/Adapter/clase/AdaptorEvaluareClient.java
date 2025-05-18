package Adapter.clase;

public class AdaptorEvaluareClient extends EvaluareClientFirmaA implements IEvaluareClientFirmaB{
    public int costTotalEvenimente(Client client){
        int costTotalEvenimente=0;
        for (int i = 0; i < client.getNrEvenimente(); i++) {
            costTotalEvenimente+=client.getCostEvenimente()[1];
        }
        return costTotalEvenimente;
    }

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Arata ca si cum firma B face analiza...");
        this.analizaClientFirmaA(costTotalEvenimente(client));
    }
}
