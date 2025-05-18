package Flyweight.clase;


public class MesajPrintare implements IPrintare{
    private ETipPrintare tipPrintare;
    private String mesajPrintare;

    public MesajPrintare(ETipPrintare tipPrintare) {
        this.tipPrintare = tipPrintare;
        System.out.println("S-a creat obiectul cu printare: "+this.tipPrintare);
    }

    public ETipPrintare getTipPrintare() {
        return tipPrintare;
    }

    @Override
    public void printareBon(Bon bon) {
        System.out.println("Pentru printare s-a folosit formatul: " + this.getTipPrintare());
        System.out.println("Se printeaza bonul de la masa " + bon.getNrMasa());
    }
}
