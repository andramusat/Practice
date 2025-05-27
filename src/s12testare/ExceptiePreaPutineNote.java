package s12testare;

public class ExceptiePreaPutineNote extends Exception{
    public ExceptiePreaPutineNote() {
        super("Sunt prea puține note pentru calcularea mediei.");
    }
}
