package s12testare;

public class Masina {
    private String model;
    private double pret;
    private int nrKm;
    private int anPublicatie;

    public Masina(String model, double pret, int nrKm, int anPublicatie) {
        this.model = model;
        this.pret = pret;
        this.nrKm = nrKm;
        this.anPublicatie = anPublicatie;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getNrKm() {
        return nrKm;
    }

    //nrKm>0

    public void setNrKm(int nrKm) throws ExceptieNrKm {
        if(nrKm<0){
            //this.nrKm=nrKm; //asta este greseala
            throw new ExceptieNrKm();
        }else {
            this.nrKm=nrKm;
        }
    }

    public int getAnPublicatie() {
        return anPublicatie;
    }

    public void setAnPublicatie(int anPublicatie) {
        this.anPublicatie = anPublicatie;
    }
}
