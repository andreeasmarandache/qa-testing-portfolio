package Tests;

import Objects.GameHelper;
import Objects.Startup;

import java.util.ArrayList;

public class StartupBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        Startup one = new Startup();
        one.setName("The first");
        Startup two = new Startup();
        two.setName("The second");
        Startup three = new Startup();
        three.setName("The third");
        startups.add(one);
        startups.add(two);
        startups.add(three);

        System.out.println("Your goal is to sink three Startups.");
        System.out.println("The first, The second, The third");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = String.valueOf(helper.getUserInput("Enter a guess"));
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                startups.remove(startupToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All Startups are dead! Your stock in now worthless");
        if (numOfGuesses <=18) {
            System.out.println("It only took you" + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        } else {
            System.out.println("Took you long enough." + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main (String[] args){
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }




}
