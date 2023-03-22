package ru.maximov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.playMusic());
//        System.out.println("Album: " + musicPlayer.getName());
//        System.out.println("Value: " + musicPlayer.getVolume());

        Computer computer = context.getBean("computer", Computer.class);
        Computer computer1 = context.getBean("computer", Computer.class);
        System.out.println(computer);
        System.out.println(computer1);
        System.out.println(computer==computer1);
        context.close();
    }
}
