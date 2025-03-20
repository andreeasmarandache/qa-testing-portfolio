package Objects;

public class Player {

    //Clasa Player reprezintă un jucător din jocul de ghicit numere. Fiecare jucător poate ghici un număr între 0 și 9.
    //Variabila number: Această variabilă este specifică fiecărui jucător și stochează numărul ghicit la fiecare rundă.
    //Metoda guess(): Atribuie un număr aleator între 0 și 9 variabilei number.
    //Metoda folosește Math.random() pentru a genera numărul, apoi îl afișează pentru a informa ce număr a ghicit jucătorul în acea rundă.

    int number =0;

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }

}
