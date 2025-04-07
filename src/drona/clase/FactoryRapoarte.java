package drona.clase;

public class FactoryRapoarte {
    public FieldReport creareRaport(TipSituatie situatie)
    {
        FieldReport report = null;
        switch (situatie){
            case INFORMARE:
                report = new RaportInformare();
                break;
            case AVERTIZARE:
                report = new RaportAvertizare();
                break;
            case ALERTARE:
                report = new RaportAlertare();
                break;
        }
        return report;
    }
}
