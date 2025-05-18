package ChainOfResponsability.clase;

public abstract class AHandler {
    private AHandler nextHandler;

    public AHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(AHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void procesareComanda(Comanda comanda);
}
