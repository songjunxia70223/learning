package com.dlmu.test;

import com.dlmu.song.autobean.Cat;
import com.dlmu.song.autobean.SpringConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = SpringConfiguration.class)
@ExtendWith(SpringExtension.class)
public class CatTest {
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
