package Tests;

public class Mix4 {
    int counter = 0; // Variabilă de instanță pentru a număra de câte ori este incrementată pentru fiecare obiect

    public static void main(String[] args) {
        int count = 0; // Variabilă locală pentru a contoriza numărul total de operațiuni efectuate
        Mix4[] mixes = new Mix4[20]; // Creează un array de referințe `Mix4` de 20 de poziții, dar inițial toate sunt null
        int i = 0; // Inițializează variabila de control `i` pentru loop

        // Loop care se va executa până când `i` este mai mic decât 9
        while (i < 9) {
            mixes[i] = new Mix4(); // Creează un nou obiect `Mix4` și îl stochează în poziția `i` din array
            mixes[i].counter = mixes[i].counter + 1; // Incrementează `counter` al obiectului curent (`mixes[i]`)
            count = count + 1; // Incrementează `count` cu 1 pentru această operațiune de creare

            // Adaugă la `count` rezultatul metodei `maybeNew`, care poate crea un nou obiect și returnează 1 sau 0
            count = count + mixes[i].maybeNew(i);
            i = i + 1; // Incrementează `i` pentru a trece la următoarea poziție în array
        }

        // Afișează valoarea finală a lui `count` și valoarea lui `counter` pentru obiectul de la `mixes[1]`
        System.out.println(count + " " + mixes[1].counter);
    }

    // Metoda `maybeNew`, care primește un parametru `index`
    public int maybeNew(int index) {
        // Dacă `index` este mai mic decât 5, se creează un nou obiect `Mix4`
        if (index < 5) {
            Mix4 mix = new Mix4(); // Creează un nou obiect `Mix4`, dar acesta nu este stocat în array (doar local)
            mix.counter = mix.counter + 1; // Incrementează `counter` al noului obiect creat
            return 1; // Returnează 1 pentru a semnala că un obiect nou a fost creat
        }
        // Dacă `index` nu este mai mic decât 5, nu se creează un nou obiect, și returnează 0
        return 0;
    }
}
