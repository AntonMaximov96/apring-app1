package ru.maximov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    Music music;
    Music music1;
    @Autowired
    public MusicPlayer(@Qualifier("rapMusic")  Music music, @Qualifier("rockMusic")  Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    public String playMusic() {
         return "Playing: " + music.getSong() + " and " + music1.getSong();
    }

}