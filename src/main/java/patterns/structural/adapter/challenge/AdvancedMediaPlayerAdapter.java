package patterns.structural.adapter.challenge;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFilename(fileName);
        advancedMediaPlayer.listen();
    }
}
