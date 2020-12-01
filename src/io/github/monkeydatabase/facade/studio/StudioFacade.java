package io.github.monkeydatabase.facade.studio;

public class StudioFacade {
    private Light light;
    private Popcorn popcorn;
    private DVDPlayer dvdPlayer;
    private Speaker speaker;
    private Projector projector;
    private Screen screen;

    public StudioFacade() {
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.speaker = Speaker.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        speaker.on();
        dvdPlayer.on();
        light.darker();
    }

    public void play(){
        dvdPlayer.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        light.brighter();
        popcorn.off();
        screen.up();
        projector.off();
        speaker.off();
        dvdPlayer.off();
    }
}
