package Tests;

public class PhraseOMatic {
    public static void main (String[] args) {

        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"el"};

        String[] wordListTwo = {"mananca", "doarme",
                "merge", "citeste", "viseaza", "priveste", "alearga" ,
                "bea", "invata", "inoata"};

        String[] wordListThree = {"mere", "salata de beof",
                "apa", "in pat", "acasa",
                "o carte", "pe geam", "la munte", "pe bicicleta",
                "la televizor"};

        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("Tot ce stim este ca " + phrase);
    }
}

