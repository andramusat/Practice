package Builder.program;

import Builder.clase.PetrecereBuilder;
import Builder.clase.Petrecere;

public class Main {
    public static void main(String[] args) {
        PetrecereBuilder builder = new PetrecereBuilder();
        Petrecere petrecereTest = builder.build();

        builder = builder.setAreBaloane(true);
        System.out.println(petrecereTest);

        Petrecere petrecere = builder.setAreArtificii(true).setNrPersoane(20).setAreTort(true).build();
        System.out.println(petrecere);
    }
}
