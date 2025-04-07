package s2.builder;

import s2.factory.Atacant;
import s2.factory.Jucator;
import s2.factory.Portar;

import java.util.List;

public class JucatorBuilder {
    private Jucator jucator;

    public JucatorBuilder(String tip){
        if(tip.equals("portar")){
            jucator = new Portar();
        } else if(tip.equals("atacant")){
            jucator = new Atacant();
        }
    }

    public JucatorBuilder setAntrenamente(List<String> antrenamente){
        jucator.setAntrenamente(antrenamente);
        return this;
    }

    public Jucator build(){
        return jucator;
    }
}
