package com.dlmu.song.aop;

import org.springframework.stereotype.Component;

@Component
public class Math implements Subject{
    @Override
    public void study() {
        System.out.println("学习高数");
    }
}
