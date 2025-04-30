package s9.decorator.clase;

public class PizzaCarnivora extends APizza{
    @Override
    public String getComponente() {
        return "blat, sos rosii, salam, bacon, sunca";
    }

    @Override
    public int getPret() {
        return 35;
    }
}
