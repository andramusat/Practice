package drona.clase;

import java.util.HashMap;
import java.util.Map;

public class Conexiune implements ServiceConnection{
    private static Map<String, Conexiune> conexiuni; //singleton registry (nr de conexiuni)
    private boolean esteDeschisa;

    private Conexiune() {
        this.esteDeschisa = true;
    }

    static {
        conexiuni = new HashMap<>();
        conexiuni.put("GPS", new Conexiune());
        conexiuni.put("Baza", new Conexiune());
        conexiuni.put("Vreme", new Conexiune());
    }

    public static Conexiune getInstance(String tipConexiune){
        return conexiuni.getOrDefault(tipConexiune, null);
    }

    @Override
    public void connect() {
        this.esteDeschisa = true;
    }

    public void disconnect(){
        this.esteDeschisa = false;
    }
}
