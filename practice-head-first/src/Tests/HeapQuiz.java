package Tests;

public class HeapQuiz {
    int id = 0; // Variabila de instanță `id` care va fi setată pentru fiecare obiect HeapQuiz

    public static void main(String[] args) {
        int x = 0; // Inițializează variabila `x` cu 0
        HeapQuiz[] hq = new HeapQuiz[5]; // Creează un array de referințe `HeapQuiz` de 5 poziții

        // Loop care va crea obiecte HeapQuiz și va seta `id` pentru primele 3 poziții din array
        while (x < 3) {
            hq[x] = new HeapQuiz(); // Creează un nou obiect `HeapQuiz` pentru poziția `x` din array
            hq[x].id = x; // Setează `id` pentru acest obiect cu valoarea lui `x`
            x = x + 1; // Incrementează `x` pentru următoarea poziție
        }
        // După acest loop, avem:
        // hq[0] -> obiect cu id = 0
        // hq[1] -> obiect cu id = 1
        // hq[2] -> obiect cu id = 2

        // Urmează o serie de operații care manipulează referințele din array-ul `hq`
        hq[3] = hq[1]; // Setează `hq[3]` să referă același obiect ca `hq[1]` (obiectul cu id = 1)
        hq[4] = hq[1]; // Setează `hq[4]` să referă același obiect ca `hq[1]` (obiectul cu id = 1)

        hq[3] = null; // Șterge referința din `hq[3]`, deci `hq[3]` devine null și nu mai referă niciun obiect

        hq[4] = hq[0]; // Setează `hq[4]` să referă același obiect ca `hq[0]` (obiectul cu id = 0)

        hq[0] = hq[3]; // Setează `hq[0]` să referă același obiect ca `hq[3]`, care acum este `null`

        hq[3] = hq[2]; // Setează `hq[3]` să referă același obiect ca `hq[2]` (obiectul cu id = 2)

        hq[2] = hq[0]; // Setează `hq[2]` să referă același obiect ca `hq[0]`, care acum este `null`

        // Starea finală a array-ului `hq` este:
        // hq[0] = null
        // hq[1] -> obiect cu id = 1
        // hq[2] = null
        // hq[3] -> obiect cu id = 2
        // hq[4] -> obiect cu id = 0

        // Observație: La acest punct, obiectele create sunt accesibile prin referințele lor
        // hq[1] referă la obiectul cu id = 1
        // hq[3] referă la obiectul cu id = 2
        // hq[4] referă la obiectul cu id = 0
        // hq[0] și hq[2] sunt `null`, deci nu referă niciun obiect
    }
}
