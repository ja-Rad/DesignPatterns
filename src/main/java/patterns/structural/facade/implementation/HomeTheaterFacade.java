package patterns.structural.facade.implementation;

// Facade - make a complicated system easier for the client
public class HomeTheaterFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;
    DvdPlayer dvdPlayer;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;
    TheaterLights theaterLights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier,
                             CdPlayer cdPlayer,
                             DvdPlayer dvdPlayer,
                             PopcornPopper popcornPopper,
                             Projector projector,
                             Screen screen,
                             TheaterLights theaterLights,
                             Tuner tuner) {
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
        this.dvdPlayer = dvdPlayer;
        this.popcornPopper = popcornPopper;
        this.projector = projector;
        this.screen = screen;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
    }

    // Facade wraps everything in a nice handy method
    public void watchMovie(String movie) {
        System.out.println("HomeTheaterFacade: Get ready to watch a movie...");

        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.dim(10);
        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvdPlayer.on();

        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("HomeTheaterFacade: Shutting movie theater down...");

        popcornPopper.off();

        theaterLights.on();

        screen.up();

        projector.off();

        amplifier.off();

        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
