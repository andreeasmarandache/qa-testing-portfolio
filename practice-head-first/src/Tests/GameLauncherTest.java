package Tests;

import Objects.GuessGame;

public class GameLauncherTest {

    //Clasa GameLauncherTest inițiază jocul apelând metoda startGame() din clasa GuessGame. Aceasta este clasa cu metoda main, care pornește jocul.
    //Instanța GuessGame: Creează o nouă instanță a jocului de ghicit.
    //Apelul metodei startGame(): Pornește jocul, care începe procesul de ghicit pentru jucători.

    public static void main (String[] args){
        GuessGame game = new GuessGame();  // Creăm o instanță a jocului
        game.startGame();  // Începem jocul

    }
}
