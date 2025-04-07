package cts.musat.andra.g1101.builder;

public class Decoratiune {
    private String tip;
    private String material;

    public Decoratiune(String tip, String material) {
        this.tip = tip;
        this.material = material;
    }

    public String getTip() {
        return tip;
    }

    public String getMaterial() {
        return material;
    }
}
