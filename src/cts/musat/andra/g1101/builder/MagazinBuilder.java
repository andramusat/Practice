package cts.musat.andra.g1101.builder;

import java.util.ArrayList;
import java.util.List;

public class MagazinBuilder implements IMagazinBuilder{
    private String denumire;
    private int suprafata;
    private int nrIntrari = 1;
    private Podea podea;
    private List<Decoratiune> decoratiuni = new ArrayList<>();

    public MagazinBuilder(String denumire, int suprafata) {
        this.denumire = denumire;
        this.suprafata = suprafata;
    }

    @Override
    public IMagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    @Override
    public IMagazinBuilder setPodea(Podea podea) {
        this.podea = podea;
        return this;
    }

    @Override
    public IMagazinBuilder adaugaDecoratiune(Decoratiune decoratiune) {
        this.decoratiuni.add(decoratiune);
        return this;
    }

//nu pot exista mai puțin de 1 intrări per 100 mp de magazin;
//dacă duritatea podelei personalizate este moale ( < 2), atunci nu se permit decorațiuni din material de tip Sticla;
//orice restricție de implementare aruncă o expecție custom cu mesajul aferent situației
//respective.
    @Override
    public Magazin build() throws ExceptieValidare {
        if(nrIntrari < suprafata / 100.0){
            throw new ExceptieValidare("Trebuie cel putin o intrare la fiecare 100 mp.");
        }
        for(Decoratiune decoratiune: decoratiuni){
            if(podea != null &&
            podea.getDuritate() < 2 &&
            decoratiune.getMaterial().equalsIgnoreCase("sticla")){
                throw new ExceptieValidare("Podea moale nu permite decoratiuni din sticla");
            }
        }
        return new Magazin(denumire, suprafata, nrIntrari, podea, decoratiuni);
    }
}
