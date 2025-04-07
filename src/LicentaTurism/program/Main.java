package LicentaTurism.program;

import LicentaTurism.clase.*;

import java.util.List;

public class Main {
    private static LicentaDeTurism licenta2;
    public static void main(String[] args) {
        LicentaDeTurism licenta1 = LicentaDeTurism.getInstance();

        Thread licentaThread = new Thread(() ->{
            licenta2 = LicentaDeTurism.getInstance();
        });
        try {
            licentaThread.join();
        } catch (InterruptedException e){
            throw new RuntimeException();
        }

        LicentaDeTurism licenta3 = LicentaDeTurism.getInstance();

        if(licenta1 == licenta3 && licenta1 == licenta2){
            System.out.println("Toate instantele sunt la fel.");
        } else {
            System.out.println("Instantele sunt diferite");
        }

        licenta1.setLicenseNumber("123");
        try {
            licenta2.setLicenseNumber("123");
        } catch (TooManyChangeLicenseRequests e){
            System.out.println(e.getMessage());
        }

        PachetTuristicBuilder builder = new PachetTuristicBuilder(TipTransport.AUTOCAR, 7);
        PachetTuristic pachet1 = builder.setNrStele(3)
                .setActivitatiExtra(List.of("Excursie la munte", "Excursie la mare")).build();
        pachet1.describePackage();

        PachetTuristic pachet2 = builder
                .setTipTransport(TipTransport.AVION)
                .setNrStele(2)
                .build();
        pachet2.describePackage();

        PachetTuristic pachet3 = builder
                .setTipTransport(TipTransport.AVION)
                .setDurata(20)
                .setNrStele(6)
                .setActivitatiExtra(List.of("Activitate 1", "Activitate 2", "Activitate 3"))
                .build();
        pachet3.describePackage();
    }
}
