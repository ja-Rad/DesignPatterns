package patterns.structural.adapter.challenge;

public class Client {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "testMusic.mp3"); // Playing mp3 file. Name: testMusic.mp3

        AdvancedMediaPlayer mp4Player = new Mp4Player();
        AdvancedMediaPlayer vlcPlayer = new VlcPlayer();

        MediaPlayer advancedMediaPlayerAdapter1 = new AdvancedMediaPlayerAdapter(mp4Player);
        advancedMediaPlayerAdapter1.play("", ""); // Playing mp4 file. Name: test.mp4

        MediaPlayer advancedMediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer);
        advancedMediaPlayerAdapter2.play("", ""); // Playing vlc file. Name: test.mp4
    }
}
