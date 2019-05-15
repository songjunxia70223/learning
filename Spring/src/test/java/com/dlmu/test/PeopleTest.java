package com.dlmu.test;

import com.dlmu.song.SpringConfiguration;
import com.dlmu.song.manual.Chinese;
import com.dlmu.song.manual.Japanese;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = SpringConfiguration.class)
@ExtendWith(SpringExtension.class)
public class PeopleTest {
    @Autowired
    Chinese chi;
    @Autowired
    Japanese jap;

    @Test
    public void chineseTest() {
        Assertions.assertEquals("你好,世界", chi.say());
        Assertions.assertEquals("改革开放", chi.study());
    }

    @Test
    public void japaneseTest() {
        Assertions.assertEquals("こんにちは,世界", jap.say());
        Assertions.assertEquals("勉強します。", jap.study());
    }
}
