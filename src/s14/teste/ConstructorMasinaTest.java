package s14.teste;

import org.junit.Test;
import s14.clase.Masina;
import s14.exceptii.ExceptieAn;
import s14.exceptii.ExceptieModel;

import static org.junit.Assert.*;

public class ConstructorMasinaTest {
    @Test
    public void testRight() throws ExceptieModel, ExceptieAn {
        Masina masina =new Masina("Opel", 12000, 2020);
        assertEquals("Opel", masina.getModel());
        assertEquals(12000, masina.getPret(), 0.001);
        assertEquals(2020, masina.getAnFabricatie());
    }


}