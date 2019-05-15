package com.dlmu.test;

import com.dlmu.song.animal.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AnimalTest extends Junit {
    @Autowired
    @Qualifier("吉娃娃")
    Animal dogJiwawa;
    @Qualifier("鹦鹉")
    @Autowired
    Animal yingwu;

    @Test
    public void dog() {
        Assertions.assertEquals("Dog is running", dogJiwawa.run());
        Assertions.assertEquals("Dog is eating", dogJiwawa.eat());
        Assertions.assertEquals("Dog is sleeping", dogJiwawa.sleep());
    }

    @Test
    public void bird() {
        Assertions.assertEquals("Bird is flying", yingwu.run());
        Assertions.assertEquals("Bird is eating", yingwu.eat());
        Assertions.assertEquals("Bird is sleeping", yingwu.sleep());
    }
}
