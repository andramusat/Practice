package s14.mock;

import s14.clase.AbstractMasina;

public class MasinaMOck implements AbstractMasina {
    private double viteza;

    public MasinaMOck(double viteza) {
        this.viteza = viteza;
    }

    public void setViteza(double viteza) {
        this.viteza = viteza;
    }

    @Override
    public double getViteza() {
        return viteza;
    }
}
