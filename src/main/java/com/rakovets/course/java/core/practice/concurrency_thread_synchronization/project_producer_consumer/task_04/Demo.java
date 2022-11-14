package com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_04;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_03.Store;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.project_producer_consumer.task_05.ConsumerThread;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo {
    public static void main(String[] args) {
        final int PRODUCER_THREAD_NUMBERS = 3;
        Deque<Integer> deque = new ArrayDeque<>();
        Store store = new Store(deque);
        for (int i = 0; i < PRODUCER_THREAD_NUMBERS; i++) {
            Thread producerThread = new ProducerThread("Producer_" + i, store);
            producerThread.start();
        }
    }
}
