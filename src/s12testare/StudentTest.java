package s12testare;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Set up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }
    @Test
    public void testMediaCorecta() throws Exception {
        Student s = new Student(new int[]{7, 10, 9, 10});
        assertEquals(9.5, s.calculeazaMediaCelorMaiMari2NoteDistincte(), 0.01);
    }

    @Test(expected = ExceptiePreaPutineNote.class)
    public void testPreaPutineNote() throws Exception {
        Student s = new Student(new int[]{10});
        s.calculeazaMediaCelorMaiMari2NoteDistincte();
    }

    @Test(expected = ExceptieNoteNedistincte.class)
    public void testNoteIdentice() throws Exception {
        Student s = new Student(new int[]{8, 8, 8});
        s.calculeazaMediaCelorMaiMari2NoteDistincte();
    }

    @Test
    public void testNoteNegativPozitiv() throws Exception {
        Student s = new Student(new int[]{-1, 10, 5});
        assertEquals(7.5, s.calculeazaMediaCelorMaiMari2NoteDistincte(), 0.01);
    }

    @Test(expected = ExceptiePreaPutineNote.class)
    public void testNullArray() throws Exception {
        Student s = new Student(null);
        s.calculeazaMediaCelorMaiMari2NoteDistincte();
    }

}