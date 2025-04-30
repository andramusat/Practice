package s9.decorator.program;

import s9.decorator.clase.*;

public class Main {
    //am o pizzerie si fac diverse feluri de pizza
    //sa completeze pizza cu diverse decorari(de ex margine cu branza, pizza picanta)
    //clientul poate sa ceara o pizza cu mai multe decorari(de ex sa aiba si margine cu branza si sa fie si picanta)

    public static void main(String[] args) {
        APizza pizza = new PizzaVegetariana();
        System.out.println(pizza.getComponente());
        System.out.println(pizza.getPret());

        APizza pizzaDecorata = new DecoratorCrown(pizza);
        System.out.println(pizzaDecorata.getComponente());
        System.out.println(pizzaDecorata.getPret());

        APizza pizzaDecorataMultiplu = new DecoratorPicant(new DecoratorCrown(new PizzaVegetariana()), 10);
        System.out.println(pizzaDecorataMultiplu.getComponente());
        System.out.println(pizzaDecorataMultiplu.getPret());

        APizza pizza2 = new PizzaCarnivora();

        APizza pizzaDecorataMultiplu2 = new DecoratorExtraMozzarella(new DecoratorPicant(new DecoratorCrown(pizza2), 8));
        System.out.println(pizzaDecorataMultiplu2.getComponente());
        System.out.println(pizzaDecorataMultiplu2.getPret());
    }

}