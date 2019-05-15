package com.dlmu.song.animal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("鹦鹉")
public class Bird implements Animal{
    @Override
    public String run() {
        return new String("Bird is flying");
    }

    @Override
    public String eat() {
        return new String("Bird is eating");
    }

    @Override
    public String sleep() {
        return new String("Bird is sleeping");
    }
}
