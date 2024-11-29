/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design_patterns;

/**
 *
 * @author tapas
 */

// Library Implementation
class DVDPlayer{
    public void play(String movie){}
    public void stop(){}
}
class Projector{
    public void on(){}
    public void off(){}
}
class SoundSystem{
    public void on(){}
    public void off(){}
}


class HomeTheater {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheater() {
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
        soundSystem = new SoundSystem();
    }

    public void playMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        projector.on();
        soundSystem.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");
        dvdPlayer.stop();
        soundSystem.off();
        projector.off();
    }
}

public class HomeTheaterFacade {
    public static void main(String[] args) {

        HomeTheater homeTheater = new HomeTheater();
        
        homeTheater.playMovie("Inception");
        homeTheater.endMovie();
    }
}
