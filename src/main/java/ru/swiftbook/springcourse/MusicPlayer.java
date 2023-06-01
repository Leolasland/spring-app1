package ru.swiftbook.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class MusicPlayer {

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    private List<Music> musicList;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        int i = ThreadLocalRandom.current().nextInt(0, 3);
        int r = ThreadLocalRandom.current().nextInt(0, 3);
        return musicList.get(i).getSong().get(r);
    }

}
