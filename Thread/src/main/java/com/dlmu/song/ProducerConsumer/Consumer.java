package com.dlmu.song.ProducerConsumer;

import org.springframework.stereotype.Component;

import static com.dlmu.song.ProducerConsumer.ProducerConsumer.queue;

@Component
public class Consumer implements Runnable {

    @Override
    public void run() {
        Integer time;
        do {
            synchronized (queue) {
                while (queue.size() == 0) {
                    try {
                        System.out.println("Queue is empty");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumer get the lock");
                time = queue.poll();
                System.out.println("Consumer get the resources int is " + time);
                queue.notifyAll();
            }
        } while (time != null && time < 20);
    }
}