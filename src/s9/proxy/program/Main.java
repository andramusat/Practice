package s9.proxy.program;

import s9.proxy.clase.Autentificare;
import s9.proxy.clase.AutentificareProxy;
import s9.proxy.clase.IAutentificare;

public class Main {
    public static void functie(IAutentificare sistem, String username, String password){
        boolean rezultat = sistem.autentificare(username, password);
        if(rezultat){
            System.out.println("S-a permis accesul pt bogdan.");
        }
        else {
            System.out.println("Nu s-a permis accesul pt bogdan.");
        }
    }
    public static void main(String[] args) {

        IAutentificare sistem = new AutentificareProxy(new Autentificare());
        functie(sistem, "bogdan", "parolabogdan");
        functie(sistem, "bogdan", "parolabogdan");
        functie(sistem, "bogdan", "parolabogdan");
        functie(sistem, "bogdan", "parolabogdan");
        functie(sistem, "bogdan", "bogdan");

    }
}