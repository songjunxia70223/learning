package com.dlmu.test;

import com.dlmu.song.aop.Club;
import com.dlmu.song.aop.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AopTest extends Junit{
    @Autowired
    Subject math;
    @Autowired
    Subject english;
    @Autowired
    Club gameClub;
    @Test
    public void aopTest(){
        math.study();
        english.study();
        gameClub.play();
    }
}
