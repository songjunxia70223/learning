package com.dlmu.song.ProducerConsumer;

import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

@Component
public class ProducerConsumer {
    final static int MAX_SIZE = 5;
    final static Queue<Integer> queue = new LinkedList<>();
    static int times = 0;
}
