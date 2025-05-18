package Template.clase;

public abstract class AEvaluareDaune {
    //pas fix care este executat identific indiferent de tipul de Dauna
    private final void identificareDauna(){
        System.out.println("S-a identificat o noua dauna (PAS FIX)");
    }
    abstract void evaluareInitialaDauna();
    abstract void trimitereEvaluareManager();

    public final void proceduraEvaluareDaune(){
        identificareDauna();
        evaluareInitialaDauna();
        trimitereEvaluareManager();
    }
}
