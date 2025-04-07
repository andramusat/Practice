package SimpleFactory.program;

import SimpleFactory.clase.ETipPizza;
import SimpleFactory.clase.IPizza;
import SimpleFactory.clase.PizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        IPizza pizza = null;
        try {
            pizza = pizzaFactory.crearePizza(ETipPizza.ROMA);
        } catch (Exception e){
            System.err.println(e);
        }
        pizza.afisareDescriere();
    }
}
