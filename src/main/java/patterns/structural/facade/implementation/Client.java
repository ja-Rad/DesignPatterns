package patterns.structural.facade.implementation;

public class Client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amplifier);
        DvdPlayer dvdPlayer = new DvdPlayer("Top-O-Line DVD Player", amplifier);
        CdPlayer cdPlayer = new CdPlayer("Top-O-Line CD Player", amplifier);
        Projector projector = new Projector("Top-O-Line Projector", dvdPlayer);
        TheaterLights theaterLights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popcornPopper = new PopcornPopper("Popcorn Popper");


        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                amplifier,
                cdPlayer,
                dvdPlayer,
                popcornPopper,
                projector,
                screen,
                theaterLights,
                tuner
        );

        homeTheater.watchMovie("Inception");
        System.out.println("----------------------------");
        homeTheater.endMovie();
    }
}
