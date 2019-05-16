package com.dlmu.song.aop;

import org.springframework.stereotype.Component;

@Component
public class English implements Subject{
    @Override
    public void study() {
        System.out.println("学习英语");
    }
}
