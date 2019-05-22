package com.dlmu.song.ProducerConsumer;

import org.springframework.stereotype.Component;

import static com.dlmu.song.ProducerConsumer.ProducerConsumer.queue;
import static com.dlmu.song.ProducerConsumer.ProducerConsumer.times;
import static com.dlmu.song.ProducerConsumer.ProducerConsumer.MAX_SIZE;

@Component
public class Producer implements Runnable {
    @Override
    public void run() {
        do {
            synchronized (queue) {
                while (queue.size() == MAX_SIZE) {
                    try {
                        System.out.println("Queue is max");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Producer get the lock");
                System.out.println("Producer times " + times);
                queue.offer(times++);
                queue.notifyAll();
            }
        } while (times < 20);
    }
}
