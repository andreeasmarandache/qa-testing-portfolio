package Objects;


public class StreamingSong {

    public String title;
    public String artist;
    public int duration;

    public void play() {
        System.out.println("Playing song");
    }

    public void printDetails() {
        System.out.println("This is " + title +
                " by " + artist + " with a duration of " + duration + " minutes.");
    }
}
