package s2.factory;

public class FactoryJucator {
    public static Jucator creeazaJucator(String tip){
        switch (tip.toLowerCase()){
            case "portar":
                return new Portar();
            case "atacant":
                return new Atacant();
            default:
                throw new IllegalArgumentException("Tipul de jucator nu este valid.");
        }
    }
}
