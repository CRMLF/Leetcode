package com.zl.string;

import java.util.concurrent.*;

/**
 * @Description
 * @Author ZhengLing
 * @Date 2022/04/03 11:12
 */
public class StringTest {
//    public static void main(String[] args) {
////        String s = "wodeshijie".intern();
////        String s1 = "wodeshijie";
////        System.out.println(s==s1);
////        String s2 = new String("wodeshijie");
////        System.out.println(s==s2);
////        System.out.println(s.equals(s2));
////        System.out.println(s.hashCode()==s2.hashCode());
////        Integer integer = 2;
////        System.out.println(integer.hashCode());
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 300, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
//        threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
//        System.out.println(threadPoolExecutor.getRejectedExecutionHandler());
//    }

    private static ExecutorService pool;

    public static void main(String[] args) {
        //自定义拒绝策略
        pool = new ThreadPoolExecutor(1, 2, 1000, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory(), new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                System.out.println(r.toString() + "执行了拒绝策略");

            }
        });

        for (int i = 0; i < 10; i++) {
            pool.execute(new ThreadTask());
        }
    }
}

class ThreadTask implements Runnable {
    public void run() {
        try {
            //让线程阻塞，使后续任务进入缓存队列
            Thread.sleep(1000);
            System.out.println("ThreadName:" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
