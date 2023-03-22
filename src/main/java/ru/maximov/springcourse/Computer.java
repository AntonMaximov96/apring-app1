package ru.maximov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class Computer {
    private int id;
    MusicPlayer musicPlayer;
    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
    @Override
    public String toString() {
        return "Computer: " + "id = " + id + " "+ musicPlayer.playMusic();
    }
}
