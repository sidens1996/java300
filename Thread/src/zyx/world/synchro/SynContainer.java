package zyx.world.synchro;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName: SynContainer
 * @Description: 线程安全，测试操作并发容器juc
 * @Author: Achilles
 * @Date: 22/12/2019  17:18
 * @Version: 1.0
 **/

public class SynContainer {

    public static void main(String[] args) {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                copyOnWriteArrayList.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(copyOnWriteArrayList.size());
    }

}
