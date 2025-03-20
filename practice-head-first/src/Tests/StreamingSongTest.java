package Tests;

import Objects.StreamingSong;

public class StreamingSongTest {
    public static void main(String[] args) {

        StreamingSong song = new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.duration = 5;
        song.play();
        song.printDetails();
    }
}
