package com.dlmu.song.aop;

import org.springframework.stereotype.Component;

@Component
public class GameClub implements Club{
    @Override
    public void play() {
        System.out.println("五黑联盟");
    }
}
