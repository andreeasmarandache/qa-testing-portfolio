package Objects;

public class GuessGame {

    //Clasa GuessGame gestionează logica jocului de ghicit. Creează trei jucători care încearcă să ghicească un număr ales de joc între 0 și 9.
    //Instanțierea jucătorilor (p1, p2, și p3): Sunt creați trei jucători care vor încerca să ghicească numărul ales de joc.
    //Ghicirile jucătorilor (guessp1, guessp2, guessp3): Aceste variabile stochează numărul ghicit de fiecare jucător în fiecare rundă.
    //Starea de corectitudine (p1isRight, p2isRight, p3isRight): Variabile de tip boolean care indică dacă un jucător a ghicit corect.
    //Numărul țintă (targetNumber): Generat aleator între 0 și 9, acesta este numărul pe care jucătorii trebuie să-l ghicească.
    //Bucla while (true): Bucla rulează până când cel puțin un jucător ghicește numărul corect.
    //Afișarea câștigătorilor: Dacă un jucător ghicește corect, afișăm cine a ghicit corect și terminăm jocul.

    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9 ...");

        while (true){
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight=true;
            }
            if (guessp2 == targetNumber) {
                p2isRight=true;
            }
            if (guessp3 == targetNumber) {
                p3isRight=true;
            }
            if(p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over");
                break;
            }
            else {
                System.out.println("Player will have to try again");
            }
        }
    }
}
