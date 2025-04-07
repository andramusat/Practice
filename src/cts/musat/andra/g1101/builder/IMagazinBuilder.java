package cts.musat.andra.g1101.builder;

public interface IMagazinBuilder {
    IMagazinBuilder setNrIntrari(int nrIntrari);
    IMagazinBuilder setPodea(Podea podea);
    IMagazinBuilder adaugaDecoratiune(Decoratiune decoratiune);
    Magazin build() throws ExceptieValidare;
}
