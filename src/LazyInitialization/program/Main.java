package LazyInitialization.program;

import LazyInitialization.clase.SingletonLazy;

public class Main {
    public static void main(String[] args) {
        SingletonLazy s1;
        SingletonLazy s2;

        s1 = SingletonLazy.getInstance();
        s2 = SingletonLazy.getInstance();

        if(s1 == s2){
            System.out.println("Instante indentice versiune lazy.");
        } else {
            System.out.println("Instantele nu sunt identice.");
        }
    }
}
