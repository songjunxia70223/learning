package com.dlmu.test;

import com.dlmu.song.SpringConfiguration;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = SpringConfiguration.class)
@ExtendWith(SpringExtension.class)
public class Junit {
}
