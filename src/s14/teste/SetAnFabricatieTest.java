package s14.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import s14.categorii.TestLent;
import s14.categorii.TestRapid;
import s14.clase.Masina;
import s14.exceptii.ExceptieAn;

import static org.junit.Assert.*;

public class SetAnFabricatieTest {
    private Masina masina;

    @Before
    public void setUp() throws Exception {
        masina = new Masina();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Category(TestRapid.class)
    @Test
    public void testRight() throws ExceptieAn {
        masina.setAnFabricatie(2000);
        assertEquals("Nu s-a setat corect anul pentru valoare normala",2000, masina.getAnFabricatie());
    }
    @Category(TestLent.class)
    @Test
    public void testBoundary() throws ExceptieAn {
        masina.setAnFabricatie(1900);
        assertEquals("Nu s-a setat corect anul pentru valoare limita inferioara",1900, masina.getAnFabricatie());
    }
    @Category(TestLent.class)
    @Test
    public void testBoundary2() throws ExceptieAn {
        masina.setAnFabricatie(2025);
        assertEquals("Nu s-a setat corect anul pentru valoare limita superioara",2025, masina.getAnFabricatie());
    }

    @Category(TestRapid.class)
    @Test(expected = ExceptieAn.class)
    public void testException() throws ExceptieAn {
        masina.setAnFabricatie(1500); //nu arunca exceptie, atunci cand testul asta ar astepta, de aceea acest test pica
    }

    @Category(TestRapid.class)
    @Test(timeout = 100) //timeout e masurat in milisecunde
    public void testPerformance() throws ExceptieAn {
        long start = System.currentTimeMillis();
        long start2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            masina.setAnFabricatie(2000);
        }
    }

    @Category(TestRapid.class)
    @Test(timeout = 100) //timeout e masurat in milisecunde
    public void testPerformance2() throws ExceptieAn {
        long start = System.currentTimeMillis();
        long start2 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            masina.setAnFabricatie(2000);
        }
        long stop = System.currentTimeMillis();
        long stop2 = System.nanoTime();
        System.out.println(start + " " + stop);
        System.out.println(stop-start);
        System.out.println(start2 + " " + stop2);
        System.out.println(stop2-start2);

        long prag=1;
        assertTrue((stop2-start2)/1000000 <= prag);
    }

}