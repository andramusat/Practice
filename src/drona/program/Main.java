package drona.program;

import drona.clase.Conexiune;
import drona.clase.FactoryRapoarte;
import drona.clase.FieldReport;
import drona.clase.TipSituatie;

public class Main {
    public static void main(String[] args) {
        Conexiune conexiuneGPS1 = Conexiune.getInstance("GPS");
        Conexiune conexiuneBaza = Conexiune.getInstance("Baza");
        Conexiune conexiuneVreme = Conexiune.getInstance("Vreme");

        Conexiune conexiuneGPS2 = Conexiune.getInstance("GPS");

        System.out.println("Conexiune GPS 1 == Conexiune GPS 2 " + (conexiuneGPS1 == conexiuneGPS2));


        FactoryRapoarte factoryRapoarte = new FactoryRapoarte();
        FieldReport report1 = factoryRapoarte.creareRaport(TipSituatie.INFORMARE);
        FieldReport report2 = factoryRapoarte.creareRaport(TipSituatie.AVERTIZARE);
        FieldReport report3 = factoryRapoarte.creareRaport(TipSituatie.ALERTARE);
        FieldReport report4 = factoryRapoarte.creareRaport(TipSituatie.INFORMARE);

        System.out.println(report1.generareRaport());
        System.out.println(report2.generareRaport());
        System.out.println(report3.generareRaport());
        System.out.println(report4.generareRaport());

    }
}