package Facade.clase;

public class Sala {
    private String denumire;
    private int nrMinParticipanti;
    private int nrMaxParticipanti;

    public Sala(String denumire, int nrMinParticipanti, int nrMaxParticipanti) {
        super();
        this.denumire = denumire;
        this.nrMinParticipanti = nrMinParticipanti;
        this.nrMaxParticipanti = nrMaxParticipanti;
    }

    public boolean verificaDisponibilitate(String data){
        return true;
    }
}
