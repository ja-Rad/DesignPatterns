package patterns.structural.adapter.challenge;

public interface AdvancedMediaPlayer {
    void loadFilename(String fileName);

    void listen();
}

class VlcPlayer implements AdvancedMediaPlayer {

    String fileName;

    @Override
    public void loadFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

}

class Mp4Player implements AdvancedMediaPlayer {

    private String fileName;

    @Override
    public void loadFilename(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }

}