package s2.factory;

import s2.singleton.ListaMedicamenteInterzise;

import java.util.List;

public abstract class Jucator implements IAntrenament, ITestareAntiDoping{
    protected String nume;
    protected String tipSport;
    protected List<String> antrenamente;

    public void testeazaAntiDoping(){
        System.out.println(nume + " este testat pentru medicamente interzise: " + ListaMedicamenteInterzise.getInstance().getMedicamenteInterzise());
    }

    public abstract void antreneaza();

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = antrenamente;
    }
}
