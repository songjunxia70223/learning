package com.dlmu.song;

import com.dlmu.song.ProducerConsumer.Consumer;
import com.dlmu.song.ProducerConsumer.Producer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProducerConsumerTest extends JUnit{
    @Autowired
    Producer producer;
    @Autowired
    Consumer consumer;

    @Test
    public void producerConsumerTest() {
        Thread pro = new Thread(producer);
        Thread con = new Thread(consumer);
        pro.start();
        con.start();
    }
}
