package Tests;

public class TestArrays {

    // Metoda principală care rulează programul
    public static void main (String[] args) {

        // Creează un array de numere întregi numit `index` cu dimensiunea 4
        int[] index = new int[4];

        // Creează un array de String-uri numit `islands` cu dimensiunea 4
        String[] islands = new String[4];

        // Setează valorile array-ului `index` pentru a referi poziții în array-ul `islands`
        index[0] = 1; // La poziția 0, valoarea este 1
        index[1] = 3; // La poziția 1, valoarea este 3
        index[2] = 0; // La poziția 2, valoarea este 0
        index[3] = 2; // La poziția 3, valoarea este 2

        // Inițializează array-ul `islands` cu nume de insule
        islands[0] = "Bermuda"; // Poziția 0 din `islands` este "Bermuda"
        islands[1] = "Fiji";    // Poziția 1 din `islands` este "Fiji"
        islands[2] = "Azores";  // Poziția 2 din `islands` este "Azores"
        islands[3] = "Cozumel"; // Poziția 3 din `islands` este "Cozumel"

        // Inițializează variabila `y` cu 0 pentru a controla loop-ul
        int y = 0;

        // Declara variabila `ref` pentru a stoca referințele din `index`
        int ref;

        // Loop care iterează de 4 ori pentru a afișa numele insulelor specificate de `index`
        while (y < 4) { // Rulează cât timp `y` este mai mic decât 4

            // Setează `ref` la valoarea din array-ul `index` de la poziția `y`
            ref = index[y]; // `ref` primește una din valorile {1, 3, 0, 2} în funcție de `y`

            // Afișează textul "island = " și apoi insula din `islands` referită de `ref`
            System.out.print("island = ");
            System.out.println(islands[ref]); // Afișează insula la poziția `ref` din `islands`

            // Incrementează `y` pentru a trece la următoarea iterație
            y = y + 1;
        }

    }
}
