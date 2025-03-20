package Objects;

public class Episode {
    public int seriesNumber;
    public int episodeNumber;

    public void skipIntro() {
        System.out.println("Skipping intro...");
    }

     public void skipToNext() {
        System.out.println("Loading next episode...");
    }

    public void play() {
        System.out.println("Playing episode "+ episodeNumber + " from series " + seriesNumber);
    }
}
