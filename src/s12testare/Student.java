package s12testare;

import java.util.List;

public class Student {
    private int[] note;

    public Student(int[] note) {
        this.note = note;
    }


    public double calculeazaMediaCelorMaiMari2NoteDistincte() throws ExceptiePreaPutineNote, ExceptieNoteNedistincte {
        if (note == null || note.length < 2) {
            throw new ExceptiePreaPutineNote();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int nota : note) {
            if (nota > max1) {
                max2 = max1;
                max1 = nota;
            } else if (nota > max2 && nota != max1) {
                max2 = nota;
            }
        }
        if (max2 == Integer.MIN_VALUE) {
            throw new ExceptieNoteNedistincte();
        }
        return (max1 + max2) / 2.0;
    }

}
