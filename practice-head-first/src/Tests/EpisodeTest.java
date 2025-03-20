package Tests;

import Objects.Episode;

public class EpisodeTest {
    public static void main(String[] args) {

        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 3;
        episode.play();
        episode.skipIntro();
        episode.skipToNext();
    }
}
