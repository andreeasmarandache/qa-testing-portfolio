package Tests;

public class Triangle {
    // Variabile de instanță pentru aria, înălțimea și lungimea triunghiului
    double area;
    int height;
    int length;

    // Metoda principală care rulează programul
    public static void main (String[] args){
        // Inițializează variabila `x` cu 0 pentru a controla loop-ul while
        int x = 0;

        // Creează un array de 4 obiecte de tip `Triangle`
        Triangle[] ta = new Triangle[4];

        // Loop pentru a inițializa și seta fiecare triunghi în array
        while (x < 4) { // Rulează cât timp `x` este mai mic decât 4
            // Creează un nou obiect `Triangle` și îl stochează la poziția `x` în array
            ta[x] = new Triangle();

            // Setează înălțimea triunghiului curent: `height` este de două ori (x + 1)
            ta[x].height = (x + 1) * 2;

            // Setează lungimea triunghiului curent: `length` este x + 4
            ta[x].length = x + 4;

            // Apelează metoda `setArea` pentru a calcula aria triunghiului
            ta[x].setArea();

            // Afișează indexul triunghiului și aria calculată
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            // Incrementează `x` pentru următoarea iterație a loop-ului
            x = x + 1;
        }

        // După ce loop-ul s-a terminat, setează variabila `y` cu valoarea finală a lui `x` (care este 4)
        int y = x;

        // Setează `x` la 27 (fără impact asupra codului ulterior)
        x = 27;

        // Creează o referință `t5` care pointează la al treilea triunghi din array (indexul 2)
        Triangle t5 = ta[2];

        // Modifică aria triunghiului la indexul 2 din array la valoarea 343
        ta[2].area = 343;

        // Afișează valoarea variabilei `y` și aria triunghiului referit de `t5`
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    // Metodă pentru a calcula aria triunghiului curent și a o salva în variabila `area`
    void setArea() {
        // Formula pentru aria triunghiului: (înălțimea * lungimea) / 2
        area = (height * length) / 2;
    }
}


