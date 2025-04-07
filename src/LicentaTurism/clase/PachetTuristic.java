package LicentaTurism.clase;

import java.util.ArrayList;
import java.util.List;

public class PachetTuristic implements AbstractHolidayPackage{
    private TipTransport tipTransport;
    private int durata;
    private TipCamera tipCamera;
    private int nrStele;
    private List<String> activitatiExtra;

    PachetTuristic(){
        this.activitatiExtra = new ArrayList<>();
    }

    PachetTuristic(TipTransport tipTransport, int durata, TipCamera tipCamera, int nrStele, List<String> activitatiExtra) {
        this.tipTransport = tipTransport;
        this.durata = durata;
        this.tipCamera = tipCamera;
        this.nrStele = nrStele;
        this.activitatiExtra = activitatiExtra;
    }

    @Override
    public void describePackage() {
        System.out.println("Pachet turistic:");
        System.out.println("\tTip transport: " + tipTransport);
        System.out.println("\tDurata: " + durata + " zile");
        System.out.println("\tTip camera: " + tipCamera);
        System.out.println("\tNr stele: " + nrStele);
        System.out.println("\tActivitati extra: " + activitatiExtra);
        System.out.println("\n");
    }
}
