package s9.decorator.clase;

public class DecoratorExtraMozzarella extends ADecoratorPizza{
    public DecoratorExtraMozzarella(APizza pizza) {
        super(pizza);
    }

    @Override
    public String getComponente() {
        return super.getComponente() + ", extra mozzarella";
    }

    @Override
    public int getPret() {
        return super.getPret() + 5;
    }
}
