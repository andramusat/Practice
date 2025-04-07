package LicentaTurism.clase;

import java.util.ArrayList;
import java.util.List;

public class PachetTuristicBuilder implements IBuilder{
    private TipTransport tipTransport;
    private int durata;
    private TipCamera tipCamera = TipCamera.SINGLE;
    private int nrStele;
    private List<String> activitatiExtra;

    public PachetTuristicBuilder(TipTransport tipTransport, int durata) {
        this.tipTransport = tipTransport;
        this.durata = durata;
        this.activitatiExtra = new ArrayList<>();
    }

    public PachetTuristicBuilder setTipTransport(TipTransport tipTransport) {
        this.tipTransport = tipTransport;
        return this;
    }

    public PachetTuristicBuilder setDurata(int durata) {
        this.durata = durata;
        return this;
    }

    public PachetTuristicBuilder setTipCamera(TipCamera tipCamera) {
        this.tipCamera = tipCamera;
        return this;
    }

    public PachetTuristicBuilder setNrStele(int nrStele) {
        this.nrStele = nrStele;
        return this;
    }

    public PachetTuristicBuilder setActivitatiExtra(List<String> activitatiExtra) {
        this.activitatiExtra = activitatiExtra;
        return this;
    }

    @Override
    public PachetTuristic build() {
        PachetTuristic pachetTuristic = new PachetTuristic(tipTransport, durata, tipCamera, nrStele, activitatiExtra);
        this.tipCamera = tipCamera.SINGLE;
        this.nrStele = 1;
        this.activitatiExtra = new ArrayList<>();
        return pachetTuristic;
    }
}
