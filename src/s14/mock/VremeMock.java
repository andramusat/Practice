package s14.mock;

import s14.clase.AbstractVreme;

public class VremeMock implements AbstractVreme {
    private boolean estePloaie;
    private int cantiatePrecipitatii;
    @Override
    public boolean estePloaie() {
        return false;
    }

    @Override
    public int getCantitateDePrecipitatii() {
        return 0;
    }
}
