package com.dlmu.test;

import com.dlmu.song.autobean.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class CatTest extends Junit {
    @Autowired
    private Cat cat;

    @Test
    public void catTest() {
        Assertions.assertNotNull(cat);
        cat.setName("miaomiao");
        Assertions.assertEquals("miaomiao", cat.getName());
    }

    @Test
    public void failTest() {

        Assertions.assertEquals(null, cat.getName());
    }
}
