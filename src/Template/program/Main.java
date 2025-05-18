package Template.program;

import Template.clase.AEvaluareDaune;
import Template.clase.EvaluareDauneBucatarie;

public class Main {
    public static void main(String[] args) {
        AEvaluareDaune evaluareDauneBucatarie = new EvaluareDauneBucatarie();
        System.out.println("Procedura evaluare daune");
        evaluareDauneBucatarie.proceduraEvaluareDaune();
    }
}
