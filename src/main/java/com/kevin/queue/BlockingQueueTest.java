package com.kevin.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author kevin
 * @version 1.0
 * @description     测试queue队列的案例
 * @createDate 2019/3/27
 */
public class BlockingQueueTest {

    public static void main(String[] args) {

        int queueSize = 10;
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(queueSize);

        ExecutorService service = Executors.newCachedThreadPool();
        //Producer producer = new Producer(queue);
        //Consumer consumer = new Consumer(queue);

        service.submit(new Producer(queue,queueSize));
        for(int i=0;i<10;i++){
            service.submit(new Consumer(queue,queueSize));
        }

        // 程序运行10s后，所有任务停止
        /*try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }
        service.shutdownNow();*/
    }

}
