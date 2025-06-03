package s14.mock;

import org.junit.Test;
import s14.clase.AbstractMasina;
import s14.clase.AbstractVreme;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AutostradaTest {
    @Test
    public void testRight(){
        List<AbstractMasina> lista=new ArrayList<AbstractMasina>();
        lista.add(new MasinaMOck(130));
        lista.add(new MasinaMOck(90));
        lista.add(new MasinaMOck(190));
        lista.add(new MasinaMOck(290));


    }

}