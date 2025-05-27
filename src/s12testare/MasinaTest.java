package s12testare;

import org.junit.Test;

import static org.junit.Assert.*;

public class MasinaTest {

    @org.junit.Before
    public void setUp() throws Exception {
        System.out.println("Set up");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    @Test
    public void test1() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(300);
        System.out.println("Test 1");
    }

    @Test(expected = ExceptieNrKm.class)
    public void test2() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(-300);
    }

    @Test()
    public void test3() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(300);
        assertEquals("Verif cu nr km normal", 300, m.getNrKm());
    }

    //creaza un exemplu in care modelul meu de test nu-l acopera, pentru setter
    //cum sa testam ca sa fim siguri ca si aceasta problema e verificata, adica trebuie sa mi pice testul ca sa mi dau seama care e problema
    //adica fa mi un test in care sa pice in situatia in care trimit acel -300, altul pe langa pe care le am pna acum

    @Test(expected = ExceptieNrKm.class)
    public void test4() throws ExceptieNrKm {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        m.setNrKm(-300);
        assertEquals("Verif cu nr km negativ", 200, m.getNrKm()); //nu e niciodata executat pt ca arunca exceptie inainte in aces test
    }

    @Test()
    public void test5() {
        Masina m = new Masina("Opel", 12000, 200, 2015);
        try {
            m.setNrKm(-300);
            //1 NU e bine
            //assertTrue(false);
            fail("Nu arunca exceptie chiar daca am trimis nr km negativ");
        } catch (ExceptieNrKm e) {
           //throw new RuntimeException(e);
            //la 2 e bine, pt ca mi a aruncat acea exceptie
            assertTrue(true);
        }
        assertEquals("S-a modificat nr km pe apel set cu nr km negativ", 200, m.getNrKm());
    }

    //avem clasa student, fara collections, fara sortari
    //studentul are o lista de note (note intregi),
    // implementeaza o metoda care retutneaza media aritmetica a celor mai mari 2 note distincte
    //creeaza 2 exceptii care sa fie custom
}