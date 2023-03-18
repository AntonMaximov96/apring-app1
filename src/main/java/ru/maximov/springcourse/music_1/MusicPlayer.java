package ru.maximov.springcourse.music_1;

public class MusicPlayer {
    private Music music;

    // Внедрение зависимости через конструктор
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}