package Tests;

import java.util.ArrayList;

public class ArrayListMagnet {


    public static void main (String[] args){
        ArrayList<String> a = new ArrayList<String>();

        a.add(0, "zero"); // Adaugă "zero" la indexul 0
        a.add(1, "one");  // Adaugă "one" la indexul 1
        a.add(2, "two");  // Adaugă "two" la indexul 2
        a.add(3, "three"); // Adaugă "three" la indexul 3
        printList(a); // Apelează metoda printList pentru a afișa elementele listei

        if (a.contains("three")) { // Verifică dacă lista conține elementul "three"
            a.add("four"); // Dacă da, adaugă "four" la sfârșitul listei
        }
        a.remove(2); // Șterge elementul de la indexul 2 ("two")
        printList(a); // Afișează lista actualizată

        if (a.indexOf("four") != 4) { // Verifică dacă "four" nu se află la indexul 4
            a.add(4, "4.2"); // Dacă nu, adaugă "4.2" la indexul 4
        }
        printList(a); // Afișează lista după modificare

        if (a.contains("two")) { // Verifică dacă lista conține "two"
            a.add("2.2"); // Dacă da, adaugă "2.2" la sfârșitul listei
        }
        printList(a); // Afișează lista finală
    }

    public static void printList(ArrayList<String> list) { // Metodă pentru a afișa lista
        for (String element : list) { // Parcurge fiecare element din listă
            System.out.print(element + "  "); // Afișează elementul curent și un spațiu
        }
        System.out.println(); // Trecere la o linie nouă după afișarea întregii liste
    }
}
