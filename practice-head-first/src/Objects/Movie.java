package Objects;

public class Movie {
    public String title;
    public String genre;
    public int rating;

    public void playIt(){
        System.out.println("Playing the movie \"" + title + "\"");
    }
}
