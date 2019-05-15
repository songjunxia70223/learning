package com.dlmu.song.animal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("吉娃娃")
public class Dog implements Animal{

    @Override
    public String run() {
        return new String("Dog is running");
    }

    @Override
    public String eat() {
        return new String("Dog is eating");
    }

    @Override
    public String sleep() {
        return new String("Dog is sleeping");
    }
}
